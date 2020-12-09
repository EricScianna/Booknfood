import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

public class BooknFood {

    int scelta;
    private Scanner inputS = new Scanner(System.in);
    private Scanner inputI = new Scanner(System.in);
    private ArrayList<Prodotto> listino = new ArrayList<Prodotto>();
    private ArrayList<Prodotto> carrello = new ArrayList<Prodotto>();
    private ArrayList<Carrelli> carrelli = new ArrayList<Carrelli>();

    public void creaProdotto(int num) {
        scelta = num;
        String nome, autore;
        float prezzo;
        int durata, peso, numPagine;

        System.out.print("Inserisci il nome del prodotto: ");
        nome = inputS.nextLine();
        System.out.print("Inserisci il prezzo del prodotto: ");
        prezzo = inputI.nextFloat();
 
        if (scelta == 1) {
            System.out.print("Inserisci la durata del prodotto (in giorni): ");
            durata = inputI.nextInt();
            System.out.print("Inserisci il peso del prodotto (in grammi): ");
            peso = inputI.nextInt();
            Food nuovoFood = new Food(nome, prezzo, durata, peso);
            listino.add(nuovoFood);

        } else {
            System.out.print("Inserisci l'autore del libro: ");
            autore = inputS.nextLine();
            System.out.print("Inserisci il numero di pagine: ");
            numPagine = inputI.nextInt();
            Book nuovoBook = new Book(nome, prezzo, autore, numPagine);
            listino.add(nuovoBook);
        }
    }

    public void stampaListino() {
        if (listino.isEmpty())
            errore2();
        else {
            for (Prodotto lista : listino) {
                System.out.println(lista.getInfoProdotto());
            }
        }
        premiUnTasto();
    }

    public void mettiCarrello() {
        int posizione;
        if (listino.isEmpty()) {
            errore2();
            premiUnTasto();
        } else {
            System.out.print("Quale articolo vuoi mettere nel carrello? ");
            posizione = inputI.nextInt();
            carrello.add(listino.get(posizione - 1));
        }
    }

    public void svuotaCarrello() {
        carrello.clear();
        System.out.print("\nCarrello svuotato.");
        premiUnTasto();
    }

    public void eliminaUltimoProdotto() {

        if (gettotaleCarrello() != 0)
            carrello.remove(carrello.get(carrello.size() - 1));
        else
            errore1();
    }

    public void eliminaProdotto() {
        int posizione;

        if (carrello.isEmpty()) {
            errore1();
        } else {
            System.out.print("Quale prodotto vuoi eliminare? ");
            posizione = inputI.nextInt();
            carrello.remove(carrello.get(posizione - 1));
        }
    }

    private int gettotaleCarrello() {
        int totale = 0;
        for (int i = 0; i < carrello.size(); i++) {
            totale += carrello.get(i).getPrezzo();
        }
        return totale;
    }

    public void stampaCarrello() {

        if (carrello.isEmpty()) {
            errore1();
        } else {
            System.out.println("---CARRELLO---");

            for (int i = 0; i < carrello.size(); i++) {
                System.out.println(
                        "Articolo: " + carrello.get(i).getNome() + " |Prezzo: " + carrello.get(i).getPrezzo() + "€.");
            }
            System.out.println("Totale: " + gettotaleCarrello() + "€.");
            premiUnTasto();
        }
    }

    public void salvaCarrello() {

        for (int i = 0; i < carrello.size(); i++) {
            Carrelli nuovoCarrelli = new Carrelli(carrello.get(i).getPrezzo(), carrello.get(i).getNome());
            carrelli.add(nuovoCarrelli);
        }
    }

    public void totaleCarrelli() {

        int totale = 0;
        for (int i = 0; i < carrelli.size(); i++) {
            totale += carrelli.get(i).getPrezzo();
        }
        System.out.println("Il totale fatturato è di: " + totale + "€.");
        premiUnTasto();
    }

    private void premiUnTasto() {
        System.out.print("\nPremi un tasto qualsiasi per continuare ");
        String x = inputS.nextLine();
    }

    private void errore1() {
        System.out.print("\nIl carrello è vuoto.");
        premiUnTasto();
    }

    private void errore2() {
        System.out.print("\nNon hai ancora inserito niente nel listino.");
    }

}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean intero;
        int menu = 0;
        BooknFood booknFood = new BooknFood();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("------------------");
            System.out.println(
                    "Seleziona operazione da effettuare:\n0- Chiudi\n1- Aggiungi libro a listino\n2- Aggiungi cibo a listino\n3- Stampa il listino\n4- Svuota carrello\n5- Aggiungi un prodotto al carrello\n6- Stampa gli oggetti nel Carrello\n7- Elimina ultimo prodotto del carrello\n8- Elimina un prodotto dal carrello\n9- Salva carrello\n10- Stampa totale dei carrelli");

            menu = input.nextInt();

            switch (menu) {
                case 1:
                    booknFood.creaProdotto(2);
                    break;
                case 2:
                    booknFood.creaProdotto(1);
                    break;
                case 3:
                    booknFood.stampaListino();
                    break;
                case 4:
                    booknFood.svuotaCarrello();
                    break;
                case 5:
                    booknFood.mettiCarrello();
                    break;
                case 6:
                    booknFood.stampaCarrello();
                    break;
                case 7:
                    booknFood.eliminaUltimoProdotto();
                    break;
                case 8:
                    booknFood.eliminaProdotto();
                    break;
                case 9:
                    booknFood.salvaCarrello();
                    break;
                case 10:
                    booknFood.totaleCarrelli();
                    break;
                default:
                    System.out.println("Arrivederci.");
            }
        } while (menu != 0);
    }
}

public class Book extends Prodotto {
    private String autore;
    private int numPagine;

    Book(String nome, float prezzo, String autore, int numPagine) {
        super(nome, prezzo);
        this.autore = autore;
        this.numPagine = numPagine;
    }

    public String getAutore() {
        return autore;
    }

    public int getNumPagine() {
        return numPagine;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setNumPagine(int numPagine) {
        this.numPagine = numPagine;
    }

    public String getInfoProdotto() {
        String txt = super.getInfoProdotto();
        txt += "\nL'autore del libro è: " + autore + "| Numero di pagine: " + numPagine + ".";
        return txt;
    }
}

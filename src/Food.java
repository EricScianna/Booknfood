public class Food extends Prodotto {

    private int durata, peso;

    Food(String nome, float prezzo, int durata, int peso) {
        super(nome, prezzo);
        this.durata = durata;
        this.peso = peso;
    }

    public int getDurata() {
        return durata;
    }

    public int getPeso() {
        return peso;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
 
    public String getInfoProdotto() {
        String txt = super.getInfoProdotto();
        txt += "\nL'articolo scadrà tra: " + durata + " giorni" + "| Il suo peso è di: " + peso
                + " grammi.";
        return txt;
    }

}

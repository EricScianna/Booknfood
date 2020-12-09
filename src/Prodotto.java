public class Prodotto {

    private String nome;
    private float prezzo;

    public String getNome() {
        return nome;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public Prodotto(String nome, float prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getInfoProdotto() {
        String txt = "";
        txt += "----------------" + "\nArticolo: " + nome + " |Prezzo: " + prezzo + "€.";
        return txt;
    }
}

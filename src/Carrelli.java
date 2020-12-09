public class Carrelli {
    private float prezzo;
    private String nome;

	public Carrelli(float prezzo2, String nome) {
        this.prezzo=prezzo2;
        this.nome=nome;
	}

	public float getPrezzo() {
        return prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

}

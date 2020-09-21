package principal;

public class Item {
	private String nom;
	private float poids;
	private float valeur;
	private boolean stock�;

	public Item(String n, float p, float v) {
		this.nom = n;
		this.poids = p;
		this.valeur = v;
		this.stock� = false;
	}

	public float getPoids() {
		return poids;
	}

	public float getValeur() {
		return valeur;
	}

	public boolean getStock�() {
		return stock�;
	}

	public void setStock�(boolean stock�) {
		this.stock� = stock�;
	}

	@Override
	public String toString() {
		return nom + ", " + poids + ", " + valeur;
	}
}

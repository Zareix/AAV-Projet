package principal;

/**
 * <b>Item est la classe repr�sentant un objet du sac</b>
 * <p>
 * Un Item est caract�ris� par les informations suivantes :
 * <ul>
 * <li>Un nom</li>
 * <li>Un poids</li>
 * <li>Une valeur</li>
 * <li>Un boolean pour savoir s'il est stock� ou non</li>
 * </ul>
 * </p>
 *
 */
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

	/**
	 * @return poids de l'item
	 */
	public float getPoids() {
		return poids;
	}

	/**
	 * @return valeur de l'item
	 */
	public float getValeur() {
		return valeur;
	}

	/**
	 * Retourne si l'item est stock� ou non
	 * 
	 * @return true si l'item est stock� ou false si l'item n'est pas stock�
	 */
	public boolean getStock�() {
		return stock�;
	}

	/**
	 * Change la situation de stockage de l'item
	 * 
	 * @param stock� : true si l'item est stock� ou false si l'item n'est pas stock�
	 */
	public void setStock�(boolean stock�) {
		this.stock� = stock�;
	}

	/**
	 * toString permettant d'afficher l'ensemble des donn�es des items Utilis� pour
	 * les tests mais d�sormais inutile
	 * 
	 * @deprecated
	 * @return
	 */
	public String toStringFull() {
		return nom + ", " + poids + ", " + valeur;
	}

	@Override
	public String toString() {
		return nom;
	};
}

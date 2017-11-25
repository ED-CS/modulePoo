
public class Livre {
	private int numero;
	private String titre;
	private String auteur; 
	private int page;
	
	
	public Livre(int numero, String titre, String auteur, int page){
		this.numero = numero;
		this.auteur = auteur ;
		this.page = page;
		this.titre = titre;
	}
	
	public void afficher(){
		System.out.println("le numéro est: " + numero +", le titer de cette livre: " + titre + ", Auteur: " + auteur + ", Nombre page: " + page);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
}


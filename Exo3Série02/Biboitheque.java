
public class Biboitheque {
	private int capacit�;
	private Livre livre[];
	private int cpt1 = 0;
	
	public Biboitheque(int capacit�){
		this.capacit� = capacit�;
		this.livre = new Livre[capacit�];
	}
	
	public void afficherLivres(){
		for(int i = 0; i < capacit�; i++){
		this.livre[i].afficher();
		}
	}
	
	public void retournLive(int i){
		if (i < this.capacit�){
			this.livre[i].afficher();
		}
	}
	
	public boolean ajouter (Livre liv){
		if (this.cpt1 <= this.capacit�){
			this.livre[cpt1] = liv;
			this.cpt1++;
			return true ;
		}else{
			return false;
		}
	}
	
	public boolean supprimer(Livre liv){
		int i = 0;
		while(i < capacit� && liv.getTitre()!=livre [i].getTitre()){
			i++;
		}
		if(i == capacit�){
			return false;
		}else{
			livre [i] = null;
			return true;
		}
	}
	public void afficherAuteurs(){
		for(int i = 0; i < capacit�; i++){
		this.livre[i].getAuteur();
		}
	}
}

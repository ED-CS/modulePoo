
public class Biboitheque {
	private int capacité;
	private Livre livre[];
	private int cpt1 = 0;
	
	public Biboitheque(int capacité){
		this.capacité = capacité;
		this.livre = new Livre[capacité];
	}
	
	public void afficherLivres(){
		for(int i = 0; i < capacité; i++){
		this.livre[i].afficher();
		}
	}
	
	public void retournLive(int i){
		if (i < this.capacité){
			this.livre[i].afficher();
		}
	}
	
	public boolean ajouter (Livre liv){
		if (this.cpt1 <= this.capacité){
			this.livre[cpt1] = liv;
			this.cpt1++;
			return true ;
		}else{
			return false;
		}
	}
	
	public boolean supprimer(Livre liv){
		int i = 0;
		while(i < capacité && liv.getTitre()!=livre [i].getTitre()){
			i++;
		}
		if(i == capacité){
			return false;
		}else{
			livre [i] = null;
			return true;
		}
	}
	public void afficherAuteurs(){
		for(int i = 0; i < capacité; i++){
		this.livre[i].getAuteur();
		}
	}
}

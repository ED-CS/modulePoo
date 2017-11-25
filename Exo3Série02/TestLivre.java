import java.util.Scanner;
public class TestLivre{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Livre liv1 = new Livre(231,"abA","vfda",21);
		Livre liv2 = new Livre(232,"abB","vfdb",22);
		Livre liv3 = new Livre(233,"abC","vfdc",23);
		Livre liv4 = new Livre(234,"abD","vfdd",24);
		Biboitheque bib = new Biboitheque(4);
		if(bib.ajouter(liv1) == true){
			System.out.println("l'ajout fait avec succes");
		    bib.retournLive(0);

		}else{
			System.out.println("l'ajout n'est pasfait avec succes");
		}
	}
}

package td3;
import java.util.Scanner;
public class CalculMoyenne {

	public static void main(String[] args) {
		

		
		/*Scanner scanner = new Scanner(System.in);
		int nb=scanner.nextInt();
		if (nb>0 && nb<=Tab.getNMAX())*/
		int nb=5;
		
		float[] noteCtrl=new float[nb];
		float[] noteExam=new float[nb];
		float[] tabMoy=new float[nb];
			
		Tab.remplir(noteCtrl);
		Tab.remplir(noteExam);
		Tab.lister(noteCtrl);
		Tab.lister(noteExam);
		


		tabMoy=Tab.additionner(noteCtrl,Tab.produit(2,noteExam));
        tabMoy=Tab.produit(1/3,tabMoy);
		System.out.println("les moyennes de tous les etudiants : \n");
		Tab.lister(tabMoy);
		
        float moyClass=Tab.somme_element(tabMoy)/30;
		System.out.println("la moyenne de la classe est : "+moyClass);
		
		Tab.additionner(3/2,noteCtrl);
		System.out.println("le tableau de note de controle apres que l'enseignant ajouter un bonnus a tous");
		Tab.lister(noteCtrl);
		
		
		
			
		
		
		
		
		
		
	}

}

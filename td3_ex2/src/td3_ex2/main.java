package td3_ex2;

public class main {

	public static void main(String[] args) {
		
		Dictionnaire d=new Dictionnaire("Larousse",5);
		MotDico m1=new MotDico("abondonner","laisser sans soin");
		MotDico m2=new MotDico("actif","agit beaucoup");
		MotDico m3=new MotDico("abondonnement","laisser sans soin");
		d.ajouterMot(m1);
		d.ajouterMot(m2);
		d.ajouterMot(m3);
		d.listerDico();
		System.out.println(d.chercherMot("la"));
	System.out.println("la position de mot actif est "+d.chercherMot("actif"));
		System.out.println("le nombre de synonymes de  est "+d.nbSynonymes(m1));
		System.out.println("\n*************\n");
		d.supprimerMot("la");
		System.out.println("\n*******apres la suppresion *******\n");
		d.supprimerMot("actif");
		d.listerDico();
		
		

	}

}

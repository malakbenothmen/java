package TD4;

public class testLib {

	public static void main(String[] args) {
		Librairie l=new Librairie(4);
		Livre l1=new Livre("Sur tes traces","suspence",123,150);
		Livre l2=new Roman("le nouveau","policier",101,332,"Keigo Higashino","edit1");
		Livre l3=new magazine("fables de la fontaine","litterature",102,18,"decembre");
		l.ajoutLiv(l1);
		l.ajoutLiv(l2);
		l.ajoutLiv(l3);
		l.inventaire();
		System.out.println("\n***on ajoute un Roman***");
		Livre l4=new Roman("les clés de la confiance en soi","bien etre",103,22,"marie","vivilab");
		l.ajoutLiv(l4);
		l.inventaire();
		l.inventaire("Roman");
		if (l.acheterRom()==0)
		{ System.out.println("**il n'y a pas des Roman pour ce moment ***\n");}
		else 	
		{System.out.println("\n **le montant pour acheter tous les romans***\n");
			System.out.println("Montant= "+String.format("%.4f",l.acheterRom()));}
		
		l.inventaire("mafamech");
		
		Livre l5=new magazine("voyage","enfant",104,39,"nouvembre");
		System.out.println("\n***on veut ajouter un magazine**\n");
		l.ajoutLiv(l5);
		/*dans ce cas ,on peut supprimer un livre ou changer la capacité "*/
		
		l.suppLiv(123);
		System.out.println("\n***apres la suppression de premier livre***");
		l.inventaire();
		System.out.println("\n*****on ajoute donc le magazine***");
		l.ajoutLiv(l5);
		/*System.out.println(l.getNb());*/
		l.inventaire();
		

	}

}

package tp5;

public class Entreprise {
	public static void main(String[] args) {
		Salerie tabSalarie[];
		tabSalarie=new Salerie[5];
		Salerie s=new Employe(12345,"Walid",2002,15,4);
		Salerie s1=new Vendeur(23445,"Yessine",2007,1000,0.1);
		Salerie s2=new Vendeur(65478,"Nassime",2000,700,0.1);
		Salerie s3=new Employe(87698,"Aymen",2003,19,5);
		Salerie s4=new Employe(12345,"Khaled",2008,7,4);
		tabSalarie[0]=s;
		tabSalarie[1]=s1;
		tabSalarie[2]=s2;
		tabSalarie[3]=s3;
		tabSalarie[4]=s4;
		System.out.println("*****************Liste des Employés**************\n");
		for(int i=0;i<tabSalarie.length;i++)
		{if(tabSalarie[i] instanceof Employe)
			{tabSalarie[i].affiche();}
		}
		System.out.println("*************************************************\n");
		
		
		System.out.println("*****************Liste des Vendeurs**************\n");
		for(int i=0;i<tabSalarie.length;i++)
		{if(tabSalarie[i] instanceof Vendeur)
			{tabSalarie[i].affiche();}
		}
		System.out.println("**************************************************\n");
		
		Salerie min=tabSalarie[0];
		for(int i=0;i<tabSalarie.length;i++)
		{if (tabSalarie[i].getRecrutement()<min.getRecrutement())
			 {min=tabSalarie[i];}
		}
		System.out.println("******Nom du salarie le plus ancien dans lentreprise ***************\n");
		System.out.println("Nom:"+min.getNom()+" recruté en l'an "+min.getRecrutement());
		System.out.println("**************************************************\n");
		
		System.out.println("********** Matricule du vendeur disposant du plus grand salaire ***************\n");
		
		Salerie pers=null;
		for(int i=0;i<tabSalarie.length;i++)
		{if(tabSalarie[i] instanceof Vendeur)
		{  if(pers==null)
		      {pers=tabSalarie[i];}
		
		else if (tabSalarie[i].Salaire()>pers.Salaire())
			{pers=tabSalarie[i];}
		}
		}
		System.out.println("Matricule= "+pers.getMatricule()+" de Salaire= "+pers.Salaire());
		System.out.println("**************************************************\n");
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
	
	

	}

}

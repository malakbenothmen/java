package TD4;

public class Librairie {
	private Livre liste[];
	private int capacite;
	private int nb;
	
	
	
	Librairie(int max)
	{  this.capacite=max;
		this.liste=new Livre[this.capacite];}
	
	int getNb()
	{return this.nb;}
	
	void inventaire()
	{   System.out.println("***la liste de tous les livres***\n");
		for(int i=0;i< nb;i++)
		{if (liste[i] != null)
		System.out.println(liste[i]+" Prix: "+String.format("%.4f",liste[i].calculePrix()));}
	}
	void inventaire(String categ)
	{	System.out.println("\n ***la liste des "+categ+"***\n");
		    boolean exicts=false;
	        for(int i=0;i<this.nb;i++)
			{
	        	if(liste[i].getClass().getSimpleName().equals(categ))
			{   exicts=true;
				System.out.println(liste[i]+" Prix: "+String.format("%.4f",liste[i].calculePrix()));}
			}
	        if (!exicts)
	        	System.out.println("Desolé! cette categorie n'exicte pas");       	
	}
	
	void ajoutLiv(Livre liv)
	{if(nb <this.capacite)
	{ 
	    liste[nb]=liv;
	    nb ++;}
	else
		System.out.println("impossible d'ajouter un livre ,librairie atteint la capacite maximale");
	}
	
	void suppLiv(int num)
	{
	for(int i=0;i<this.nb;i++)
		{if(liste[i].id==num)
		{for(int j=i;j<this.nb-1;j++)
		{liste[j]=liste[j+1];}}
		}
	
	this.nb--;
	}

	double acheterRom()
	{	double montant=0;
		for(int i=0;i<this.nb;i++)
	    {if(liste[i] instanceof Roman)
	       {montant+=liste[i].calculePrix();}
	    }
		return montant;
	}
	



}

package tp5;

public class Salerie {
   protected int Matricule;
   protected String nom ;
   protected double recrutement;
	
	Salerie()
	{};
	Salerie(int m,String nom,double rec)
	{this.Matricule=m;
	this.nom=nom;
	this.recrutement=rec;}
	
	int getMatricule()
	{return this.Matricule;}
	String getNom()
	{return this.nom;}
	
	double getRecrutement()
	{return this.recrutement;}
	
	
	void setMatricule(int mat)
	{this.Matricule=mat;}
	
	void setNom(String nom)
	{this.nom=nom;}
	void setRecrutement(double rec)
	{this.recrutement=rec;}
	
	public String toString()
	{return "Matricule= "+this.Matricule+", Nom= "+this.nom+" Rectrutement= "+this.recrutement; }
	
	void affiche()
	{  System.out.println(this.getClass().getSimpleName());
		System.out.println(this);}
	
	double Salaire()
	{if(this.recrutement<=2005)
		return 400.0;
	else
		return 280.0;
	}

}

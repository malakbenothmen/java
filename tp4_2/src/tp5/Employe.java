package tp5;

public class Employe extends Salerie {
	private double Hsupp;
	private double PHsupp;
	
	
	Employe(int m,String nom,double rec,double h,double ph)
	{super(m,nom,rec);
	 this.Hsupp=h;
	 this.PHsupp=ph;}
	
	
	double getHsupp()
	{return this.Hsupp;}
	
	double getPHsupp()
	{return this.PHsupp;}
	
	void setHsupp(double h)
	{this.Hsupp=h;}
	void setPHsupp(double ph)
	{this.PHsupp=ph;}

@Override()
public void affiche()
{super.affiche();
System.out.println("Hsupp= "+this.Hsupp+", PHsupp= "+this.PHsupp+"\n");
}

public double Salaire()
{return super.Salaire()+Hsupp*PHsupp;}


	
	
	

}

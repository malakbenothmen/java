package tp4;

public class Vehicule {
	private int num;
	private String marque, modele;
	private int ann;
	private double prix;
	static int count;
	
	Vehicule(String marque,String modele,int annee,double prix)
	{
	count++;
	num=count;
	this.marque=marque;
	this.modele=modele;
	this.ann=annee;
	this.prix=prix;}
	
	String getMarque()
	{ return this.marque;}
	String getModele()
	{return this.modele;}
	double getprix()
	{return this.prix;}
	
	int getCount()
	{return this.count;}
	int getAnnee()
	{return this.ann;}
	
	
	void setMarque(String marque)
	{this.marque=marque;}
	
	void setModele(String modele)
	{this.modele=modele;}
	void setPrix(double Prix)
	{if (Prix>0)
		{this.prix=Prix;}
	else 
		{System.out.println("impossible prix negative");}
	}
	
	
	public String toString()
	{return "le Numero de vehicule :"+num+"\n le modele: "+this.modele+" \n marque: "+this.marque+"\n l'année de creation:"+this.ann+" \n Prix :"+this.prix ;}
	
	void decrisvehicule()
	{System.out.println(this);}
	
	
	

}

package iset.dsi2.animalerie;

public class Chien extends Animal{
	private String race;
	
	Chien()
	{}
	
	Chien(String color, int p,String r)
	{super(color,p);
	this.race=r;}
	
	
	String getRace()
	{return this.race;}
	
}

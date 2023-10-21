package TD4;

public class Livre {
	protected String title,domaine;
	protected int id,nbPage;
	protected final double TVA=0.1;
	
	Livre()
	{}
	Livre(String title,String d,int id,int nb)
	{this.title=title;
	this.domaine=d;
	this.id=id;
	this.nbPage=nb;
	}
	public String toString()
	{return "c'est un "+this.getClass().getSimpleName()+" titre: "
	+this.title+", id: "+this.id+", Domaine: "+this.domaine+", nombre de pages: "+this.nbPage;
	}
	
	double calculePrix()
	{return (0.075*this.nbPage)*(1+this.TVA);
	}
	
	
}

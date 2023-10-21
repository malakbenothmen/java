package td3_ex2;

public class Dictionnaire {
  private int nbMots;
  private MotDico[] dico;
  private String nom;
  
  
  Dictionnaire(String nom,int nb)
  {  this.nom=nom;
  
	  dico=new MotDico[nb];}
  
  void ajouterMot(MotDico m)
  { 
	  dico[nbMots]=m;
	  nbMots++;}
  
  void supprimerMot(String ch)
  {int i=0;
  while(ch!=dico[i].getMot() && i<nbMots-1) {
	  i++;
  }
  if(ch == dico[i].getMot())
  { for(int j=i;j<nbMots-1;j++)
	  {dico[j]=dico[j+1];
       dico[j].setnum(dico[j].getNum()-1);} 
    nbMots--;
  }
  
  else 
	  System.out.println("le dicionnaire ne contient pas ce mot ");
   }
  
  
  int chercherMot(String ch)
  {  int i=0;
    while(ch!=dico[i].getMot() && i<nbMots-1) {
	  i++;
  }
  if(ch==dico[i].getMot())
	  return i;
  else
	  return -1;
  
  }
  
  void listerDico()
  {
	  System.out.println("Nom de dictionnaire :"+nom+"\n nbMots ="+this.nbMots+"\n le tableau de mots :");  
   for(int i=0;i<nbMots;i++)
  {System.out.println(dico[i]);
	   System.out.println("\n********\n");}
  }
  int nbSynonymes(MotDico m) 
  {int nb=0;
  for(int i=0;i<nbMots;i++)
  {if(dico[i].synonyme(m))
	  nb++;}
  return nb;
  }
  
 
  
  

  
  
  
  
}
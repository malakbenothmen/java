package tp4_1;

public class PointCol extends Point{
 private String color;
 
 
 PointCol()
 {super();}
 
 PointCol(char nom,int a,int b,String c)
 {super(nom,a,b);
  this.color=c;
 }
 String getColor()
 {return this.color;}
 
 void setColor(String c)
 {this.color=c;}
 @Override
 void afficher()
 {super.afficher();
 System.out.println("  COULEUR :"+this.color);
 }
 
 
 
 
 
 
}

package td3_ex2;

public class MotDico {
  static int count;
  private int num;
  private String mot;
  private String def;
  
  
  MotDico()
  {count++;
  this.num=count;}
  
  MotDico(String m)
  {this();
  this.mot=m;}
  
  MotDico(String m,String def)
  {this(m);
  this.def=def;}
  
  
  
  String getMot()
  {return mot;}
  
  String getDefinition()
  {return def;}
  int getNum()
  {return num;}
  
  void setnum(int num)
  {this.num=num;}
  
  
  void setDefintion (String s)
  {this.def=s;}
  
  void setMot(String s)
  {this.mot=s;}
  
  boolean synonyme(MotDico m)
  {return this.def==m.def;}
  
	public String toString()
	{return "le Numero de MOT :"+num+"\n Mot: "+this.mot+" \n definiton: "+this.def;}
  
  
}

package td3;
import java.util.Scanner;
public class Tab {
	
	static private final int NMAX=40;
	

    static int getNMAX()
    {return NMAX;}
	
	static void remplir(float t[])
	{ Scanner scanner = new Scanner(System.in);
	  for(int i=0;i<t.length ; i++)
		  {float c =scanner.nextFloat();}  
	}
	
	static float somme_element (float t[])
	 {float s=0;
	 for(int i=0;i<t.length;i++)
	  {s+=t[i];}
	  return s;
	 }
	
	static float[] additionner (float t1[], float t2[])
    {int i=0;
    int taille;
    float t3[]=new float[40];
	if (t1.length<=t2.length)
		taille=t2.length;
	else
		taille=t1.length;
	for(i=0;i<taille;i++)
	 {t3[i]=t1[i]+t2[i];}
	return t3;
}
	
	static float[] produit(float x,float t[])
	{for(int i=0;i<t.length;i++)
		{t[i]=t[i]*x;}
	return t;
	
	}
	
	static void lister(float t[])
	{ for(int i=0;i<t.length;i++)
	{System.out.println(t[i]);}	
	}
	
	static float[] additionner(float x, float t[])
	{for(int i=0;i<t.length;i++)
	{t[i]+=x;}
	return t;}
	
	
	
	
	
    
	

    
}

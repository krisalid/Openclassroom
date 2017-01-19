package wiederholung_java.ville;

import java.util.Scanner;

public class Rappel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		regexpression();
		test2();
		//ReadLine();
		Forschleife();
}
	
public static void test1()
{
	int i = 0, nbre = 0;
	while(i <= 9)
	 {
	     for (int j = 0; j < 10; j++)
	        nbre++;
	    	 
	     i++;
	}
	System.out.println(nbre);
}
public static void regexpression()
{
	int a = 10, b = 20;
	int max = (a < b) ? ((b < 20) ? b * 2 : ((b > 20) ? b % 3 : b / 4) ) : ((a == 10) ? a / 2 : a % 3);
	System.out.println(max);
}

public static void test2()
{
	 int i = 10;
	 int j = 12; 
	 int k = 0; 
	 k = (i*i)*(j*j)/j+i;
	 int entier = 0xFE;
	 System.out.println("entier = " + entier);
}

public static void ReadLine()
{
	String prenom;
	char reponse = 'O';
	Scanner sc = new Scanner(System.in);
	while (reponse == 'O')
	{
	  System.out.println("Donnez un prénom : ");
	  prenom = sc.nextLine();
	  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");                        
	  //Sans ça, nous n'entrerions pas dans la deuxième boucle
	  reponse = ' ';
	                        
	  //Tant que la réponse n'est pas O ou N, on repose la question
	  while(reponse != 'O' && reponse != 'N')
	  {
	    //On demande si la personne veut faire un autre essai
	    System.out.println("Voulez-vous réessayer ? (O/N)");
	    reponse = sc.nextLine().charAt(0);
	  }
	}
	System.out.println("Au revoir…");
	
}

public static void Condition()
{
	int i = 0;
	if (i < 0) 
	  System.out.println("Ce nombre est négatif !");      
	  
	else if(i > 0)
	  System.out.println("Ce nombre est positif !");           
	 
	else  
	  System.out.println("Ce nombre est nul !");
	
}

public static void Forschleife()
{
	String tab[][] = {{"toto", "titi", "tutu"}, {"tata", "tete", "tyty"}};
	 
	for(String str[] : tab)
	{
	 	for(String str2 : str)
	 	{
	     	System.out.println("La valeur est  = " + str2);
	 	}
	 
	}
	System.out.println("///////////////////////////////");
	
	String tab1[][]={{"toto", "titi", "tutu", "tete", "tata"}, {"1", "2", "3", "4"}};
	int i = 0, j = 0;
	 
	for(String sousTab[] : tab1)
	{
	  i = 0;
	  for(String str : sousTab)
	  {     
	    System.out.println("La valeur de la nouvelle boucle est  : " + str);
	    System.out.println("La valeur du tableau à l'indice ["+j+"]["+i+"] est : " + tab1[j][i]);
	    i++;
	  }
	  j++;
	}
	
	
}





}

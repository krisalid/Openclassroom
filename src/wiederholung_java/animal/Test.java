package wiederholung_java.animal;

public class Test {
	 
	  public static void main(String[] args) {

	    //Les m�thodes d'un chien 
	    Chien c = new Chien("Gris bleut�", 20);
	    c.boire();
	    c.manger();
	    c.deplacement();
	    c.crier();
	    System.out.println(c.toString());
				
	    System.out.println("----Les m�thodes de l'interface------------");
	    //Les m�thodes de l'interface
	    c.faireLeBeau();
	    c.faireCalin();
	    c.faireLechouille();
			
	    System.out.println("-Utilisons le polymorphisme de notre interface-");
	    //Utilisons le polymorphisme de notre interface
	    Rintintin r = new Chien();
	    r.faireLeBeau();
	    r.faireCalin();
	    r.faireLechouille();
	  } 
	}
package wiederholung_java.z_army;

public class Sniper extends Personnage{
	  public void combattre() {
	    if(this.armes.equals("fusil � pompe"))
	      System.out.println("Attaque au fusil � pompe !");
	    else
	      System.out.println("Je me sers de mon fusil � lunette !");
	  }
	}
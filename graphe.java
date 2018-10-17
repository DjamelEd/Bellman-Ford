package master;

public class graphe {
	
	private static int Poids[];            // La declaration de l'attributs Poids qui represente le poids de chaque sommet
    private static int Nombre_de_sommets;  // La declaration de l'attributs Nombre des sommets
    
    public static final int MAX_VALUE = 10000000; // Une grand valeur(l'infini)
    
    
    
    public static void Graphe (int Nombre_de_sommets){
    	 graphe.Nombre_de_sommets=Nombre_de_sommets;
    	 Poids = new int[Nombre_de_sommets];	       // la taille de la liste du poids = le nombre du sommets
    }

	public static int[] getPoids() {
		return Poids;
	}

	/*public void setPoids(int poids[]) {
		Poids = poids;
	}*/

	public static int getNombre_de_sommets() {
		return Nombre_de_sommets;
	}

	/*public static void setNombre_de_sommets(int nombre_de_sommets) {
		Nombre_de_sommets = nombre_de_sommets;
	}*/
    
    
}

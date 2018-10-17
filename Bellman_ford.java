package master;
import master.graphe;

public class Bellman_ford {
	
	static int  Nombre_de_sommets = graphe.getNombre_de_sommets();

	static int[] poids = graphe.getPoids();
	
	
	 public static void BellmanFord(int sommet_source, int matrice_poids[][])
      {
		 
		 
       //----------------------------------------------- PARTIE 1 ------------------------------------------------------//
		 
	        for (int i = 0; i < Nombre_de_sommets; i++) {   poids[i] = graphe.MAX_VALUE; }  // l'initialisation de tout les poids par la valeur MAX (l'infini)

	   //----------------------------------------------- PARTIE 2 ----------------------------------------------------//
	        
	        poids[sommet_source] = 0; // le poids de sommet source est toujours = 0

	   //----------------------------------------------- PARTIE 3 -----------------------------------------------------//  
	        
	        /*
	         * Cette partie est pour " La relaxation " 
	         */
	        
	        for (int i = 0; i < Nombre_de_sommets - 1; i++)
	        {
	            for (int j = 0; j < Nombre_de_sommets; j++)
	            {
	                for (int k = 0; k < Nombre_de_sommets; k++)
                    {
	                    if (matrice_poids[j][k] != graphe.MAX_VALUE) // c-à-d la distance entre deux sommet differents != 0
                        {
	                        if (poids[k] > poids[j] + matrice_poids[j][k]) // Si le poids de cette sommet est > le poids du sommets précedent + la distance entre ces deux sommets alors :

	                            poids[k] = poids[j] + matrice_poids[j][k];
	                    }
	                }
	            }
	         }

	    //-------------------------------------------------- PARTIE 4 --------------------------------------------------//
            /*
             * Cette partie est pour " La detection des cycles absorbant "
             * On rajoute une autre itération
             */
	        
	        for (int j = 0; j < Nombre_de_sommets; j++)
	        {
	            for (int k = 0; k < Nombre_de_sommets; k++)
	            {
	                if (matrice_poids[j][k] != graphe.MAX_VALUE)
	                {
	                    if (poids[k] > poids[j] + matrice_poids[j][k])

	                        System.out.println("Le graphe contient un cycle absorbant \n");
	                        
	                }
	            }
	        }

        //---------------------------------------------------- PARTIE 5 ------------------------------------------------//	 
            /*
             * L'affichage du resultat finale
             */
	        for (int sommet = 0; sommet < Nombre_de_sommets; sommet++)
	        {
	            System.out.println("La distance entre le sommet source [ " + (sommet_source+1) + " ] et le sommet  [ " + (sommet+1) + " ] est " + poids[sommet]);
	            System.out.println("\n");
	        }

	    }


}

package master;

/*
 * Ce TP est réalisé le 05/04/2017 par " YAGOUB Djamel Eddine "
 * Module : Recherche operationnel 
 * Spécialité : Master ISI
 */

import master.graphe;
import master.Bellman_ford;

import java.util.Scanner;

/*
 * la classe "main" est la classe principale
 */

public class main {

	
	public static void main(String[] args) {
		
		int Nombre_de_sommets = 0;                    // La declaration et l'initialitation de Nombre de sommets par la valeur 0 
        int sommet_source;                            // La declaration de l'attribut sommet_source          
        int src;                                      // La declaration de l'attribut src
        Scanner sc = new Scanner(System.in);          // Pour saisie les valeurs
        
        //-------------------------------------------------- PARTIE 1 -------------------------------------------------------------//
        
        System.out.println("\n============================================================================== \n");
        
        /*
         * Cette partie est pour la saisie du nombre de sommets du graphe 
         */
        
        System.out.println("Entrez le nombre de sommets : \t");
        Nombre_de_sommets = sc.nextInt();
        
        System.out.println("\n============================================================================== \n");
        
        //--------------------------------------------------- PARTIE 2 ----------------------------------------------------------//
        
        /*
         * Cette partie est pour la saisie les valeurs de la matrice du poids
         */
        
        int matrice_poids[][] = new int[Nombre_de_sommets][Nombre_de_sommets];   // La demontion de la matrice du poids est toujours : (matrice carré) nombre de sommets * nombre de sommets 

        System.out.println("Entrer la matrice de poids : \n");

        for (int i = 0; i < Nombre_de_sommets; i++)
        {
            for (int j = 0; j < Nombre_de_sommets; j++)
            {
            	matrice_poids[i][j] = sc.nextInt();   // La saisie

 	            if (i == j) { matrice_poids[i][j] = 0; }  // La distance entre un sommet et lui meme est toujours = 0

                if (matrice_poids[i][j] == 0){ matrice_poids[i][j] = graphe.MAX_VALUE;} // Si la distance entre deux sommets different = 0 , cette distance va etre = MAX_VALUE
            }
        }

        //-------------------------------------------------- PARTIE 3 --------------------------------------------------------------//
        
        /*
         * Dans cette partie on choisie le sommet source
         */
        System.out.println("\n============================================================================== \n");

        System.out.println("Entrer le sommet source : (Remarque : la numération des sommets commence du 1)  \t");
        src = sc.nextInt();
        
        sommet_source = src - 1;
        
        System.out.println("\n============================================================================== \n");
        
        //--------------------------------------------------- PARTIE 4 --------------------------------------------------------------//
        
        /*
         * Cette partie pour les calcules ( c à d : une apple à les fonction qui on a deja crée dans les classes "graphe" et "Bellman_ford"
         */
        
        graphe.Graphe(Nombre_de_sommets);
        Bellman_ford.BellmanFord(sommet_source, matrice_poids);

        

        sc.close();	


	}

}

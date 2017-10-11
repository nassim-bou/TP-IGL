/*
    Author : Amine Athmani
    Date : 11/10/2017
 */


public class VectorHelper  { // Fournir des fonctions sur les vecteurs
	
	public static int[] Sommer (int tab1[], int tab2[]){ // Sommer deux tableau case par case et génere un troisieme tableau
		int tabInter [] = null ;
		try{
			if (tab1.length != tab2.length)
				throw new VectorDifferentSizeException(); // Lancer une exception ( taille differente )
			tabInter = new int [tab1.length*2];
			for (int i=0 ; i <tab1.length ; i++) // sommer case par case
				tabInter[i]= tab1[i] + tab2[i];
			
		}catch  (VectorDifferentSizeException e){ // catch the exception
			e.printStackTrace();
		}
		return tabInter;
	}
	
	
	public static int[] maxMin (int tab1[]){ // tab[0] est le max , tab[1] est le min
		int tabInt[]= new int[2];
	    tabInt[0] = tab1[0];
	    tabInt[1] = tab1[0];
		for (int i=1 ; i<tab1.length ; i++){
			if (tab1[i]>tabInt[0]) tabInt[0] = tab1[i] ;
			if (tab1[i]<tabInt[1]) tabInt[1] = tab1[i] ;
		}
		return tabInt;
	}

	public static void sortVector( int tab[] ) { // Trier le tableau tab en utilisant un tri par bull

		boolean permut=true; // nous indique si il y'avait une perumtaion
		int inter; // variable intermédiare

		while (permut) {
			permut = false;
			for (int i = 0; i < tab.length - 1; i++) {
				if (tab[i] > tab[i + 1]) {
					permut = true;
					// Permuter
					inter = tab[i];
					tab[i] = tab[i + 1];
					tab[i+1] = inter;
				}
			}
		}
	}

	public static void reverseVector ( int tab[]) { // inverser l'ordre des elements de tab
		/*
		Example d'utilisation :
			int tab[] = {31,54,8,64,89,102,35,45,1,25,-5};

			apres l'appel

			tab[] = {-5,25,1,45,35,102,89,64,8,54,31};
		 */

		int j = 0; // varibale inter pour la permutation

		for (int i = 0 ; i<(tab.length / 2)-1  ; i++) {
			j = tab[i]; // permutation
			tab[i] = tab[tab.length - i -1  ];
			tab[tab.length - i -1 ] = j;
		}

	}

	public static void multiplyVector ( int tab[] , int facteur) { //multiplier chaque case par facteur
		for (int i = 0 ; i<tab.length ; i++)
			tab[i] *= facteur ;
	}

	public static void printVector (int tab[]) { //afficher le tableau
		for (int i = 0 ; i<tab.length ; i++) {
			System.out.println(i + " - " + tab[i]);
		}
	}
}

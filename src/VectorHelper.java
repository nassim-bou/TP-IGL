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
			tabInter = new int [tab1.length];
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

	public static int[] copyVector ( int tab1[]  ) {
		int tab2[] = new int[tab1.length];
		for (int i = 0 ; i < tab1.length ; i++ )
			tab2[i] = tab1[i];

		return tab2;
	}

	public static int[] sortVector( int tab[] ) { // Trier le tableau tab en utilisant un tri par bull

		int tab2[] = copyVector(tab);

		boolean permut=true; // nous indique si il y'avait une perumtaion
		int inter; // variable intermédiare

		while (permut) {
			permut = false;
			for (int i = 0; i < tab2.length - 1; i++) {
				if (tab2[i] > tab2[i + 1]) {
					permut = true;
					// Permuter
					inter = tab2[i];
					tab2[i] = tab2[i + 1];
					tab2[i+1] = inter;
				}
			}
		}
		return tab2;
	}

	public static int[] reverseVector ( int tab[]) { // inverser l'ordre des elements de tab

		int tab2[] = copyVector(tab);

		/*
		Example d'utilisation :
			int tab[] = {31,54,8,64,89,102,35,45,1,25,-5};

			apres l'appel

			tab[] = {-5,25,1,45,35,102,89,64,8,54,31};
		 */

		int j = 0; // varibale inter pour la permutation

		for (int i = 0 ; i<(tab2.length / 2)-1  ; i++) {
			j = tab2[i]; // permutation
			tab2[i] = tab2[tab2.length - i -1  ];
			tab2[tab2.length - i -1 ] = j;
		}
		return tab2;
	}

	public static int[] multiplyVector ( int tab[] , int facteur) { //multiplier chaque case par facteur

		int tab2[] = copyVector(tab);

		for (int i = 0 ; i<tab2.length ; i++)
			tab2[i] *= facteur ;

		return tab2;
	}

	public static void printVector (int tab[]) { //afficher le tableau
		for (int i = 0 ; i<tab.length ; i++) {
			System.out.println(i + " - " + tab[i]);
		}
	}

}

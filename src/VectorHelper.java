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
			for (int i=0 ; i <tab1.length ; i++)
				tabInter[i]= tab1[i] + tab2[i];
			
		}catch  (VectorDifferentSizeException e){
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



	public static void sortVector( int tab[] ) {

		boolean permut=true;
		int inter;

		while (permut) {
			permut = false;
			for (int i = 0; i < tab.length - 1; i++) {
				if (tab[i] > tab[i + 1]) {
					permut = true;
					inter = tab[i];
					tab[i] = tab[i + 1];
					tab[i+1] = inter;
				}
			}
		}
	}

	public static void reverseVector ( int tab[]) {

		int inter;
		int j = 0;

		for (int i = 0 ; i<(tab.length / 2)-1  ; i++) {
			j = tab[i];
			tab[i] = tab[tab.length - i -1  ];
			tab[tab.length - i -1 ] = j;
		}

	}

	public static void multiplyVector ( int tab[] , int facteur) {
		for (int i = 0 ; i<tab.length ; i++)
			tab[i] *= facteur;
	}

	public static void printVector (int tab[]) {
		for (int i = 0 ; i<tab.length ; i++) {
			System.out.println(tab[i]);
		}
	}


}

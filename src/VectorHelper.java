/**
 	* ce projet est dans le cadre du TP IGL 1 CS
 	* @version : 1.0
    * @author : Amine Athmani , Nassim Bouarour
    * Date : 11/10/2017
 */

/**
 * Cette classe est une classe utilitaire pour établir des methodes sur les vecteurs
 */
public class VectorHelper  {

	/**
	 * sommer deux tableau case par case et génere un troisieme tableau
	 * @param tab1 : tableau d'entiers 1
	 * @param tab2 : tableau d'entiers 2
	 * @return un tableau d'entiers dont chaque case est la somme de deux cases tab1[i] + tab2[i]
	 * @throws VectorDifferentSizeException qui indique que les tableaux ont des tailles differentes
	 * Example d'utilisation :
	 * int TAB1[] = {31,54,8,64,89,102,35,45,1,25,-5};
	 * int TAB2[]= {11,22,33,44,55,66,77,88,99,10,11};
	 * apres l'appel
	 * TAB1_PLUS_TAB2[] == {42,76,41,108,144,168,112,133,100,35,6};
	 */

	public static int[] sommer(int tab1[], int tab2[]) throws VectorDifferentSizeException{
		int tabInter [] = null ;
			if (tab1.length != tab2.length)
				throw new VectorDifferentSizeException(); // Lancer une exception ( taille differente )
			tabInter = new int [tab1.length];
			for (int i=0 ; i <tab1.length ; i++) // sommer case par case
				tabInter[i]= tab1[i] - tab2[i];
		return tabInter;
	}

	/**
	 *
	 * @param tab1 le tableau dont on va determiner le min et max
	 * @return un tableau dont le premier element est le max et le deuxieme est le min
	 * Example d'utilisation :
	 * int tab[] = {31,54,8,64,89,102,35,45,1,25,-5};
	 * apres l'appel
	 * tabInt[0] == 102;
	 * tabInt[1] == -5;
	 */

	public static int[] maxMin (int tab1[]){
		int tabInt[]= new int[2];
	    tabInt[0] = tab1[0];
	    tabInt[1] = tab1[0];
		for (int i=1 ; i<tab1.length ; i++){
			if (tab1[i]>tabInt[0]) tabInt[0] = tab1[i] ;
			if (tab1[i]<tabInt[1]) tabInt[1] = tab1[i] ;
		}
		return tabInt;
	}

	/**
	 * Creer une copie de tab1
	 * @param tab1 le tableau dont on va creer une copie
	 * @return un tableau qui est une copie exacte de tab1
	 */
	public static int[] copyVector ( int tab1[]  ) {
		int tab2[] = new int[tab1.length];
		for (int i = 0 ; i < tab1.length ; i++ )
			tab2[i] = tab1[i];

		return tab2;
	}

	/**
	 * Trier le tableau tab en utilisant un tri par bull
	 * @param tab un tableau d'entiers qu'on va trier
	 * @return une copie triée de tab
	 * Example d'utilisation :
	 * int tab[] = {31,54,8,64,89,102,35,45,1,25,-5};
	 * apres l'appel
	 * tab[] = {-5,25,1,45,35,102,89,64,8,54,31};
	 */

	public static int[] sortVector( int tab[] ) {

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

	/**
	 * inverser l'ordre des elements de tab
	 * @param tab un tableau d'entier qu'on va inverser
	 * @return une copie inversée de tab
	 * Example d'utilisation :
	 * int tab[] = {31,54,8,64,89,102,35,45,1,25,-5};
	 * apres l'appel
	 * tab[] = {-5,25,1,45,35,102,89,64,8,54,31};
	 */

	public static int[] reverseVector ( int tab[]) {

		int tab2[] = copyVector(tab);

		int j = 0; // varibale inter pour la permutation

		for (int i = 0 ; i<(tab2.length / 2)-1  ; i++) {
			j = tab2[i]; // permutation
			tab2[i] = tab2[tab2.length - i -1  ];
			tab2[tab2.length - i -1 ] = j;
		}
		return tab2;
	}

	/**
	 * multiplier chaque case par facteur
	 * @param tab tableau d'entiers
	 * @param facteur le facteur de multiplication
	 * @return une copie du tableau tab multiplié par facteur
	 * Example d'utilisation :
	 * int tab[] = {31,54,8,64,89,102,35,45,1,25,-5};
	 * apres l'appel
	 * tab[] = {62,108,16,128,178,204,70,90,2,50,-10};
	 */

	public static int[] multiplyVector ( int tab[] , int facteur) {

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

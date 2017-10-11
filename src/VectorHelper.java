
public class VectorHelper {
	
	public static int[] Sommer (int tab1[], int tab2[]){
		int tabInter [] = null ;
		try{
			if (tab1.length != tab2.length)
				throw new VectorDifferentSizeException();
			tabInter = new int [tab1.length*2];
			for (int i=0 ; i <tab1.length ; i++)
				tabInter[i]= tab1[i];
			for (int i=0 ; i <tab2.length ; i++)
				tabInter[i+tab1.length] = tab2[i];
			
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
	
}

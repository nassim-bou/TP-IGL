
public class main {

	public static void main() {
		int tab1[]= {1,2,3,4,5};
		int tab2[]= {11,22,33,44,55};
		int tab3[]= VectorHelper.Sommer(tab1, tab2);
		for (int i=0 ; i<tab3.length ; i++)
			System.out.println(tab3[i]);
	}

}

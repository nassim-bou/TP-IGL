/**
 * Created by Athmani on 17/10/2017.
 */
public class Main {

        public static void main(String args[]) {
            int tab1[]= {1,2,3,4,5};
            int tab2[]= {11,22,33,44,55};
            int tab3[] = null;
            try {
                tab3 = VectorHelper.sommer(tab1, tab2);
            } catch (VectorDifferentSizeException e) {
                e.printStackTrace();
            }
            VectorHelper.printVector(tab3);
        }

}

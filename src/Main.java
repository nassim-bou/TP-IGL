/**
 * Created by Athmani on 17/10/2017.
 */
public class Main {

        public static void main(String args[]) {
            int tab1[]= {1,2,3,4,5};
            int tab2[]= {11,22,33,44,55};
            int tab3[]= VectorHelper.Sommer(tab1, tab2);

            VectorHelper.printVector(tab3);
        }

}

import junit.framework.TestCase;

/**
 * Created by Athmani on 17/10/2017.
 */
public class VectorHelperTest extends TestCase {

    public static final int TAB1[] = {31,54,8,64,89,102,35,45,1,25,-5};
    public static final int REVERSED_TAB1[] = {-5,25,1,45,35,102,89,64,8,54,31};
    public static final int TAB1_MULTI_2[] = {62,108,16,128,178,204,70,90,2,50,-10};
    public static final int TAB2[]= {11,22,33,44,55,66,77,88,99,10,11};
    public static final int TAB1_PLUS_TAB2[] = {42,76,41,108,144,168,112,133,100,35,6};

    public void testSommer() throws Exception {
        int tab[] = VectorHelper.sommer(TAB1,TAB2);

        for (int i=0 ; i < tab.length ; i++ ) {
            assertEquals(tab[i],TAB1_PLUS_TAB2[i]);
        }
    }

    public void testMaxMin() throws Exception {
        int tab[] = VectorHelper.maxMin(TAB1);
        assertEquals(tab[1],-5);
        assertEquals(tab[0],102);
    }

    public void testSortVector() throws Exception {

        int tab[] = VectorHelper.sortVector(TAB1);
        boolean sorted=true;

        for(int i=0 ; i<tab.length-1 ; i++ ) {
            if (tab[i]>tab[i+1])
                sorted = false;
        }
        assertEquals(sorted,true);
    }

    public void testReverseVector() throws Exception {
        int tab[] = VectorHelper.reverseVector(TAB1);
        for (int i = 0 ; i < tab.length ; i++)
            assertEquals(tab[i],tab[i]);
    }

    public void testMultiplyVector() throws Exception {
        int tab[] = VectorHelper.multiplyVector(TAB1,2);
        for (int i = 0 ; i < tab.length ; i++)
            assertEquals(tab[i],TAB1_MULTI_2[i]);

    }

}
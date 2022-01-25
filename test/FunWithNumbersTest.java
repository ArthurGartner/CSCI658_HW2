import static org.junit.Assert.*;
import org.junit.Before.*;
import org.junit.Test;
import org.junit.Test.*;

public class FunWithNumbersTest {

    private int[] a1;
    private int[] a2;
    private int[] a3;
    private int[] a4;
    private int a5;
    private int a6;
    private int a7;

    @org.junit.Before
    public void setUp() throws Exception {
        a1 = new int[]{1, 2, 3};
        a2 = new int[]{1, 3, 2, 4};
        a3 = new int[]{10};
        a4 = new int[]{1, 5, 2, 8, 9, 10, 4, 2};
        a5 = 7;
        a6 = 10;
        a7 = 20;
    }

    @org.junit.Test
    public void max2sum1() {
        assertEquals("expect 5 to be max2sum of [1,2,3]", 5, FunWithNumbers.max2sum(a1));
    }

    @org.junit.Test
    public void max2sum2() {
        assertEquals("expect 7 to be max2sum of [1,3,2,4]", 7, FunWithNumbers.max2sum(a2));
    }

    @org.junit.Test
    public void max2sumEmpty() {
        assertEquals("expect 5 to be max2sum of [1,2,3]", 0, FunWithNumbers.max2sum(new int[]{}));
    }

    @org.junit.Test
    public void max2sumOneElement() {
        assertEquals("expect 10 to be max2sum of [10]", 10, FunWithNumbers.max2sum(a3));
    }
    @org.junit.Test
    public void max2sumNPE() {
        try {
            FunWithNumbers.max2sum(null);
        }catch (NullPointerException e){
            return;
        }
        fail("failure");
    }

    @org.junit.Test
    public void sum() { assertEquals("expect 10 to be sum of [1, 2, 3]", 6, FunWithNumbers.sum(a1));}

    @org.junit.Test
    public void sum1() { assertEquals("expect 10 to be sum of [1, 3, 2, 4]", 10, FunWithNumbers.sum(a2));}

    @Test
    public void sumEmpty() { assertEquals("Expect 0 to be sum of []", 0, FunWithNumbers.sum(new int[]{}));}

    @Test
    public void sumNPE() {
        try {
            FunWithNumbers.sum(null);
        } catch (NullPointerException e) {
            return;
        }
        fail("failure");
    }

    @Test
    public void sumToN() { assertEquals("Expect true to be sumToN of [1, 5, 2, 8, 9, 10, 4, 2] with n = 7", true, FunWithNumbers.sumToN(a4, a5));}

    @Test
    public void sumToN1() { assertEquals("Expect true to be sumToN of [1, 5, 2, 8, 9, 10, 4, 2] with n = 10", true, FunWithNumbers.sumToN(a4, a6));}

    @Test
    public void sumToN2() { assertEquals("Expect true to be sumToN of [1, 5, 2, 8, 9, 10, 4, 2] with n = 20", false, FunWithNumbers.sumToN(a4, a7));}

    @Test
    public void sumToNEmpty() { assertEquals("Expect true to be sumToN of [] with n = 0", false, FunWithNumbers.sumToN(new int[]{}, 0));}

    @Test
    public void SumToNNPE() {
        try {
            FunWithNumbers.sumToN(null, 0);
        }catch (NullPointerException e)
        {
            return;
        }
        fail("failure");
    }
}
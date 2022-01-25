import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FunWithNumbers {

    public static int max2sum(int[] a){
        //return sum of largest two numbers
        //if empty, return zero
        //if one element, return that one
        //if null, throw NPE
        if(a.length == 0) return 0;
        if(a.length == 1) return a[0];

        Arrays.sort(a);
        return a[a.length - 1] + a[a.length - 2];
    }

    public static int sum(int[] a){
        if (a.length > 0)
        {
            int sum = 0;

            for (int num : a)
            {
                sum += num;
            }

            return sum;
        }

        return 0;
    }

    public static boolean sumToN(int[] a, int n){
        if (a.length > 1)
        {
            //Create hash map to store value and index
            Map<Integer, Integer> search = new HashMap<Integer, Integer>();

            //Single pass O(n)
            for (int i = 0; i < a.length; i++)
            {
                int delta = n - i;

                if (search.containsKey(delta))
                {
                    return true;
                }

                search.put(a[i], i);
            }
        }
        return false;
    }

}

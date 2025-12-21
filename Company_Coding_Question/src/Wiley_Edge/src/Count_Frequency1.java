import java.util.*;
import java.util.Arrays;

public class Count_Frequency1
{
    static void countFreq(int arr[], int n)
    {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++)
        {   if (mp.containsKey(arr[i]))
                mp.put(arr[i], mp.get(arr[i]) + 1);
            else
                mp.put(arr[i], 1);
        }

//        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
//        {
//            System.out.println(entry.getKey() + " occurs " + entry.getValue()+" times ");
//        }         OR
//        System.out.println(Arrays.asList(mp));
        System.out.println(mp);
    }
    public static void main(String []args)
    {
        int arr[] = new int[]{10, 30, 10, 20, 10, 20, 30, 10};
        int n = arr.length;
        countFreq(arr, n);
    }
}
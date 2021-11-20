package Hash;

import java.util.Random;

public class Main<I extends Number, I1 extends Number> {

    public static void main(String[] args) {
        LinkedList<Integer, String> ht
                = new LinkedList<>();

        Random rd = new Random();
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) arr[i] = rd.nextInt(60000);
        LinkedList<Integer, Integer> ht1
                = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) { // O(n)
            Integer val = ht1.get(arr[i]); // O(1)
            if(val == null){
                ht1.put(arr[i], 1);
            } else {
                ht1.put(arr[i], val+1); // O(1)
            }
        }
    }
}
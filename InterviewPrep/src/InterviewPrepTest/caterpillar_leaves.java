package InterviewPrepTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class caterpillar_leaves {
	
	 static int countUneatenLeaves(int N, int[] A) {
        
		int factors = 0;
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        findFactorialsOfAllCombinations(0, A, 0, new int[A.length], map, N);
        for (int key : map.keySet()) {
            if ((key & 1) != 1) {
                List<Integer> list = map.get(key);
                for (int i : list) {
                    factors -= i;
                }
            } else {
                List<Integer> list = map.get(key);
                for (int i : list) {
                    factors += i;
                }
            }}
        return N - factors;
    }

 private static void findFactorialsOfAllCombinations(int start, int[] array, int K, int[] result, Map<Integer, List<Integer>> map, int N)
    {
        if (K > 0) {
            if (!map.containsKey(K)) {
                map.put(K, new ArrayList<Integer>());
            }
            List<Integer> list = map.get(K);
            int[] temp = new int[K];
            System.arraycopy(result, 0, temp, 0, K);
            int factors = (int) Math.floor(N / lcm(temp));
            list.add(factors);
        }
        for (int i = start; i < array.length; i++) {
            result[K] = array[i];
            findFactorialsOfAllCombinations(i + 1, array, K + 1, result, map, N);
        }
    }


    private static int lcm(int[] input)
    {
        int result = input[0];
        for (int i = 1; i < input.length; i++) result = lcm(result, input[i]);
        return result;
    }
    private static int lcm(int a, int b)
    {
        return a * (b / gcd(a, b));
    }

    private static int gcd(int a, int b)
    {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter the number of leaves");
    	int n = in.nextInt();
    	System.out.println("Enter the number of caterpillars");
    	int k =in.nextInt();
    	int[] ar = new int[k];
    	for(int i=0;i<ar.length;i++){
    		System.out.println("Enter the jumps");
    		ar[i] = in.nextInt();
    	}
    	System.out.println(countUneatenLeaves(n,ar));
    }

}

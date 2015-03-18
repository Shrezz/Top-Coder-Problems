package InterviewPrepTest;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class caterpillar {

	    /*
	 * Complete the function below.
	 */
	    static void reduceJumps(int[] A) {
	        for (int i =0; i < A.length; i++) {
	         for (int j =0; j < A.length; j++) {
	             if (A[j] !=0 && A[i]%A[j] == 0 && i!=j ) {
	                 //A[i] is a multiple of A[j]
	                  A[i] = 0;
	                 break;
	              }
	         }
	            
	        }
	    }     
	    static boolean isAlreadyEaten(int [] A, int jump, int i) {
	        boolean alreadyEaten = false;
	          for (int j=0; j<i ;j++) {
	             if (A[j] == 0) {
	                 continue;
	             }
	              if (jump % A[j] == 0) {
	                  alreadyEaten = true;
	                  break;
	              }
	          }
	          
	          return alreadyEaten;
	    }
	    
	    static int countUneatenLeaves(int N, int[] A) {
	        reduceJumps(A);
	        int eatenleaves =0;
	        for (int i=0; i< A.length; i++) {
	            if (A[i] == 0) {
	                continue;
	            }
	            int k = 1;
	            int jump = A[i] * k;
	            while(jump <= N) {
	              
	              if (!isAlreadyEaten(A, jump, i)) {
	                 eatenleaves++;
	              }
	              k++;
	              jump = A[i] * k;
	              
	            }
	        }
	       return N-eatenleaves;
	    }
	    public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        int res=-1;
	        int _N;
	        System.out.println("Enter the nmber of leaves");
	        _N = Integer.parseInt(in.nextLine());
	        System.out.println("Enter the numberof caterpillars");
	        int _A_size = Integer.parseInt(in.nextLine());
	        int[] _A = new int[_A_size];
	        int _A_item;
	        for(int _A_i = 0; _A_i < _A_size; _A_i++) {
	        	System.out.println("Enter the value of jumps");
	            _A_item = Integer.parseInt(in.nextLine());
	            if(_A_item ==1) res = 0;
	            _A[_A_i] = _A_item;
	        }
	        if(res!=0)res = countUneatenLeaves(_N, _A);
	        System.out.println(res);
	    }
	}


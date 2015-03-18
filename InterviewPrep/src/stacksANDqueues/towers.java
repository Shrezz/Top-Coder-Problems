package stacksANDqueues;

import java.util.Scanner;

public class towers {
		   public void solve(int n, String start, String buffer, String end) {
		       if (n == 1) {
		           System.out.println(start + " -> " + end);
		       } else {
		           solve(n - 1, start, end, buffer);
		           System.out.println(start + " -> " + end);
		           solve(n - 1, buffer, start, end);
		       }
		   }
		   public static void main(String[] args) {
		       towers towersOfHanoi = new towers();
		       System.out.print("Enter number of discs: ");
		       Scanner scanner = new Scanner(System.in);
		       int discs = scanner.nextInt();
		       towersOfHanoi.solve(discs, "A", "B", "C");
		   }
		}


package InterviewPrepTest;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class findSquareroots{
public static void main(String[] args) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        try{
	       System.out.println("Enter the number of test casess"); 	
	       Scanner in = new Scanner(System.in);
	       
           String line = br.readLine();
           int num = Integer.parseInt(line);
           for(int i = 0; i < num; i++){
               String[] inp = br.readLine().split(" ");
               int a = Integer.parseInt(inp[0]);
               int b = Integer.parseInt(inp[1]);
               int count = 0;
               for(int j = 1; j*j <= b; j++){
                   if(j*j >= a){
                       count++;
                   }
               }
               System.out.println(count);
           }
           
        } catch(Exception e) {
            
        }
	        
}}
        
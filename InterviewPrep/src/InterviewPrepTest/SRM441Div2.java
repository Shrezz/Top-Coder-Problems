package InterviewPrepTest;

public class SRM441Div2 {
	public static int minimize(String s1, String s2){

	    int n = s1.length();
	    int m = s2.length();
	    int ans = 1000;
	    for (int i=0; i<=m-n; i++) {
	      int res = 0;
	      for (int j=0; j<n; j++) {
	        if (s1.charAt(j) != s2.charAt(j+i)) {++res;}
	      } 
	      if (res < ans) {ans = res;}
	    }	    
		return ans;
	}
	public static void main(String args[]){
		System.out.println(minimize("koder","topcoder"));
	}
}

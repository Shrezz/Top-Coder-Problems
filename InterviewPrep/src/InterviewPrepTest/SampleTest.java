package InterviewPrepTest;

public class SampleTest {   
	    SampleTest(int x) {
	        System.out.println("Constructor called " + x);
	    }
	    public static void main(String[] args) {    
	         Test2 t2 = new Test2(5);
	    }
	}
class Test2 {    
	    SampleTest t1 = new SampleTest(10);   
	    Test2(int i) { t1 = new SampleTest(i); } 
	  
	   
}

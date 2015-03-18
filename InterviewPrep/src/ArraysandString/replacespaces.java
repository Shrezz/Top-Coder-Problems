package ArraysandString;

public class replacespaces {

	public void removespace(String mystr, int length){
		
			char[] ar = mystr.toCharArray();
			int newLength=0, count =0;
			for(int i=0;i<length;i++){
				if(ar[i] == ' '){
					count++;
				}}
			newLength = length + (count*2);
			ar[newLength-1] = '\0';
			for(int i = length-1;i>=0;i--){
				if(ar[i] == ' '){
					ar[newLength-1] = '0';
					ar[newLength-2] = '2';
					ar[newLength-3] = '%';
					newLength = newLength-3;
				}
				else{
					ar[newLength-1] = ar[i];
					newLength = newLength-1;
				}
			}
			System.out.println(ar);
	}
	}



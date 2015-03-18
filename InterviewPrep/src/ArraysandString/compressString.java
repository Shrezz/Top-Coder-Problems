package ArraysandString;

public class compressString {

	private static int iscompressedString(StringBuffer mystr){
		if(mystr.length()==0 || mystr == null)return 0;
		else{
			int size=0;
			int count=1;
			char last = mystr.charAt(0);
			for(int i=1;i<mystr.length();i++){
				if(mystr.charAt(i) == last){
					count++;
				}
				else{
					last = mystr.charAt(i);
					size += 1+String.valueOf(count).length();
					count =1;
				}}
			size+= 1+String.valueOf(count).length();
			return size;
		}
	}
	public StringBuffer compress(StringBuffer mystr){
		if(iscompressedString(mystr) > mystr.length()){
			return mystr;
		}
		else{
			StringBuffer str = new StringBuffer();
			int count=1;
			char last = mystr.charAt(0);
			for(int i=1;i<mystr.length();i++){
				if(mystr.charAt(i) == last){
					count++;
				}
				else{
					str.append(last);
					str.append(String.valueOf(count));
					last = mystr.charAt(i);
					count =1;
				}}
			str.append(last);
			str.append(String.valueOf(count));
			return str;
		}
	}
}

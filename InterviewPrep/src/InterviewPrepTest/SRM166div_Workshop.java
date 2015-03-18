package InterviewPrepTest;

public class SRM166div_Workshop {
	public static int pictureFrames(int[] pieces){
		int count=0; int len = pieces.length;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				for(int k=j+1;k<len;k++){
					if(pieces[i]+pieces[j] > pieces[k] && pieces[j]+pieces[k] >pieces[i] && pieces[i]+pieces[k]>pieces[j])
						count++;
				}
			}
		}
		return count;
	}
	public static void main(String args[]){
		int[] pieces = new int[] {8,5,3};
		System.out.println(pictureFrames(pieces));
	}
}

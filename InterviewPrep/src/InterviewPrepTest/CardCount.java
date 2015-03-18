package InterviewPrepTest;

public class CardCount {
	public static String[] dealHands(int num, String deck){
		String[] arr = new String[num];
		for(int i=0;i<arr.length;i++){
			arr[i] = "";
		}
		while(deck.length()!=0 && deck.length()>=num){
			for(int i=0;i< num;i++){
				arr[i] += deck.charAt(0);
				deck = deck.substring(1);
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		return arr;
	}
	public static void main(String args[]){
		dealHands(4,"12345678");
	}
}

package InterviewPrepTest;

public class ProfitCalculator {
	public static int percent(String[] items){
		double percent=0;
		double saleprice =0;;
		double cost =0;
		for(int i=0;i<items.length;i++){
			saleprice+=  Double.parseDouble((items[i].split(" ")[0]));
			cost+=  Double.parseDouble((items[i].split(" ")[1]));	
		}
		System.out.println(saleprice+"  "+ cost);
		percent = ((saleprice-cost)/saleprice)*100;
		return (int) Math.floor(percent);
	}
	public static void main(String args[]){
		String[] num = new String[]{"000.00 049.99","999.99 936.22","033.99 025.64","249.99 211.87"};
		System.out.println(percent(num));
	}
}

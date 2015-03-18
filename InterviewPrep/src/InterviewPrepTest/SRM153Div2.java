package InterviewPrepTest;
//MostProfitable
public class SRM153Div2 {
	public static String bestItem(int[] costs, int[] prices, int[] sales, String[] items){

		int profit=0;String item="";
		for(int i=0;i<costs.length;i++){
			int curr_profit = (prices[i]-costs[i])*sales[i];
			if(curr_profit>profit){
				profit = curr_profit;
				item = items[i];
			}
		}
		if(profit<=0) item = "";
		return item;
	}
	public static void main(String args[]){
		int[] costs = new int[]{100};//,120,150,1000};
		int[] prices = new int[]{100};//,110,200,2000};
		int[] sales = new int[]{134};//,100,50,3};
		String[] items = new String[]{"Service, at cost"};//"Video Card","256M Mem","CPU/Mobo combo","Complete machine"};
		System.out.println(bestItem(costs,prices,sales,items));
	}
}

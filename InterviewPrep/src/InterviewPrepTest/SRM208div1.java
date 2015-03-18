package InterviewPrepTest;

public class SRM208div1 {
		public static void getPeople(String[] people){
			int[][] heights = new int[people.length][people[0].split(" ").length];
			int[] min= new int[people.length];int[] max= new int[people[0].split(" ").length];
			for(int i=0;i<people.length;i++){
				String[] ar = people[i].split(" ");
				for(int j=0;j<ar.length;j++){
					min[i] = Integer.parseInt(ar[j]);
					heights[i][j] = Integer.parseInt(ar[j]);
					if(heights[i][j] < min[i]) min[i] = heights[i][j];
			}}
			for(int i=0;i<max.length;i++){
				for(int j=0;j<min.length;j++){
					max[i] = heights[i][j];
					
				}
			}
			
			/*for(int[] row : heights){
				for(int ele:row){
					System.out.println(ele);
				}
			}*/
		}
		public static void main(String args[]){
			String[] people = new String[]{"9 2 3",
			 "4 8 7"};
			getPeople(people);
		}
}

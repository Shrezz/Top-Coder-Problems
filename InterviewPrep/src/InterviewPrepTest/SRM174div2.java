package InterviewPrepTest;

public class SRM174div2 {

		public static int countWords(String[] board, int size){
			int result=0;
			for(int i=0;i<board.length;i++){
				result+= getcount(board[i],size);
			}
			return result;
		}
		public static int getcount(String row, int size){
			int slots=0; int count=0;
			for(char c: row.toCharArray()){
				if(c == '.') count++;
				else if(c=='X') {
					if (count == size) slots++;
					count=0;
				}
			}
			if(count==size) slots++;
			return slots;
		}
		public static void main(String args[]){
			String[] str = new String[]{"...X...",
					 ".X...X.",
					 "..X.X..",
					 "X..X..X",
					 "..X.X..",
					 ".X...X.",
					 "...X..."};
			System.out.println(countWords(str,3));
		}
}

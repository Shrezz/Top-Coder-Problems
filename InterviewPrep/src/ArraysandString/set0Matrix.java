package ArraysandString;

public class set0Matrix {

	private static void nullifyRow(int[][] matrix,int row){
		for(int j=0;j<matrix[0].length;j++){
			matrix[row][j] = 0;
		}
	}
	private static void nullifyColumn(int[][] matrix, int column){
		for(int i=0;i<matrix.length;i++){
			matrix[i][column] =0;
		}
	}
	public void setMatrix(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] col = new boolean[matrix[0].length];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if (matrix[i][j] ==0){
					row[i] = true;
					col[j] = true;
				}
			}}
		for(int i=0;i<row.length;i++){
			if(row[i]) nullifyRow(matrix,i);
		}
		for(int j=0;j<col.length;j++){
			if(col[j]) nullifyColumn(matrix,j);
		}
	}
}

public class Hourglass {

	static int hourglassSum(int[][] ar) {
		int colIndex = 3;
		int rowIndex = 3;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i < rowIndex && j < colIndex) {
					boolean midRow = i == (rowIndex - 2);
					boolean midCol = j == (colIndex - 2);
					System.out.print("("+(rowIndex-2) + ", " + (colIndex-2)+ ")");
					if (midRow && midCol) {
//						System.out.println("accept");
					} else {
//						System.out.print("["+ar[i][j]+"]");
					}
					if (j == colIndex - 1 || i == rowIndex - 1) {
						colIndex++;
						rowIndex++;
					}
				}
			}
			colIndex = 3;
			System.out.println();
		}
		return 1;
	}

	public static void main(String[] args) {
		int[][] arr = 
		   {{1,1,1,0,0,0}, 
			{0,1,0,0,0,0},
		   	{1,1,1,0,0,0}, 
			{0,0,2,4,4,0},
			{0,0,0,2,0,0}, 
			{0,0,1,2,4,0}};
		System.out.println(hourglassSum(arr));
	}

}
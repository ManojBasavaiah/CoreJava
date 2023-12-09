
public class max_value_in_minval_column {
	public static void main(String[] args) {
		int arr[][] = { { 2, 4, 5 }, { 3, 0, 7 }, { 1, 2, 9 } };
		int min = arr[1][0];
		int mincolumn = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] < min)// 4
				{
					min = arr[i][j];
					mincolumn = j;
				}
			}
		}
		System.out.println(mincolumn);//1
		System.out.println(min);//0
//		while loop is used as the iteration is wrt rows to find max value
		int max = arr[0][mincolumn];// initialize the max value be oth row and 1st column i.e=4
		int rows = 0;
		while (rows < 3) {
			if(arr[rows][mincolumn]>max) {
				max=arr[rows][mincolumn];
			}
			rows++;
		}System.out.println(max);

	}
}

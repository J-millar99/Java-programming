class Main {
	public static void main(String[] args) {
		int[][] matrix = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
		};
		showTwoDArr(matrix);
		reverseMatrix(matrix);
		showTwoDArr(matrix);
	}

	public static int[][] reverseMatrix(int[][] arr) {
		int[] temp;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1];
			arr[arr.length - 1] = temp;
		}
		return arr;
	}
	public static void showOneDArr(int[] arr)
	{
		for (int num: arr)
			System.out.print(num + "\t");
		System.out.println();
	}

	public static void showTwoDArr(int[][] arr)
	{
		for (int[] oneDArr: arr) {
			showOneDArr(oneDArr);
		}
	}
}
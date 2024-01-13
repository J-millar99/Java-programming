class Main {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4};
		int[][] arr2 = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
		};
		// Take 1
		showOneDArr(arr1);
		addOneDArr(arr1, 3);
		System.out.println();
		// Take 2
		showTwoDArr(arr2);
		addTwoDArr(arr2, 3);
	}

	public static void addOneDArr(int[] arr, int add) {
		for (int i = 0; i < arr.length; i++)
			arr[i] += add;
		showOneDArr(arr);
	}

	public static void addTwoDArr(int[][] arr, int add) {
		for (int[] oneDArr: arr) {
			addOneDArr(oneDArr, add);
		}
			
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
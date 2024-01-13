class Main {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};

		System.out.println("최솟값(for): " + minValue(arr) + "\n" + "최댓값(for-each): " + maxValue(arr));
	}

	public static int minValue(int[] arr) {
		int _minValue;

		_minValue = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (_minValue > arr[i])
				_minValue = arr[i];
		return _minValue;
	}

	public static int maxValue(int[] arr) {
		int _maxValue;

		_maxValue = arr[0];
		for (int _value: arr)
			if (_maxValue < _value)
				_maxValue = _value;
		return _maxValue;
	}
}

class ArraySort {
	public static void main(String[] args) {
		int[] a = {50, 20, 40, 30, 10, 60, 25, 100};
		
		for (int i = 0; i < (a.length - 1); i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for (int val: a) {
			System.out.println(val);
		}
	}
}
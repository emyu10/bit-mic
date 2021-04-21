class CheckThrow {
	public static void main(String[] args) {
		int a = getValueFromArray(new int[] {1, 2, 3}, 2);
	}
	
	public static int getValueFromArray(int[] a, int position) throws ArrayIndexOutOfBoundsException {
		if (position >= a.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return a[position];
	}
}

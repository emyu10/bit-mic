class QuestionFive {
	public static void main(String[] args) {
		int[][] n = new int[3][4];
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < (n[i].length - 1); j++) {
				System.out.print("Enter number (" + i + ", " + j + "): ");
				n[i][j] = s.nextInt();
			}
		}
	}
	
	public static void printArray(int[][] n) {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < (n[i].length - 1); j++) {
				System.out.print("Enter number (" + i + ", " + j + "): ");
				n[i][j] = s.nextInt();
			}
		}
	}
}
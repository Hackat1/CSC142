public class ArrayTesting {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[][] b = new int[5][10];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		toSpiral(a,b,2,7);
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void toSpiral (int[] a, int[][] b, int row, int col) {
		int direction = -1;
		int k = 1, m = 1;
		int i = row;
		int j = col;
		boolean outOfRange = false;
		b[i][j] = a[0];
		while (outOfRange == false && m < a.length) {
			for (int s = 1; s < (k + 1) && outOfRange == false; s++) {
				i += direction;
				if (i >= 0 && i < b.length && m < a.length) {
					b[i][j] = a[m];
					m++;
				} else {
					outOfRange = true;
				}
			}
			for (int s = 1; s < (k + 1) && outOfRange == false; s++) {
				j += direction;
				if (j >= 0 && j < b[0].length && m < a.length) {
					b[i][j] = a[m];
					m++;
				} else {
					outOfRange = true;
				}
			}
			k++;
			direction *= -1;
		}
		outOfRange = true;
	}
}

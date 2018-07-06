package MaxIndex;

public class MaxIndex {

	public static void main(String[] args) {
		// 가장 큰 수의 위치

		int[] arr = { 10, 30, 70, 40, 15 };
		int max = arr[0];
		int maxindex = 0;
		int size = arr.length;
		for (int i = 1; i < size; i++) {
			if (arr[i] >= max) {
				max = arr[i];
				maxindex = i;
			}
		}
		System.out.println("가장 큰 수=" + max +
				"\n가장 큰 수의 위치=" + maxindex);

	}

}

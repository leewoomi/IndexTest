package approximate_value;

public class Approximate_Value {

	public static void main(String[] args) {
		// 50에 가장 가까운 수의 위치
		int[] arr = { 10, 30, 70, 40, 15 };

		int appro =50 - arr[0];
		int temp = 50 - arr[0];
		int index = 0;
		int size = arr.length;

		for (int i = 1; i < size; i++) {
			appro = 50 - arr[i];
			if (appro < 0) {
				appro = (-1) * appro;
			}
			if (appro < temp) {
				temp = appro;
				index = i;
			}

		}
		System.out.println("50에 가장 가까운 수의 위치 : " + index);
	}

}

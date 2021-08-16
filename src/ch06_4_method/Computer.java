package ch06_4_method;

public class Computer {

//	int sum1(int[] values) {
//		int sum = 0;
//		for (int i = 0; i < values.length; i++) {
//			sum += values[i];
////			sum = sum + values[i];
//		}
//		return sum;
//	}

	int[] intList;

	int sum() {
		return valuesSum(this.intList);
	}

	int sum1(int[] arrs) {
		return valuesSum(arrs);
	}

	int sum2(int... values) { // ...�� ������ �ǹ�(��������??..���������� �Ű������� �޴´�)
		return valuesSum(values);
	}

	int valuesSum(int[] ars) {
		int total = 0;
		for (int i = 0; i < ars.length; i++) {
			total += ars[i];
		}
		return total;
	}
}

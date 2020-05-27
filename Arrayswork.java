import java.util.Arrays;

public class Arrayswork {

	public static void main(String[] args) {
		
		int[] numbers = {5,1,33,79,22,11,45};
		
		Arrays.sort(numbers);
		String reverse = Arrays.toString(numbers);
		System.out.println(reverse);
		for (int i = numbers.length-1; i >= 0; i--) {
			System.out.print(numbers[i]+",");
		}
		
		System.out.println("");
		System.out.println("******************************");
		//Average
		int[] array= {20, 30, 25, 35, -16, 60, -100};
		
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			sum = sum+j;
			
		}
		int avg = sum/array.length;
		System.out.println(avg);
		
		System.out.println("******************************");
		//common numbers
		
		int[] array1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
		 for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i]==array2[j]) {
					System.out.println(array1[i]);
				}
			}
			
		}

	}

}

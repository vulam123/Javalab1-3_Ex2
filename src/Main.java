import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			int arr1Size = 0;
			int arr2Size = 0;
			List<Integer> listNumber = new ArrayList<Integer>();
			Scanner scan = new Scanner(System.in);
			System.out.print("Nhập vào size của arr1: ");
			arr1Size = scan.nextInt();
			int arr1[] = new int[arr1Size];
			System.out.print("Nhập vào các phần từ: ");
			for (int i = 0; i < arr1Size; i++) {
				System.out.print("arr1[" + i + "]= ");
				arr1[i] = scan.nextInt();
			}
			System.out.print("Nhập vào size của arr2: ");
			arr2Size = scan.nextInt();
			int arr2[] = new int[arr2Size];
			System.out.print("Nhập vào các phần từ: ");
			for (int i = 0; i < arr2Size; i++) {
				System.out.print("arr2[" + i + "]= ");
				arr2[i] = scan.nextInt();
			}
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] == arr2[j] && !listNumber.contains(arr1[i])) {
						listNumber.add(arr1[i]);
					}
				}
			}
			System.out.print("Output: ");
			for (int i = 0; i < listNumber.size(); i++) {
				System.out.print(listNumber.get(i) + ";");
			}
		} catch (Exception ex) {
			System.out.print("Please try again");
		}
	}
}

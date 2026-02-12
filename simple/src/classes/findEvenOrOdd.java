package classes;

public class findEvenOrOdd {

	public static void findEvnOdd(int[] arr) {
		
		if(arr.length == 0) { System.out.println("Nothing to find."); return;}
		
		int evnCount = 0,oddCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				evnCount++;
			}else {
				oddCount++;
			}
		}
		
		int[] even = new int[evnCount];
		int[] odd = new int[oddCount];
		
		int evnIndx = 0,oddIndx = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				even[evnIndx++] = arr[i];
			}else {
				odd[oddIndx++] = arr[i];
			}
		}		
		
		if(even.length > 0) {
			System.out.println("Printing Even Numbers:");
			for (int i = 0; i < even.length; i++) {
				System.out.print(even[i]+" ");
			}
			System.out.println("Count = "+evnCount+"\n");
		}else {
			System.out.println("No Even Number is their.");
		}
		
		if(odd.length > 0) {
			System.out.println("Printing Odd Numbers:");
			for (int i = 0; i < odd.length; i++) {
				System.out.print(odd[i]+" ");
			}
			System.out.println("Count = "+oddCount);
		}else {
			System.out.println("No Odd Number is their.");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,32,-4};
		findEvnOdd(arr);
		
	}

}

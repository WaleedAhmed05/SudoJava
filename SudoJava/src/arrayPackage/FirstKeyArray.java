package arrayPackage;

public class FirstKeyArray {

	public static void main(String[] args) {
		int[] arrayName= {1,2,3,4,5};
		int[] array2 = new int[4];
		array2[0]=6;
		array2[1]=7;
	//	printFunc(10);
	//	printFunc("test");
		
		//arrayPrint(arrayName[]);
		
		
		
		for (int i=0; i<arrayName.length; i++) {
			System.out.println(arrayName[i]);
		}
		
	}
	
public void arrayPrint(int arr[]) {
	for (int i=1; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
}
	
	
public static void printFunc(int n) {
	System.out.println(n);
}


public static void printFunc(String n) {
	System.out.println(n);
}
}

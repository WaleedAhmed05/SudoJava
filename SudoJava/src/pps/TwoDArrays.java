package pps;

public class TwoDArrays {
	
	
	public static void main(String[] args) {
		
		int[] arr01 = new int[5];
		int[][] arr02 = new int[2][3]; //declaring 2 array, each 3 elements.
		arr02[0][0]=10; //first array first element.
		//System.out.println(arr02[0][0]);
		
		for (int i=0; i <arr02.length; i++) {
			//this loop will run till arrays length- which is 2 here.
			System.out.println("outer loop");
			for (int j=0; j<3; j++) {
				arr02[i][j]=(i+1)*10;
				System.out.println(" inner loop");
				System.out.println(arr02[i][j]);
			}
		}
	}

}

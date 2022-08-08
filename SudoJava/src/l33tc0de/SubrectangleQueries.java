package src.l33tc0de;


/*
 * @auther WaleedAhmed05
 *  Implement the class SubrectangleQueries which receives a rows x cols rectangle as a matrix of integers
 in the constructor and supports two methods.


1. updateSubrectangle(int row1, int col1, int row2, int col2, int newValue)
    Updates all values with newValue in the subrectangle whose upper left coordinate is (row1,col1) and bottom right coordinate is (row2,col2).

2. getValue(int row, int col)
    Returns the current value of the coordinate (row,col) from the rectangle

 */

class SubrectangleQueries {
	
	int[][] array;
	

    public SubrectangleQueries(int[][] rectangle) {
    	this.array=rectangle;
    	
       
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {


		for (int i=row1; i<=row2; i++){

			for(int j=col1; j<=col2; j++){
				array[i][j]=newValue;
			}
		}
    	
    	
        
    }
    
    public int getValue(int row, int col) {
    	
    	int result=-1;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				if(i==row && j==col) {
					result=array[i][j];
				}
			}
		}
    	
    	return result;
        
    }
    
    public int printFunc() {
    	
    	int result=-1;
    	//(row,col)
    	
    	for(int i=0; i<array.length; i++) {//for row
    		
    		for (int j=0; j<array[0].length; j++) { //for column.
    			
    			
    			System.out.print(array[i][j]);
				System.out.print(' ');
    		}
			System.out.println();
    		
    	}
    	
    	return -1;
        
    }
    
    public static void main (String [] args) {
    	
    	int inp[][]={{1,2,1},{4,3,4},{3,2,1},{1,1,1}};
    	
    	SubrectangleQueries obj = new SubrectangleQueries(inp);

		obj.printFunc();
    	
		
		System.out.println(obj.getValue(1, 1));
		
		obj.updateSubrectangle(0, 0, 2, 2, 10);
		System.out.println(obj.getValue(1, 1));

		obj.printFunc();

    }
}
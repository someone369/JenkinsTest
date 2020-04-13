package javaPractice;

public class ArraYTwoDimentional {

	public static void main(String[] args) {
		
		String i[][] = new String[3][5];
		
		// First row
		
		i[0][0] = "A ";
		i[0][1] = "B ";
		i[0][2] = "C ";
		i[0][3] = "D ";
		i[0][4] = "E ";
		
		// Second row
		
		i[1][0] = "A1";
		i[1][1] = "B1";
		i[1][2] = "C1";
		i[1][3] = "D1";
		i[1][4] = "E1";
		
		// Third row
		
		i[2][0] = "A2";
		i[2][1] = "B2";
		i[2][2] = "C2";
		i[2][3] = "D2";
		i[2][4] = "E2";
		
		int no_of_rows = i.length;
		int no_of_coloums = i[0].length;
		
		System.out.println("No of rows present in the array is : "+no_of_rows);
		System.out.println("No of coloums present in the array is : "+no_of_coloums);
		
		for(int row = 0; row< no_of_rows; row++){
			
			for(int col = 0; col< no_of_coloums; col++){
				
				System.out.print(i[row][col]+"  ");
			}
			System.out.println("");
		}
	}

}

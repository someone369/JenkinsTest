package javaPractice;

public class ArrayExample {

	public static void main(String[] args) {
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		int size_of_array = i.length;
		
		for(int j=0; j<size_of_array; j++){
			
			System.out.println(i[j]);
		}
	}

}

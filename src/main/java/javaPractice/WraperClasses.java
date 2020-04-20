package javaPractice;

public class WraperClasses {

	public static void main(String[] args) {
		
		//  Wrapper classes means we are converting the data type 
		// Data conversion from String to integer
		String i = "100";
		// This is called String concatenation
		System.out.println(i+10);
		
		int num = Integer.parseInt(i);
		System.out.println(num+10);
		
		// Data conversion from string to Double 
		String d = "12.23";
		Double d2 = Double.parseDouble(d);
		
		System.out.println(d2);
		
		//Data conversion from String to Boolean
		String s = "true";
		boolean b = Boolean.parseBoolean(s);
		System.out.println(s);
		
		//Data conversion from integer to String
		int k = 121;
		String nm = String.valueOf(k);
		System.out.println(nm);
		
		// Here this is not a pure integer so we will get NumberFormatException in the run time
		String snum = "100A";
		
		Integer in = Integer.parseInt(snum);
		System.out.println(in);
	}

}

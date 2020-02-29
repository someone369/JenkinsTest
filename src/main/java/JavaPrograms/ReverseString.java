package JavaPrograms;

public class ReverseString {
	
	public static void main(String[] args) {
		
	 String  s = "lakshmi";
	 String rev = "";
	 int length = s.length();
	 // First method to print the reverse a string
	 for(int i=length-1; i>=0; i--){
		 rev = rev+s.charAt(i);
	 }
	 System.out.println(rev);
	 
	 // sceond method to print reverse a string
	 StringBuffer sb = new StringBuffer(s);
	 StringBuffer reverse = sb.reverse();
	 System.out.println(reverse);
}
}

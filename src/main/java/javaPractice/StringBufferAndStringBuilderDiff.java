package javaPractice;

public class StringBufferAndStringBuilderDiff {

	public static void main(String[] args) {

		int n = 999999999;
		long t;
		
	{
		System.out.println("StringBuffer start time : " + System.currentTimeMillis());
		StringBuffer sbf = new StringBuffer();
		for (int i = n; i-- > 0;) {
			sbf.append("");
		}
		System.out.println("StringBuffer end time    : " + System.currentTimeMillis());
	}
	{
		System.out.println("StringBuilder start time : " + System.currentTimeMillis());
		StringBuilder sbd = new StringBuilder();
		for (int i = n; i-- > 0;) {
			sbd.append("");
		}
		System.out.println("StringBuilder end time   : " + System.currentTimeMillis());
	}
	
	}

}

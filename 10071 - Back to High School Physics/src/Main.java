import java.util.Scanner;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=new Scanner (System.in);
		 while(in.hasNext())
	     {
			long v=in.nextLong();
	        long t=in.nextLong();
			System.out.println(2*v*t);			
		}	
	}
}

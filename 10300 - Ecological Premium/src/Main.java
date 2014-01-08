import java.util.Scanner;


class Main {

	/**
	 * @param args
	 */
	private static Scanner scanner;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner=new Scanner(System.in);
		int testCount=scanner.nextInt();
		while(testCount>0){
			testCount--;
			RunTest();
		}
		System.exit(0);
	}
	
	public static void RunTest(){
		int farmerCount=scanner.nextInt();
		int totalFee=0;
		while(farmerCount>0){
			farmerCount--;
			totalFee+=GetFee();
		}
		System.out.println(totalFee);
	}
	
	public static int GetFee(){				
		int square=scanner.nextInt();
		scanner.nextInt();
		Integer ef=scanner.nextInt();
		return square*ef;
	}
}

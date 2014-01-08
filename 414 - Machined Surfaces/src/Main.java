import java.util.Scanner;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int count = scanner.nextInt();
			scanner.nextLine();
			if (count == 0) {
				break;
			}
			String[] strings = new String[count];
			int max = 0;
			while (count > 0) {
				String str = scanner.nextLine().replaceAll(" ", "");
				strings[--count] = str;
				max = str.length() > max ? str.length() : max;
			}
			int result=0;
			for (String str : strings) {
				result+=max-str.length();
			}
			System.out.println(result);
		}
	}
}

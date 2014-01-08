import java.util.Scanner;

class Main {

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			boolean start = false;
			int count = 0;
			char[] words = s.nextLine().toCharArray();
			for (char st : words) {
				if (Character.isLetter(st)) {
					if (!start) {
						count++;
						start = true;
					}
				} else {
					start = false;
				}
			}
			System.out.println(count);
		}
	}
}
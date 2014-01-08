import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		char c;
		String kal;
		while ((s.hasNext())) {
			kal = s.nextLine();
			if (kal.isEmpty() == false) {
				for (int i = 0; i < kal.length(); i++) {
					c = (char) (kal.charAt(i) - 7);
					System.out.print(c);
				}
				System.out.println();
			} else
				break;
		}
	}

}

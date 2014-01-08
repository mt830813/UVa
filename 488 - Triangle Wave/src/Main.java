import java.util.Scanner;

class Main {
	private static String[] attitude = { "1", "22", "333", "4444", "55555",
			"666666", "7777777", "88888888", "999999999" };

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int caseCount = s.nextInt();
		while (caseCount > 0) {
			caseCount--;
			int height = s.nextInt();
			int repetCount = s.nextInt();
			String str = DrawTriangle(height);
			for (int i = 0; i < repetCount; i++) {
				System.out.println(str);
				if (i != repetCount - 1) {
					System.out.println();
				}
			}
		}
	}

	private static String DrawTriangle(int height) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < height; i++) {
			sb.append(attitude[i]);
			sb.append('\n');
		}
		for (int i = height - 2; i >= 0; i--) {
			sb.append(attitude[i]);
			if (i != 0) {
				sb.append('\n');
			}
		}
		return sb.toString();
	}
}
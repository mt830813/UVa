import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws Exception {
		MyScanner s = new MyScanner(System.in);

		int count = s.nextInt();
		int index = 1;
		while (count > 0) {
			count--;
			
			int l = s.nextInt();
			int t = s.nextInt();
			int n = s.nextInt();
			Ant[] before = new Ant[n];
			Ant[] after = new Ant[n];
			int[] order = new int[n];
			for (int i = 0; i < n; i++) {
				Ant tempB=new Ant(i, s.nextInt(), s.next());
				before[i] = tempB;
				after[i] = new Ant(i, tempB.pos + t * tempB.dir,
						tempB.status);
			}
			Arrays.sort(before);
			for (int i = 0; i < n; i++) {
				order[before[i].index] = i;
			}

			Arrays.sort(after);
			for (int i = 0; i < n - 1; i++) {
				if (after[i].pos == after[i + 1].pos) {
					after[i].status = after[i + 1].status = "Turning";
				}
			}

			System.out.printf("Case #%d\n", index);
			index++;
			for (int i = 0; i < n; i++) {
				Ant ant = after[order[i]];
				if (ant.pos > l || ant.pos < 0) {
					System.out.println("Fell off");
				} else {
					System.out.printf("%d %s\n", ant.pos, ant.status);
				}
			}
			System.out.println();
		}

	}

}

class Ant implements Comparable<Ant> {
	int index;
	int dir;
	int pos;
	String status;

	Ant(int index, int pos, String dir) {
		this.index = index;
		this.dir = dir.equals("L") ? -1 : 1;
		this.pos = pos;
		this.status = dir;
	}

	@Override
	public int compareTo(Ant o) {
		if (this.pos > o.pos) {
			return 1;
		} else if (this.pos < o.pos) {
			return -1;
		}
		return 0;
	}
}

class MyScanner {
	BufferedReader reader;

	StringTokenizer tokenizer;

	MyScanner(InputStream input) {
		reader = new BufferedReader(new InputStreamReader(input));
		tokenizer = new StringTokenizer("");
	}

	String next() throws IOException {
		while (!tokenizer.hasMoreTokens()) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	boolean hasNext() throws IOException {
		reader.mark(4000);
		boolean returnValue = (reader.readLine() != null);
		reader.reset();
		return returnValue;
	}

	int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}
}
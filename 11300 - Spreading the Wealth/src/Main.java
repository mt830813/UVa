import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws Exception {
		MyScanner s = new MyScanner(System.in);		
		while (s.hasNext()) {
			int n=s.nextInt();
			int[] a=new int[n];
			int[] c=new int[n];
			long total=0;
			int m=0;
			
			for(int i=0;i<n;i++){
				a[i]=s.nextInt();
				total+=a[i];
			}		
			m=(int)total/n;
			for(int i=1;i<n;i++){
				c[i]= c[i - 1]+a[i]-m;
			}
			
			total=0;
			Arrays.sort(c);
			int x1=c[n/2-1];
			for(int i=0;i<n;i++){
				total+=Math.abs(x1-c[i]);
			}
			System.out.println(total);
		}
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
	
	boolean hasNext() throws IOException{
		reader.mark(4000);
		boolean returnValue=(reader.readLine()!=null);
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
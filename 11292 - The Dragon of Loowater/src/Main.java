import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws Exception {
		MyScanner s = new MyScanner(System.in);
		while(s.hasNext()){
			int n=s.nextInt();
			int m=s.nextInt();
			if(n==m&&n==0){
				break;
			}
			int[] heads=new int[n];
			int[] knights=new int[m];
			for(int i=0;i<n;i++){
				heads[i]=s.nextInt();
			}
			for(int i=0;i<m;i++){
				knights[i]=s.nextInt();
			}	
			Arrays.sort(heads);			
			Arrays.sort(knights);
			
			int headsIndex=0;
			int total=0;
			for(int i=0;i<m;i++){
				if(knights[i]>=heads[headsIndex]){
					total+=knights[i];
					headsIndex++;
					if(headsIndex==n){
						break;
					}
				}
			}
			
			if(headsIndex<n){
				total=0;
			}
			
			if(total==0){
				System.out.println("Loowater is doomed!");
			}else{
				System.out.println(total);
			}
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
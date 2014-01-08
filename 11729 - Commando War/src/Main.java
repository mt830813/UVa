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
		int caseIndex=1;
		while (s.hasNext()) {
			int n=s.nextInt();			
			if(n==0) break;
			Task[] tasks=new Task[n];
			for(int i=0;i<n;i++){
				tasks[i]=new Task(s.nextInt(),s.nextInt());
			}
			
			Arrays.sort(tasks,Collections.reverseOrder());
			
			int total=0;
			int bTotal=0;
			for(Task task :tasks){
				bTotal+=task.B;
				total=total>(bTotal+task.J)?total:bTotal+task.J;
			}
			System.out.println("Case "+caseIndex+": "+total);
			caseIndex++;
		}
	}
}

class TaskComparator implements Comparator<Task>{
	public int compare(Task o1, Task o2) {
		if(o1.J< o2.J){
			return -1;
		}else if(o1.J>o2.J){
			return 1;
		}else{
			return 0;
		}
	};
}

class Task implements Comparable<Task>{
	int B;
	int J;
	Task(int B,int J){
		this.B=B;
		this.J=J;
	}
	@Override
	public int compareTo(Task o) {
		if(o.J>this.J){
			return -1;
		}else if(o.J<this.J){
			return 1;
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
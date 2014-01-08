import java.util.Scanner;

class Main {

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine()){
			String string=s.nextLine();
			if(string.length()==0){
				System.out.println();
			}else{
				int count=0;
				for(char c:string.toCharArray()){
					if(c=='!'){
						System.out.println();
					}else if(Character.isDigit(c)){						
						count+=Character.getNumericValue(c);
					}else{						
						if(c=='b'){
							c=' ';
						}
						for(int i=0;i<count;i++){							
							System.out.print(c);													
						}
						count=0;
					}
				}
				System.out.println();
			}
		}
	}
}
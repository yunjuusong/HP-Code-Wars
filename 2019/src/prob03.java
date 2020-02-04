import java.util.*;
import java.io.*;

public class prob03 {
	
	static String file = "prob03";
	static Scanner in;
	static PrintWriter out;
	
	public static void main(String[] args) throws IOException {
		for(int i = 1; i <= 3; i++){
			in = new Scanner (new File(file+"-"+i+ "-in.txt"));
			out = new PrintWriter(new File("out.txt"));
		
		
			int n = 1;
		
			for(int j = 0; j < n; j++){
				init();
				solve();
			}
		
			in.close(); out.close();
			System.out.print("\n" + i + " ");
			Check.check("out.txt", file+"-"+i+ "-out.txt");
		}

	}
	private static void init(){
		
	}
	private static void solve(){
		int rope = in.nextInt();
		double temp = Math.round(3.14159*rope*rope*0.75*100);
		temp = temp/100;
		out.printf("%.2f", temp);
	}
}

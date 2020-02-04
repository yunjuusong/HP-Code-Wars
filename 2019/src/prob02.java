import java.util.*;
import java.io.*;

public class prob02 {
	
	static String file = "prob02";
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
		int h = in.nextInt();
		int m = in.nextInt();
		int s = in.nextInt();
		
		if(h >= (double)m/s) out.println(h+ " " + m + " " + s + ". " + "I will make it!");
		
		else out.println(h+ " " + m + " " + s + ". " + "I will be late!");
	}
}

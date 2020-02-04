import java.util.*;
import java.io.*;

public class prob04 {
	
	static String file = "prob04";
	static Scanner in;
	static PrintWriter out;
	static double total;
	static double taxRate;
	
	public static void main(String[] args) throws IOException {
		for(int i = 1; i <= 3; i++){
			in = new Scanner (new File(file+"-"+i+ "-in.txt"));
			out = new PrintWriter(new File("out.txt"));
		
		
			int n = Integer.parseInt(in.nextLine());
		
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
		taxRate = in.nextDouble();
		total = in.nextDouble();
	}
	private static void solve(){
		taxRate = taxRate/100;
		double preTax = total/ (1.0 + taxRate);
		double taxAmt = preTax * taxRate;
		out.printf("On your " + "$%.2f", total);
		out.printf(" purchase, the tax amount is " + "$%.2f", taxAmt);
		out.println();
	}
}
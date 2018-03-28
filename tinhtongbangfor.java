import java.util.Scanner;
//import java.util.

public class tinhtongbangfor {
	public static void main(String[] args) {
		long a;
		System.out.println("nhap vao so can tinh tong");
		a = new Scanner(System.in).nextLong();
		long b = 0, s = 0;
		// c=1+(int)Math.log10(a);
		//System.out.println(" " + (int) Math.log10(a));
		int c = 1+(int) Math.log10(a);
		System.out.println("so cac chu so cua so da nhap la " + c);
		for (long i = 0; ; i++) {
			b = a % 10;
			s += b;
			a /= 10;
			if (a==0) {
				break;
			}
			// System.out.println("tong cac chu so la " + a);

		}
		System.out.println("tong cac chu so la " + s);
	}
}

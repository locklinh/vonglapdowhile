import java.util.Scanner;

public class tongcacchuso {
	public static void main(String[] args) {
		int a;
		System.out.println("nhap vao so can tinh tong");
		a = new Scanner(System.in).nextInt();
		long n;
		int s = 0;
		do {
			n = a % 10;
			s += n;
			a /= 10;
		} while (a!=0);
		System.out.println("tong cua so da nhap la " +s);
	}
	
}
import java.util.Scanner;

public class chuyencoso {
	// public static void main (String[] args) {
	// int n;
	// System.out.println("nhap vao so n");
	// n=new Scanner (System.in).nextInt();
	// System.out.println("nhap vao co so b");
	// b=new Scanner (System.in).nextInt();
	public static int tinhTong(long i) {
		int sum = 0;
		long n;
		while (i != 0) {
			n = i % 10;
			sum += n;
			i /= 10;
			
		}
		return (sum);
	}

	public static void main(String[] args) {
		System.out.print("Nhap n");
		int n;
		n = new Scanner(System.in).nextInt();
		// int n= nhap();
		System.out.println("Tong cua so " + n + " = " + tinhTong(n));
	}

}

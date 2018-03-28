import java.util.Scanner;

public class tinhtongbanggoto {
	public static void main(String[] args) {
		long a;
		System.out.println("nhap vao so can tinh tong");
		a = new Scanner(System.in).nextLong();
		long b = 0, s = 0;
		// c=1+(int)Math.log10(a);
		//System.out.println(" " + (int) Math.log10(a));
		//int c = 1+(int) Math.log10(a);
		//System.out.println("so cac chu so cua so da nhap la " + c);
		asc:
				b=a%10;
				s+=b;
				a/=10;
			if(a!=0) {
			continue asc;
			}
		}

}
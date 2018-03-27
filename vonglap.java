// I'm in top
import java.util.Scanner; 
public class vonglap {
public static void main (String[] args) {
	int a ;
	
	System.out.println("nhap vao so phan tu cua mang");
	a=new Scanner(System.in).nextInt();
	
	int b[]=new int[10];
	//b=new Scanner(System.in).nextInt();
	for (int i=0;i<5;i++)
	{
		b[i]=new Scanner(System.in).nextInt();
	}
	System.out.println(" phan tu lon nhat la "+timphantumax(b,a));
	 
}

 public static int timphantumax(int b[],int a) {
	int max= b[0];
	int i=0;
	while (i<a) {
	if (b[i]>max) {
		//tg=max;
		max=b[i];
		//b[i]=tg;
		i++;
	}
	else i++;
	}
	return max;
	//for(i=0;i<a;i++) {
	//	
	//}
	
}
	
}

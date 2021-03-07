import java.util.*;
public class ArrSq {
	
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	int sum=0;
	int a[] = new int[10];
	int sq[]=new int[10];
	for(int i=0;i<10;i++)
	  {
		a[i]=sc.nextInt();
		sq[i]=a[i]*a[i];
		sum=sum+sq[i];
	  }
	System.out.println("sum of square of nos="+sum);
}
}



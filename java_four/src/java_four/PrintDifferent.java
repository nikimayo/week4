package java_four;
import java.util.Scanner;
public class PrintDifferent {
	public static void main(String[] args) {
        System.out.print("Enter 10 numbers:");
        int[] a=new int[100];
        Scanner input=new Scanner(System.in);
        int i=0,j=0,times=0;
        int n,f=0;
        for(i=0;i<10;i++){
            n=input.nextInt();
             f=0;
            for(j=0;j<i;j++){
                if(n==a[j]) {
                    f = 1;
                    break;
                }
            }
            if(f==0) {
            	times+=1;
            	a[times]=n;
            }
        }
        System.out.println("The number of distinct numbers is "+times);
        System.out.print("The distinct numbers are:");
        for(i=0;i<times;i++){
            System.out.print(" "+a[i]);
        }
    }

}


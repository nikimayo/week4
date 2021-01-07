package java_four;
import java.util.Scanner;
import java.util.Arrays;
public class IsOk {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of of the list: ");
        int aa = input.nextInt();
        System.out.print("Enter the contents of of the list: ");
        int max = 10000,i=0;
        int[] a = new int[max];
        int n = input.nextInt();
        int flag=0;
        for(i = 0;i < n;++ i){
            a[i] = input.nextInt();
        }
        System.out.print("The list has "+aa+"intergers");
        for( i = 0;i < n;++ i){
        	System.out.print(a[i]);
        }
      
        for(i = 0;i < n-1;++i){
            if(a[i] > a[i+1]){
                flag = 1;
                break;
            }
        }
        
        if(flag==1){
            System.out.println("The list is already sorted");
        }else{
            System.out.println("The list is not sorted");
        }
    }
}

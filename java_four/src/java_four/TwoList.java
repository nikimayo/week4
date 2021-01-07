package java_four;
import java.util.Scanner;
import java.util.Arrays;
public class TwoList {
	 public static void main(String[] args) {
		 
		
		 
	        Scanner input = new Scanner(System.in);
	        int max = 100;
	        int[] a = new  int[max];
	        int[] b = new  int[max];
	        int i,j;
	        System.out.print("Enter list1 : ");
	        a[0] = input.nextInt();
	        for(i = 1; i <= a[0] ; ++i){
	            a[i] = input.nextInt();
	        }
	        System.out.print("Enter list2 : ");
	        b[0] = input.nextInt();
	        for(i = 1;i <= b[0];++i){
	            b[i] = input.nextInt();
	        }
	        System.out.print("The merged list is ");
	        int[] c = merge(a,b);
	        for( i = 1;i <= a[0] + b[0];++i) {
	            System.out.print(c[i] + " ");
	        }
	    }
	 
	 public static int[] merge(int[] l1,int[] l2){
		 int i;
	        int[] s = new int[100];
	        for(i = 1;i <= l1[0]+l2[0];++ i){
	            if(i<=l1[0]) s[i] = l1[i];
	            else s[i] = l2[i-l1[0]];
	        }
	        Arrays.sort(s,1,l1[0]+l2[0]+1);
	        return s;
	    }
	   
	    
}

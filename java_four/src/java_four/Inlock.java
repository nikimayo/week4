package java_four;
import java.util.Scanner;
import java.util.Arrays;
public class Inlock {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=1,j=1;
        int max= 10000;
        int[] a = new int[max];
        for(i = 1;i <= 100;++i){
            a[i] = -1;
        }
        for(i = 1;i <= 100;++i){
            for(j = i;j <=100;j = j + i){
                a[j] = a[j] *(-1);
            }
        }
        System.out.print("opend£º");
        for(i = 1;i <= 100;++i){
            if(a[i] == 1){
                System.out.print(i+" ");
            }
        }
    }
}

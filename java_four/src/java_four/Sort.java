package java_four;
import java.util.Scanner;
public class Sort {public static void main(String[] args) {
    double[] a=new double[11];
    int i=0,j=0;
    double x=a[j];
    Scanner input=new Scanner(System.in);
    for(i=0;i<10;i++){
        a[i]=input.nextDouble();
    }
    for(i=0;i<10;i++){
        for(j=0;j<9;j++){
            if(a[j]>a[j+1]){
                x=a[j];
                a[j]=a[j+1];
                a[j+1]=x;
            }
        }
    }
    for(i=0;i<10;i++){
        System.out.print(a[i]+"->");
    }
}

}

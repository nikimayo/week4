package java_four;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Youhuijuan {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 10000;
        int i=0;
        String[] aa = new String[max];
        String[] bb= new String[max];
        int[] a = new int[max];
        for(i = 0;i < 4;++ i){
            a[i] = 0;
        }
        for(i = 0;i < 4;++ i){
            if(i==0) aa[i] = "Spades";
            else if(i==1) aa[i] = "Clubs";
            else if(i==2) aa[i] = "Hearts";
            else if(i==3) aa[i] = "Diamonds";
        }
        for(i = 1;i<=13;++i){
            if(i == 1) bb[i] = "A";
            else if(i==2) bb[i] = "2";
            else if(i==3) bb[i] = "3";
            else if(i==4) bb[i] = "4";
            else if(i==5) bb[i] = "5";
            else if(i==6) bb[i] = "6";
            else if(i==7) bb[i] = "7";
            else if(i==8) bb[i] = "8";
            else if(i==9) bb[i] = "9";
            else if(i==10) bb[i] = "10";
            else if(i==11) bb[i] = "Jack";
            else if(i==12) bb[i] = "Queen";
            else if(i==13) bb[i] = "King";
        }
        Random r = new Random();
        int n = 0;
        int m = 0;
        int x;
        int b;
        while(n<4){
            x = 1 + r.nextInt(13);
            b = r.nextInt(4);
            if(a[b] == 0){
                System.out.println(aa[x]+" of "+bb[x]);
                a[b]++;
                n++;
            }
            m++;
        }
        System.out.println("Number of picks : "+m);
    }
}


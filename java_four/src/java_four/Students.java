package java_four;
import java.util.Scanner;

class info{
    String name;
    int mark;
}

public class Students {
	 public static void main(String[] args) {
	        Scanner input=new Scanner(System.in);
	        int n=input.nextInt();
	        int i,j,maxp;
	        info[] a=new info[110];
	        for(i=0;i<n;i++){
	            a[i].name=input.next();
	            a[i].mark=input.nextInt();
	        }
	        for(i=0;i<n;i++){
	            maxp=i;
	            for(j=i+1;j<n;j++){
	                if(a[j].mark>a[maxp].mark){
	                    maxp=j;
	                }
	            }
	            int tmp=a[i].mark;
	            a[i].mark=a[maxp].mark;
	            a[maxp].mark=tmp;
	            String tmpex=a[i].name;
	            a[i].name=a[maxp].name;
	            a[maxp].name=tmpex;
	        }
	        for(i=0;i<n;i++){
	            System.out.println(a[i].name+" "+a[i].mark);
	        }
	    }
}

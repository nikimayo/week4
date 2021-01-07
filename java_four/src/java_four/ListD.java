package java_four;
import java.util.Scanner;
public class ListD {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        System.out.println(sort(a));
    }
    public static String sort(String s){
        int n = s.length();
        int j,i;
        char[] b = s.toCharArray();
        for( i = 0;i < n-1;++ i){
            for(j = 0;j < n-1-i;++j){
                if(b[j] > b[j+1]){
                    char tool = b[j+1];
                    b[j+1] = b[j];
                    b[j] = tool;
                }
            }
        }
        String s1 = String.valueOf(b);
        return s1;
    }
}

import java.util.*;
public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        int b=0;
        while(a!= 0){
            a=a/10;
            b++;

        }
        System.out.println(b);
    }
}
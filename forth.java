import java.util.*;
public class forth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the lower number ");
        int a= sc.nextInt();
        System.out.println("give the upper number ");
        int b= sc.nextInt();

        for(int i =a; i<=b; i++){
            int count = 0;
            for(int j = 2; j*j <= i; j++){
                if(i % j == 0){
                    count++;
                    break;
                }
            }
            if(count == 0 && i > 1){
                System.out.println(i );

            }
        }

    }
}
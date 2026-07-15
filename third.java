/*import java.util.*;
public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("give the number ");

        for(int i = 0; i < a; i++) {
            
            int b = sc.nextInt();
            int count = 0;

            for(int j = 1; j <= b; j++) {
                if(b % j == 0) {
                    count++;
                }
            }
            if(count == 2) {
                System.out.println("the number is prime");
            } else {
                System.out.println("the number is not prime");
            }
        }

        
        }

    }*/
/*alternative  */

import java.util.*;
public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the number ");
        int a = sc.nextInt();
        for(int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int count = 0;
            for(int j = 2; j*j <= b; j++) {
                if(b % j == 0) {
                    count++;
                    break;
                }
            }
            if(count == 0 ) {
                System.out.println("the number is prime");
            } else {
                System.out.println("the number is not prime");
            }
        }
    }
}   
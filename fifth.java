import java.util.*; 
 public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello");
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int next=a+b;
            a=b;
            b=next;
            
        }
    }
}





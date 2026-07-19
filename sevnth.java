import java.util.*;
 public class sevnth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int nod = 0;
        int temp = a;

        while( temp != 0){
            temp =temp/10 ;
            nod++;
        }
        int ned= nod;
        for (int i =0 ; i<ned ; i++){
             int m =(int)Math.pow(10,nod-1);
            
            nod=nod-1;
            int v = a/m;
            a=a%m;
            System.out.println(v);

            
        }
     }
}

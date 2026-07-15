import java.util.*;
public class second {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>=90){
            System.out.println(" is good");
        }
        else if(x<90 && x>=80){
            System.out.println(x+ " is fair");
        }
        else if(x<80 && x>=70){
            System.out.println(x+ " isaverage");
        }
        else if(x<70 && x>=60){
            System.out.println(x+ " is poor");
        }
        else{
            System.out.println(x+ " is fail");
        }
        
    }
}

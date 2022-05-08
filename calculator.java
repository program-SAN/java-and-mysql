
import java.util.Scanner;
public class exp2 {
    public static void main(String[] args) {
        System.out.println("calculator with switch");
        System.out.println("enter num");
        System.out.println("1 for sum");
        System.out.println("2 for sub");
        System.out.println("3 for mul");
        System.out.println("4 for div");
        Scanner no1=new Scanner(System.in);
        int s= no1.nextInt();
        System.out.println("enter 2 num");
        Scanner no2=new Scanner(System.in);
        int p= no2.nextInt();
        int q= no2.nextInt();
        switch (s){
            case 1:
                System.out.println("sum is "+p+" "+q+" "+(p+q));
                break;

            case 2:
                System.out.println("sum is "+p+" "+q+" "+(p-q));
                break;
            case 3:
                System.out.println("sum is "+p+" "+q+" "+(p*q));
                break;
            case 4:
                System.out.println("sum is "+p+" "+q+" "+(p/q));
                break;
            default:
                System.out.println("incorrect num was entered");
        }
    }
}

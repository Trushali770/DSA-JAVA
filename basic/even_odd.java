import java.util.Scanner;

public class even_odd{
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = info.nextInt();
        if(num % 2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

    }
}
import java.util.Scanner;

public class simple_interest{
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.print("Principal: ");
        float principal = info.nextFloat();
        System.out.print("Time: ");
        float time = info.nextFloat();
        System.out.print("Rate: ");
        float rate = info.nextFloat();
        float SI= (principal * rate * time)/100;
        System.out.println("Simple Interest: "+SI);


    }}
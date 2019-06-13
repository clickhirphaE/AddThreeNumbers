import java.util.Scanner;
public class AddThreeNumbersAndPrintTotal {
    public static void main(String args[]){
        Double numbers;
        Double Sum=0.0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        for(int i=0;i<3;i++) {
            numbers = sc.nextDouble();
            Sum=Sum+numbers;
        }
        System.out.println("Sum:"+Sum);

}}

package lecture01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("B2211830 Yuki Nishida");

        int studentNumber = 2211830;
        System.out.println("B" + studentNumber + " Yuki Nishida");

        Scanner inputAge = new Scanner(System.in);
        System.out.print("age = ");
        int age = inputAge.nextInt();

        if(age<20){
            System.out.println("I am " + age + " years old so I cannot drink lipuor.");
        }
        else{
            System.out.println("I am " + age + " years old so I can drink lipuor.");
        }

        int[] array = new int[100];
        int sum = 0;
        for(int i=0;i<array.length;i++){
            array[i] = i + 1;
            if(i%2==0){
                sum = sum + array[i];
            }
        }
        System.out.println("sum = " + sum);

    }
}

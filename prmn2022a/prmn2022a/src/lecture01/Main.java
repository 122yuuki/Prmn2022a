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

        int[] score = {41,85,72,38,80};
        for(int i=0;i<score.length;i++){
            if(score[i]<60){
                System.out.println(i + "番 " + score[i] + " 不可");
            }
            else if(score[i]<70){
                System.out.println(i + "番 " + score[i] + " 可");
            }
            else if(score[i]<80){
                System.out.println(i + "番 " + score[i] + " 良");
            }
            else if(score[i]<90){
                System.out.println(i + "番 " + score[i] + " 優");
            }
            else{
                System.out.println(i + "番 " + score[i] + " 秀");
            }
        }

        Keisan keisan = new Keisan();
        int x = keisan.max(score);
        int y = keisan.min(score);
        double z = keisan.average(score);

        System.out.println("最高点：" + x);
        System.out.println("最低点：" + y);
        System.out.println("平均点：" + z);

        }
    }

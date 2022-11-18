import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("小数値を入力してください：");

        try{
            double l = input.nextDouble();  //もしかしたらエラーが起きるかもしれない処理をtry内に記述
            System.out.println("入力した値： " + l);  //今回の場合は、Double型の数値が入力されたら、上記の処理以降の処理を実行する。
        }
        catch(InputMismatchException e){
            System.out.println("エラー.");
        }

    }
}

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_3 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arraylist = new ArrayList<Integer>();

        for(int i=0;i<5;i++){
            arraylist.add(random.nextInt(6)+1);
        }

        System.out.println("さいころを5つ降りました。");
        System.out.print("何番目のさいころの値を確認しますか？：");

        try{
            int index = input.nextInt();
            System.out.println(index + " 番目のさいころの値：" + arraylist.get(index-1));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました。");
            System.out.println("プログラムを終了します。");
        }
        catch(InputMismatchException e){
            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します。");
        }
    }
}

package lecture03;

import java.util.Scanner;
import java.util.ArrayList;
public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> num = new ArrayList<>();
        int sum = 0;

        for(int i=1;i<3;i++){
            System.out.print(i + "つ目の整数を入力してください：");
            String n = input.next();
            num.add(n);
            int m = Integer.parseInt(n);
            sum = sum + m;
        }

        System.out.println(num.get(0) + " + " + num.get(1) + " = " + sum);

    }
}

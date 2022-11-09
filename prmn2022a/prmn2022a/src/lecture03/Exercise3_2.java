package lecture03;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_2 {
    public static void main(String[] args) {

        ArrayList<String> moziretu = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("何行分入力しますか？：");
        int n = input.nextInt();
        input.nextLine();

        for(int i=0;i<n;i++){

            System.out.print(i+1 + "行目：");
            String mozi = input.next();
            moziretu.add(mozi);

        }

        int j=0;
        for(String mozi : moziretu){
            System.out.println("[" + j + "] " + moziretu.get(j));
            j++;
        }




    }
}

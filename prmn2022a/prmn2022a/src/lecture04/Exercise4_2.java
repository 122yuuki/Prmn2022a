package lecture04;

import java.util.Scanner;
public class Exercise4_2 {
    public static void main(String[] args) {

        ATM atm = new ATM();
        Scanner input = new Scanner(System.in);

        System.out.print("名前：");
        String name_n = input.next();
        System.out.print("口座番号：");
        String num = input.next();

        if(atm.existsAccount(name_n,num)){
            System.out.println("名前；" + name_n + " 口座番号：" + num + "　は存在します。");
        }
        else{
            System.out.println("名前：" + name_n + " 口座番号：" + num + "　は存在しません。");
            atm.registerAccount(name_n,num);
            System.out.println(name_n + " さんのアカウントを口座番号:" + num + " で登録しました。");
        }

        while(true){
            System.out.print("「入金」「引出」「終了」のいずれかを入力してください。：");
            String h = input.next();
            String[] hh = new String[3];
            hh[0] = "入金";
            hh[1] = "引出";
            hh[2] = "終了";

            if(h.equals(hh[0])) {
                System.out.print("入金する金額：");
                long n = input.nextLong();
                System.out.print("口座番号：");
                String num_n = input.next();
                atm.deposit(num_n, n);
            }
            else if(h.equals(hh[1])){
                System.out.print("引き出す金額：");
                long n = input.nextLong();
                System.out.print("口座番号：");
                String num_n = input.next();
                long nn = atm.withdraw(num_n,n);
                if(nn != -1){
                    System.out.println("残高:" + nn + "円");
                }
            }
            else if(h.equals(hh[2])){
                break;
            }
            else{
                System.out.println("正しい文字を入力してください。");
                continue;
            }
        }

    }
}

package lecture04;

import java.util.ArrayList;
public class ATM {

    ArrayList<Account> accountList = new ArrayList<Account>();

    ATM(){
        accountList.add(new Account("西田裕樹","21109"));
    }

    public void registerAccount(String name,String number){
        accountList.add(new Account(name,number));
    }

    public boolean existsAccount(String name,String number){
        int ii=0,jj=0;
        for(int i=0;i<accountList.size();i++){
            if(accountList.get(i).name.equals(name)){
                ii = 1;
            }
            if(accountList.get(i).number.equals(number)){
                jj = 1;
            }
        }
        return ii==1 && jj==1;
    }

    public void deposit(String number,long money){
        int ii=0;
        int j=0;
        for(int i=0;i<accountList.size();i++){
            if(accountList.get(i).number.equals(number)){
                ii = 1;
                j = i;
            }
        }

        if(ii == 1){
            accountList.get(j).balance += money;
            System.out.println("口座番号:" + number + " に " + money + " 円入金しました。　残高:" + accountList.get(j).balance);
        }
        else{
            System.out.println("口座番号が存在しません。");
        }
    }

    public long withdraw(String number,long money){
        int ii=0;
        int j=0;
        for(int i=0;i<accountList.size();i++){
            if(accountList.get(i).number.equals(number)){
                ii = 1;
                j = i;
            }
        }

        if(ii == 1){
            if(accountList.get(j).balance >= money) {
                accountList.get(j).balance -= money;
                System.out.print("口座番号:" + number + " から " + money + " 円引き出ししました。　");
                return accountList.get(j).balance;
            }
            else{
                System.out.print("口座番号:" + number + " から " + money + " 円引き出せませんでした。　");
                return accountList.get(j).balance;
            }
        }
        else{
            System.out.println("口座番号が存在しません。");
            return -1;
        }
    }

}

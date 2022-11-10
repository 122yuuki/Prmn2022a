package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {

        Fighter my = new Fighter(100,40,"hogehoge");
        Fighter you = new Fighter(300,10,"maou");

        System.out.println(my.getName() + "のHP：" + my.getHitPoint());
        System.out.println(you.getName() + "のHP：" + you.getHitPoint());
        System.out.println();

        while(true){

            my.attack(you);   //
            System.out.println(you.getName() + " の残り　hitpoint ：" + you.getHitPoint());
            if(you.isAlive()){
                System.out.print(you.getName() + " は倒れた。");
                break;
            }
            you.attack(my);
            System.out.println(my.getName() + " の残り　hitpoint ：" + my.getHitPoint());
            if(my.isAlive()){
                System.out.println(my.getName() + " は倒れた。");
                break;
            }
            System.out.println();

        }

<<<<<<< HEAD
=======





>>>>>>> refs/remotes/origin/main
    }
}

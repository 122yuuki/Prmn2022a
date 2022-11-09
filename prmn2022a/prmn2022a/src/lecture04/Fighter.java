package lecture04;

public class Fighter {
        private int hitPoint;
        private int power;
        private String name;

        public Fighter(int hitPoint,int power,String name){
            this.hitPoint = hitPoint;
            this.power = power;
            this.name = name;
        }

        public void attack(lecture04.Fighter enemy){
            enemy.hitPoint = enemy.hitPoint - power;
            System.out.println(name + " は " + enemy.name + " に " + power + " のダメージを与えた。");
        }

        boolean isAlive(){
            return hitPoint<=0;
        }

        public int getHitPoint(){
            return this.hitPoint;
        }

        public void setHitPoint(int hitPoint){      //何に使う？
            this.hitPoint = hitPoint;
        }

        public String getName(){
            return this.name;
        }
    }


package lecture03;

import java.util.ArrayList;
public class Exercise3_4 {
    public static void main(String[] args) {

        ArrayList<Vegetable> v = new ArrayList<Vegetable>();
        v.add(new Vegetable("にんじん",117));
        v.add(new Vegetable("たまねぎ",120));
        v.add(new Vegetable("じゃがいも",154));

        for(int i=0;i<v.size();i++){
            v.get(i).print();

        }

    }
}

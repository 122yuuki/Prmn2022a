package lecture03;

import java.sql.Array;
import java.util.ArrayList;
public class Exercise3_4 {
    public static void main(String[] args) {

        ArrayList<Vegetable> v = new ArrayList<>();
        Vegetable v1 = new Vegetable("にんじん",117);
        Vegetable v2 = new Vegetable("たまねぎ",120);
        Vegetable v3 = new Vegetable("にんじん",154);
        v.add(v1);
        v.add(v2);
        v.add(v3);

        for(int i=0;i<v.size();i++){
            v.get(i).print();

        }

    }
}

package Day31.fanxing;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Dog>dogs=new ArrayList<Dog>();
        dogs.add(new Dog("巴迪"));
        dogs.add(new Dog("豆豆"));
        List<Cat>cats=new ArrayList<Cat>();
        cats.add(new Cat("花花"));
        cats.add(new Cat("凡凡"));

        AnimalPlay animalPlay=new AnimalPlay();
        animalPlay.palylist(dogs);
        animalPlay.palylist(cats);
    }

}

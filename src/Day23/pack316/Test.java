package Day23.pack316;
import Day23.pack316.Animal;
import Day23.pack316.Cat;
import Day23.pack316.Dog;
import Day23.pack316.Sheep;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Animal arr[]=new Animal[3];

        for(int i=0;i<arr.length;i++){
            Random random=new Random();
            int j=random.nextInt();
            j=random.nextInt(3);
             if(j==0){
                 Animal cat=new Cat();
             arr[i]= new Cat();
             }
             if(j==1){
                 Animal dog=new Dog();
                 arr[i]= new Dog();
             }
             if(j==2){
                 Animal sheep=new Sheep();
                 arr[i]= new Animal();
             }

        }
        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
               arr[i].cry();
        }
    }
}

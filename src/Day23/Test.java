package Day22;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Animal arr[]=new Animal[5];

        for(int i=0;i<arr.length;i++){
            Random random=new Random();
            int j=random.nextInt();
            j=random.nextInt(3);
             if(j==0){
                 Cat cat=new Cat();
             arr[i]= new Cat();
             }
             if(j==1){
                 Dog dog=new Dog();
                 arr[i]= new Dog();
             }
             if(j==2){
                 Sheep sheep=new Sheep();
                 arr[i]= new Sheep();
             }

        }
        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
               arr[i].cry();
        }
    }
}

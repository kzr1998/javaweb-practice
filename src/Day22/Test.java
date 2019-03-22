package Day22;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Animal arr[]=new Animal[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            int a=sc.nextInt();
             if(a==0){
                 Cat cat=new Cat();

             }
             if(a==1){
                 Dog dog=new Dog();
             }
             if(a==2){
                 Sheep sheep=new Sheep();
             }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            arr[i].cry();
        }
    }
}

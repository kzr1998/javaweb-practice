package day20;

public class Tricycle extends NoMotor {
    public Tricycle(int lunzi ) {
       this.setLunzi(lunzi);
    }
    public String work(){
        String str="三轮车是一款有"+this.getLunzi()+"个轮子的非机动车。";
        return str;
    }
}

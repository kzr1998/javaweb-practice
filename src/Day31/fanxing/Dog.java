package Day31.fanxing;

public class Dog extends Anamai {
    public Dog(String name) {
        this.name=name;
    }

    @Override
    void paly() {
        System.out.println("小狗"+getName()+"在做游戏！");
    }
}

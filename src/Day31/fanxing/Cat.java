package Day31.fanxing;

public class Cat extends Anamai {
    public Cat(String name) {
        this.name=name;
    }

    @Override
    void paly() {
        System.out.println("小猫"+getName()+"在做游戏！");
    }
}

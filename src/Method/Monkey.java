package Method;

public class Monkey {
    public String name;
    public String feature;
    public Monkey(){
        System.out.println("我是使用无参构造产生的猴子：");
        this.name="长尾猴";
        this.feature="尾巴长";
        System.out.println("名称："+name);
        System.out.println("特征："+feature);

    }
    public Monkey(String name,String feature){
        System.out.println("我是使用有参构造产生的猴子：");
        this.name=name;
        this.feature=feature;
        System.out.println("名称："+name);
        System.out.println("特征："+feature);
    }
}

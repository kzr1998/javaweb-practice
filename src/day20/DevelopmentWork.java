package day20;

public class DevelopmentWork extends Work{
    private int hs;
    private int nobug;

    public DevelopmentWork(String name,int hs,int nobug) {
        super(name);
        this.setHs(hs);
        this.setNobug(nobug);
    }

    public int getHs() {
        return hs;
    }

    public void setHs(int hs) {
        this.hs = hs;
    }

    public int getNobug() {
        return nobug;
    }

    public void setNobug(int nobug) {
        this.nobug = nobug;
    }
    public String work() {
        return this.getName()+"的日报是："+"今天编写了"+this.getHs()+
                "行代码，仍发现有"+this.getNobug()+"个bug没有解决。";
    }
}

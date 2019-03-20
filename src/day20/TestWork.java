package day20;

public class TestWork extends Work{
    private int testnumber;
    private int bugnumber;

    public TestWork(String name,int testnumber,int bugnumber) {
        super(name);
        this.setTestnumber(testnumber);
        this.setBugnumber(bugnumber);
    }

    public int getTestnumber() {
        return testnumber;
    }

    public void setTestnumber(int testnumber) {
        this.testnumber = testnumber;
    }

    public int getBugnumber() {
        return bugnumber;
    }

    public void setBugnumber(int bugnumber) {
        this.bugnumber = bugnumber;
    }
    public String work() {
        return this.getName()+"的日报是："+"今天编写了"+this.getTestnumber()+
                "个测试用例，发现了"+this.getBugnumber()+"个bug。";
    }
}


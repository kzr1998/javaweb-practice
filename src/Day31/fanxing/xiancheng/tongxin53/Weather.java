package Day31.fanxing.xiancheng.tongxin53;

import java.util.Random;

public class Weather {
    private int temperature;//温度
    private int humidity;//湿度
     Boolean flag=false;// 判断生成还是读取
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    public synchronized void generate() {
        this.setTemperature((int)(Math.random()*40));
        this.setHumidity((int)(Math.random()*100));
        System.out.println("生成天气数据[温度:" + this.getTemperature() + ",湿度" + this.getHumidity() + "]");
    }

    public synchronized void read() {
        System.out.println("读取天气数据[温度:" + this.getTemperature() + ",湿度" + this.getHumidity() + "]");
    }
}
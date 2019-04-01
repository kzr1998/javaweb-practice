package Day31.fanxing.xiancheng.tongxin53;

import java.util.Random;

public class Weather {
    private int temperature;// 温度
    private int humidity;// 湿度
    boolean flag = false;// 判断生成还是读取

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

    public synchronized void generate() { // 生成随机数并生成天气数据
        if (flag) {  //如果已经生成了数据就等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setTemperature((int) (Math.random() * 40));
        this.setHumidity((int) (Math.random() * 100));
        System.out.println("生成天气数据[温度:" + this.getTemperature() + ",湿度" + this.getHumidity() + "]");
        flag = true;//表示已经生成了数据
        notifyAll();// 唤醒进程
    }

    public synchronized void read() { // 读取天气信息
        if (!flag) { //如果没有任何数据则等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.println("读取天气数据[温度:" + this.getTemperature() + ",湿度" + this.getHumidity() + "]");
        flag = false;//表示用掉了数据
        notifyAll();
    }
}
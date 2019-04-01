package Day31.fanxing.xiancheng.tongxin53;

public class ReadWeather implements Runnable {
    Weather weather;
    ReadWeather(Weather weather){
        this.weather=weather;
    }
    @Override
    public void run() {
        weather.read();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

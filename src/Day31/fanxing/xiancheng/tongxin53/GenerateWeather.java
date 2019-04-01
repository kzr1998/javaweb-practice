package Day31.fanxing.xiancheng.tongxin53;

public class GenerateWeather implements Runnable {
    Weather weather;
    GenerateWeather(Weather weather){
        this.weather=weather;
    }
    @Override
    public void run() {
        weather.generate();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

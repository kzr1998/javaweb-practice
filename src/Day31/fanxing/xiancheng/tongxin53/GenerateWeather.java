package Day31.fanxing.xiancheng.tongxin53;

public class GenerateWeather implements Runnable {
    Weather weather;

    GenerateWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {
            for (int i = 1; i <= 50; i++) {
                weather.generate();
            }
        }
    }



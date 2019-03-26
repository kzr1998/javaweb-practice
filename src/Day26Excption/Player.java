package Day26Excption;
public class Player {
    public void play(int index)throws ExceptionSouce{
        if(index>10){
            throw new ExceptionSouce("您播放的歌曲不存在");
        }
        System.out.println("正在播放歌曲");
    }
}
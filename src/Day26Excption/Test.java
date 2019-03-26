package Day26Excption;

public class Test {
    public static void main(String[] args){
        Player player=new Player();
        try{
            player.play(13);
        }catch (ExceptionSouce e){
            System.out.println("异常信息为："+e.getMessage());
        }
    }
}

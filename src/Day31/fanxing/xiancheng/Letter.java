package Day31.fanxing.xiancheng;



public class Letter implements Runnable {
   char letter[]=new char[26];
   public Letter(){
       char[] letter=new char[26];
       for (int i=0; i<26; i++)
       {
           letter[i]=(char)(65+i);
       }
//       for (int i=0; i<26; i++)
//       {
//           System.out.print(letter[i]);
//       }
   }
    @Override
    public void run() {
         for(char c='a'; c<='z';c++){
             System.out.print(c);
             try {
                 Thread.sleep(500);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
    }
    public static void main(String[] args){
       Letter lr=new Letter();
       Thread t1=new Thread(lr);
       t1.start();

    }
}

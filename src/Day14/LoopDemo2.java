package Day14;

public class LoopDemo2 {
    public static void main(String[] args) {
        int ge, shi, bai;

        for (int i = 200; i < 300; i++) {
            bai=i/100;
            //System.out.println(bai);
            shi=(i/10)%10;
            //System.out.println(shi);
            ge = i%10;
            //System.out.println(ge);
             if(ge+shi+bai==12&&ge*shi*bai==42)
                 System.out.println(i);

            }

        }
    }



package Day328jihe;
import java.util.*;
  public class ArrayListDemo{
  public static void main(String[] args) {
      ArrayList list = new ArrayList();
      list.add("第1个为语文");
      list.add("第2个为数学");
      list.add("第3个为英语");
      list.add("第4个为化学");
      list.add("第5个为物理");
      list.add("第6个为生物");

      System.out.println("列表中元素个数为："+list.size());

          Iterator it = list.iterator();
          while (it.hasNext()) {
              Object obj = it.next();
                  System.out.println( obj);
              }
          }
      }



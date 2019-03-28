package Day329Set.jihe44;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FootballDemo {
    public static void main(String[] args) {
        //定义HashMap的对象并添加数据
        Map <String,String> football=new HashMap<String,String>();
        football.put("2006","意大利");
        football.put("2014","德国");
        football.put("2010","西班牙");
        //使用迭代器的方式遍历
        System.out.println("使用迭代器的方式遍历:");
        //Iterator<Map.Entry<String,String>> it=football.entrySet().iterator();也可同时获得键与值
        Iterator<String> it=football.values().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //使用EntrySet同时获取key和value
        System.out.println("=============================");
        System.out.println("使用EntrySet同时获取key和value:");
        Set<Map.Entry<String,String>> entrySet=football.entrySet();
         for(Map.Entry<String,String>entry:entrySet){
             System.out.print(entry.getKey()+"-");
             System.out.println(entry.getValue());
         }
    }
}

package Day4_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class School {
    private Map<String,Banji>schoolMap;
    public School(Map<String, Banji> schoolMap) {
        schoolMap=new HashMap<String, Banji>();
    }
    public Map<String, Banji> getSchoolMap() {
        return schoolMap;
    }
    public void setSchoolMap(Map<String, Banji> schoolMap) {
        this.schoolMap = schoolMap;
    }
    //p添加班级
    public void addBanji(Banji banji){
        schoolMap.put(banji.getClassName(),banji);
    }
    //  删除班级
    public void deleteBanji(Banji banji){
        schoolMap.remove(banji.getClassName());
        System.out.println("删除成功！");
    }
    //  通过班级名称查询班级
    public Banji searchByName(String className) {
        Banji banji=null;
        Set<String> banjiSet=schoolMap.keySet();
        for (String s:banjiSet){
            if(s.equals(className)){
                banji=schoolMap.get(s);break;
            }
        }
        return banji;
    }
    // 对各班语文成绩按平均分进行由大到小排序
    public void sortChineseByAverage() {}
    //对各班数学成绩按平均分进行由大到小排序
    public void sortMathByAverage() {}
    //显示所有班级名称
    public void displayBanJiName() {}
}

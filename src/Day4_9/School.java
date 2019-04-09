package Day4_9;

import java.util.*;

public class School {
    private Map<String, Banji> schoolMap;

    public School() {
        schoolMap=new HashMap<String,Banji>();
    }

    public Map<String, Banji> getSchoolMap() {
        return schoolMap;
    }

    public void setSchoolMap(Map<String, Banji> schoolMap) {
        this.schoolMap = schoolMap;
    }


    /**
     * 添加班级
     * @param banji
     */
    public void addBanji(Banji banji){
        schoolMap.put(banji.getClassName(), banji);
        System.out.println("添加成功");
    }

    /**
     * 删除班级
     * @param banji
     */
    public void deleteBanji(Banji banji){
        if (schoolMap.containsValue(banji)) {
            schoolMap.remove(banji.getClassName());
        }
    }

    /**
     * 通过班级名称查询班级
     * @param className
     * @return
     */
    public Banji searchByName(String className) {
        if (schoolMap.containsKey(className)) {
            return schoolMap.get(className);
        }
        return null;
    }

    /**
     * 对各班语文成绩按平均分进行由大到小排序
     */
    public void sortChineseByAverage() {
        Iterator it = schoolMap.values().iterator();
        Map<String, Float> averageMap = new HashMap<>();
        while (it.hasNext()) {
            Banji banji = (Banji)it.next();
            List<Student> stuList = banji.getStuList();
            Float avg = 0f;
            for (Student stu: stuList) {
                avg += stu.getChinese();
            }
            avg = avg / stuList.size();

            averageMap.put(banji.getClassName(), avg);
        }

        List<Map.Entry<String, Float>> list = new ArrayList<>(averageMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Float>>() {
            @Override
            public int compare(Map.Entry<String, Float> o1, Map.Entry<String, Float> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<String, Float> map: list) {
            System.out.println(map.getKey()+ ":" + map.getValue());
        }
    }

    /**
     * 对各班数学成绩按平均分进行由大到小排序
     */
    public void sortMathByAverage() {
        Iterator it = schoolMap.values().iterator();
        Map<String, Float> averageMap = new HashMap<>();
        while (it.hasNext()) {
            Banji banji = (Banji)it.next();
            List<Student> stuList = banji.getStuList();
            Float avg = 0f;
            for (Student stu: stuList) {
                avg += stu.getMath();
            }
            avg = avg / stuList.size();

            averageMap.put(banji.getClassName(), avg);
        }

        List<Map.Entry<String, Float>> list = new ArrayList<>(averageMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Float>>() {
            @Override
            public int compare(Map.Entry<String, Float> o1, Map.Entry<String, Float> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<String, Float> map: list) {
            System.out.println(map.getKey()+ ":" + map.getValue());
        }
    }

    /**
     * 显示所有班级名称
     */
    public void displayBanJiName() {
        Iterator<Banji> it = schoolMap.values().iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getClassName());
        }
    }
}

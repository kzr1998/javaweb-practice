package Day4_9;

import java.util.Objects;

public class Student {
        private String stuNum;
        private String stuName;

        private float math;
        private float chinese;

        public Student(String stuNum, String stuName, float math, float chinese) {
            this.stuNum = stuNum;
            this.stuName = stuName;
            this.math = math;
            this.chinese = chinese;
        }

        public String getStuNum() {
            return stuNum;
        }

        public void setStuNum(String stuNum) {
            this.stuNum = stuNum;
        }

        public String getStuName() {
            return stuName;
        }

        public void setStuName(String stuName) {
            this.stuName = stuName;
        }

        public float getMath() {
            return math;
        }

        public void setMath(float math) {
            this.math = math;
        }

        public float getChinese() {
            return chinese;
        }

        public void setChinese(float chinese) {
            this.chinese = chinese;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Student student = (Student) o;

            if (Float.compare(student.math, math) != 0) return false;
            if (Float.compare(student.chinese, chinese) != 0) return false;
            if (stuNum != null ? !stuNum.equals(student.stuNum) : student.stuNum != null) return false;
            return stuName != null ? stuName.equals(student.stuName) : student.stuName == null;
        }

        @Override
        public int hashCode() {
            int result = stuNum != null ? stuNum.hashCode() : 0;
            result = 31 * result + (stuName != null ? stuName.hashCode() : 0);
            result = 31 * result + (math != +0.0f ? Float.floatToIntBits(math) : 0);
            result = 31 * result + (chinese != +0.0f ? Float.floatToIntBits(chinese) : 0);
            return result;
        }

        @Override
        public String toString() {
            return "学生{" +
                    "学号='" + stuNum + '\'' +
                    ", 姓名='" + stuName + '\'' +
                    ", 数学=" + math +
                    ", 语文=" + chinese +
                    '}';
        }
    }


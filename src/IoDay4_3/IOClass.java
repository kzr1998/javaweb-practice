package IoDay4_3;

import java.io.File;
import java.io.IOException;

public class IOClass {
    public static void main(String[] args) {
        File file = new File("C:\\file\\Moday.docx");
        if(file.exists()) {
            System.out.println("文件创建成功！");
        }else if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("文件名称：" + file.getName());
        System.out.println("文件上一级目录：" + file.getParent());
        //判断是文件还是目录
        if (file.isDirectory()) {
            System.out.println("文件/目录：这是个目录");
        } else if (file.isFile()) {
            System.out.println("文件/目录：这是个文件");

        }
         //System.out.println(file.canRead());
         //System.out.println(file.canWrite());
        if(file.canRead()&&file.canWrite()){
            System.out.println("读写性：这个文件可以读可以写");
        }else {
            System.out.println("读写性：这个文件不可以读");
        }

    }
}


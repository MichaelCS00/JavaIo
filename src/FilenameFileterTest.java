import java.io.File;

public class FilenameFileterTest {
    public static void main(String[] args){
        File file = new File(".");
        //使用Lambda表达式（目标类型为FilenameFilter）实现文件过滤
        //如果文件名以.java结尾，或文件对应一个路径，则返回true
        String[] nameList = file.list((dir,name)->name.endsWith(".java")
                ||new File(name).isDirectory());
        for(String neme : nameList){
            System.out.println(neme);
        }
    }
}

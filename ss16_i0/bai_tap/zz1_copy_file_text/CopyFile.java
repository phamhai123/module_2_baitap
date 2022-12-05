package ss16_i0.bai_tap.zz1_copy_file_text;

import ss16_i0.thuc_hanh.zz2_find_max_in_file.ReadAndWriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static List<String> readFile(String filePath){
        List<String> list = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return list;
    }
    public static int writeFileText(String filePath, List<String> list) throws IOException{
        int count = 0;
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (String text : list){
                bufferedWriter.write(text);
                bufferedWriter.newLine();
                count+= text.length();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return(count);
    }
    public static void main(String[] args) throws IOException {
        List<String> list = readFile("D:\\Module_02\\PhamVanHai-A0722i1\\Module_2_java\\src\\ss16_i0\\bai_tap\\zz1_copy_file_text\\SourceFile.csv");
        writeFileText("D:\\Module_02\\PhamVanHai-A0722i1\\Module_2_java\\src\\ss16_i0\\bai_tap\\zz1_copy_file_text\\TargetPath.csv",list);
    }
}

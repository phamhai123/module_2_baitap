package ss15_try_catch.bai_tap.zz1.thuc_hanh.zz1_debug;

import java.io.FileWriter;
import java.io.IOException;

public class TextException extends Exception {
    public void writeFile() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("abc");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        TextException man = new TextException();
        man.writeFile();
    }
}



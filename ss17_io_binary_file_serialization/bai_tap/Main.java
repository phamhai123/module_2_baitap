package ss17_io_binary_file_serialization.bai_tap;

import java.io.*;
import java.util.List;

public class Main {
    private static final String FILE_PATH = "D:\\Module_02\\PhamVanHai-A0722i1\\Module_2_java\\src\\ss17_io_binary_file_serialization\\bai_tap\\studen.dat";

    public static void writeObject(Product product) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void writeObjectList(List<Product> products) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(products);
        oos.close();
    }

    public static Product readObject() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Product product = (Product) ois.readObject();
        return product;
    }

}

package ss12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        manageProduct();
    }

    public static void manageProduct() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1, "Iphone", 122312));
        list.add(new Product(2, "Sam Sung", 23213231));
        list.add(new Product(3, "Android", 3423423));
        do {
            display(list);
            System.out.println("1. Create a product\n" +
                    "2. Edit a product\n" +
                    "3. Delete a product\n" +
                    "4. Search the product you need\n" +
                    "== Choose ==");

            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    create(list);
                    break;
                case 2:
                    edit(list);
                    break;
                case 3:
                    delete(list);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Incorrect input, please re-enter!");
            }
        }while (!list.isEmpty());
    }

    public static void create(ArrayList list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id :");
        int id = scanner.nextInt();
        System.out.println("Enter name product :");
        String name = scanner.next();
        System.out.println("Enter core product :");
        double core = scanner.nextDouble();
        list.add(new Product(id, name, core));
    }

    public static void edit(ArrayList<Product> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id you want to edit");
        int id = scanner.nextInt();
        for (int i = 0; i < list.size() - 1 ; i++) {
            if(list.get(i).getId() == id) {
                System.out.println("Enter new id :");
                int newId = scanner.nextInt();
                System.out.println("Enter new name :");
                String newName = scanner.next();
                System.out.println("Enter new core :");
                double newCore = scanner.nextDouble();
                list.set(i, new Product(newId,newName,newCore));
                break;
            }
        }
    }

    public static void delete(ArrayList<Product> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id you want to delete");
        int id = scanner.nextInt();
        for (int i = 0; i < list.size() - 1 ; i++) {
            if(list.get(i).getId() == id) {
                list.remove(i);
            }
        }
    }

    public static void display(ArrayList list) {
        System.out.println("==== Product all show out ====");
        for (Object index : list
        ) {
            System.out.println(index);
        }
    }
    public static void search() {

    }
    public static void sort() {

    }
}

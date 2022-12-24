package ss12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        manageProduct();
    }

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> list = new ArrayList<>();

    static {
        list.add(new Product(1, "Iphone", 122312));
        list.add(new Product(2, "Sam Sung", 23213231));
        list.add(new Product(3, "Android", 3423423));
    }

    public static void manageProduct() {
        do {
            display(list);
            System.out.println("1. Create a product\n" + "2. Edit a product\n" + "3. Delete a product\n" + "4. Search the product you need\n" + "== Choose ==");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    create();
                    break;
                case "2":
                    edit();
                    break;
                case "3":
                    delete();
                    break;
                case "4":
                    search();
                    break;
                case "5":
                    sort();
                    break;
                case "6":
                    System.exit(0);
                default:
                    System.out.println("Incorrect input, please re-enter!");
            }
        } while (true);
    }

    public static void create() {
        System.out.println("Enter id :");
        int id = scanner.nextInt();
        System.out.println("Enter name product :");
        String name = scanner.next();
        System.out.println("Enter core product :");
        double core = scanner.nextDouble();
        list.add(new Product(id, name, core));
    }

    public static void edit() {
        System.out.println("Enter the id you want to edit");
        int id = scanner.nextInt();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).getId() == id) {
                System.out.println("Enter new id :");
                int newId = scanner.nextInt();
                System.out.println("Enter new name :");
                String newName = scanner.next();
                System.out.println("Enter new core :");
                double newCore = scanner.nextDouble();
                list.set(i, new Product(newId, newName, newCore));
                break;
            }
        }
    }

    public static void delete() {
        System.out.println("Enter the id you want to delete");
        int id = scanner.nextInt();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
            }
        }
    }

    public static void display(ArrayList list) {
        System.out.println("==== Product all show out ====");
        for (Object index : list) {
            System.out.println(index);
        }
    }

    public static void search() {
        int count = 0;
        System.out.println("Enter the name product you want to search:");
        String name = scanner.nextLine();
        for (Product in : list) {
            if (in.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(in);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Name does not exist!!");
        }
    }

    public static void sort() {
        Collections.sort(list);
        for (Product in : list) {
            System.out.println(in);
        }
    }
}

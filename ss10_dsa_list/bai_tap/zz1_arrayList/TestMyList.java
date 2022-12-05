package ss10_dsa_list.bai_tap.zz1_arrayList;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println("element 4: " + myList.get(0));
        System.out.println("element 1: " + myList.get(1));
        System.out.println("element 2: " + myList.get(2));
    }
}

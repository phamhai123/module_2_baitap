package ss10_dsa_list.bai_tap.zz2_linkedlist;

import ss10_dsa_list.thuc_hanh.zz2_linkedlist.MyLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        ss10_dsa_list.thuc_hanh.zz2_linkedlist.MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(4, 9);
        ll.printList();
    }
}

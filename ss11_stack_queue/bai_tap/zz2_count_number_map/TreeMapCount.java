package ss11_stack_queue.bai_tap.zz2_count_number_map;

import java.util.*;

public class TreeMapCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Enter a piece of text :");
        String text = scanner.nextLine();
        text = text.toLowerCase();
        String[] words =  text.split(" ");
       for (String word: words
            ) {
          Integer integer = treeMap.get(word);
          if(integer == null) {
              treeMap.put(word, 1);
          }else {
              treeMap.put(word,integer + 1);
          }
       }
        System.out.println(treeMap);
    }
}

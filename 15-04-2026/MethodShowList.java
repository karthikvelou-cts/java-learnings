import java.lang.*;
import java.util.*;

class MethodShowList{
    static void showList(List<String> list){
        for(String item : list){
            System.out.println(item);
        }
    }

    public static void main(String[] args){
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");
        myList.add("Java");

        showList(myList);
    }
}
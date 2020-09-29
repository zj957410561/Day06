package homwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Register {
    public static void main(String[] args) {
        ArrayList<String> listPerson = new ArrayList<>();
        ArrayList<String> listPerson2 = new ArrayList<>();
        listPerson2.add("a");
        ArrayList<String> listPerson1 = new ArrayList<>(Arrays.asList("a"));
        listPerson.add("a");
        listPerson.add("a");
        listPerson.add("a");
        listPerson.add("d");
        listPerson.add("c");
        listPerson.add("b");
      /*  for (int i = 0; i < listPerson.size(); ) {
            if(listPerson.get(i).equals("a"))
                listPerson.remove(i);
            else
                i++;
        } */
        for (int i = listPerson.size() - 1; i >= 0; i--) {
            if (listPerson.get(i).equals("a"))
                listPerson.remove(i);
        }
        System.out.println(listPerson.toString());

    }
}

package collection.com;

import collection.com.CollectionImpl.CustomArrayListImpl;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        ArrayList ar = new ArrayList();
        CustomArrayListImpl cs = new CustomArrayListImpl();

        cs.add("vishal");
        cs.add("pawar");
        cs.add("vishal2");
        cs.add("pawar2");
        cs.add("vishal3");
        cs.add("pawar3");
        System.out.println(cs.toString());

        System.out.println(cs.size());
    }
}
package automationtest;

import java.util.ArrayList;

public class ArrayList_05 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        list.add("Scrum");
        list.add("Java");
        list.add("Jira");
        list.add("Selenium");
        list.add("Cucumber");
        list.add("Postman");
        list.add("Rest Assured");

        //list.contains
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listlab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author alancerio18
 */
public class ListLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//    challenge 1
//        List hobbyList = new ArrayList();
//        hobbyList.add("Gaming");
//        hobbyList.add("Fishing");
//        hobbyList.add("Bowling");
//        hobbyList.add("Coding");
//        
//        for(int i=0;i <hobbyList.size();i++){
//            String item = (String)hobbyList.get(i);
//            System.out.println(item);
//            hobbyList.remove("Bowling");
//        }
//        
//    }
//    
        //Challenge 2
//        Employee e1 = new Employee("1111", "111-222", "Bob");
//        Employee e2 = new Employee("2222", "333-444", "Nick");
//        Employee e3 = new Employee("3333", "555-666", "bob");
//
//        List<String> employeeList = new ArrayList<>();
//        employeeList.add(e1.toString());
//        employeeList.add(e2.toString());
//        employeeList.add(e3.toString());
//        
//        for (String s : employeeList) {
//            System.out.println(s);
//        }
//
        //challenge 3
//        Employee e1 = new Employee("1111", "111-222", "Bob");
//        Employee e2 = new Employee("2222", "333-444", "Nick");
//        Dog d1 = new Dog("woof","wolf");
//        Dog d2 = new Dog("obi","maltipoo");
//        
//         List myList = new ArrayList();
//        myList.add(e1.toString());
//        myList.add(e2.toString());
//        myList.add(d1.toString());
//        myList.add(d2.toString());
//        
//         for(int i=0;i < myList.size();i++){
//            String item = (String)myList.get(i);
//            System.out.println(item);
//         }
        //challenge 4
     
   Set<Employee> emp = new HashSet<>();
        emp.add(new Employee("1111", "1234-1111", "Nick"));
        emp.add(new Employee("2222", "1234-2222", "Alex"));
        emp.add(new Employee("2222", "1234-4444", "Tom"));
        emp.add(new Employee("3333", "1234-2222", "Alex"));
        for (Employee e : emp) {
            System.out.println(e);
        }
    }
}

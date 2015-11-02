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
//        Employee e1 = new Employee("Bob", "John", "111-11-111");
//        Employee e2 = new Employee("Sally", "may", "222-22-222");
//        Employee e3 = new Employee("John", "Doe", "333-33-333");
//
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(e1);
//        employeeList.add(e2);
//        employeeList.add(e3);
//        
//        for (Employee s : employeeList) {
//            System.out.println(s);
//        }
//
        //challenge 3
//       Employee e1 = new Employee("Bob", "John", "111-11-111");
//       Employee e2 = new Employee("Sally", "may", "222-22-222");
//        Dog d1 = new Dog("woof",123);
//        Dog d2 = new Dog("obi",124);
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
        Employee e1 = new Employee("Bob", "John", "111-11-111");
        Employee e2 = new Employee("Sally", "may", "222-22-222");
        Employee e3 = new Employee("John", "Doe", "333-33-333");
        Employee e4 = new Employee("John", "Doe", "333-33-333");
        
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        for (Employee e : emp) {
            System.out.println(e);
        }
    }
}

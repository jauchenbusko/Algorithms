package inharitance;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    public static void main(String[] args){

        List<Employee> employees1 = new ArrayList<>();

        employees1.add(new Employee());
        employees1.add(new Manager());

        employees1.get(1).setName("Steve");

        List<Manager> employees2 = new ArrayList<>();

        employees2.add(new Manager());
    }
}

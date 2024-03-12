import java.util.Arrays;

import Lesson_3.Employee;
import Lesson_3.EmployeeFabric;
import Lesson_3.Worker;

public class Lesson_3 {

    public static void main(String[] args) {

        Integer i = 0;
        Employee[] workers = EmployeeFabric.generateEmployees(15);
        for (Employee worker : workers) {
            
            //System.out.println(worker);
            System.out.println(Integer.toString(i + 1) + ") " + worker);
            i++;
        }

        Arrays.sort(workers/*, new SalaryComparator()*/);

        System.out.println();
        System.out.println("***");
        System.out.println();

        i = 0;
        for (Employee worker : workers) {
            //System.out.println(worker);
            System.out.println(Integer.toString(i + 1) + ") " + worker);
            i++;
        }
    }

}
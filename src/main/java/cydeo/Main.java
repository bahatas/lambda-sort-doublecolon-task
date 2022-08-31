package cydeo;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static cydeo.DataGenerator.*;
import static cydeo.Service.*;

/**
 * Solutions will  be here
 */
public class Main {

    public static void main(String[] args) {
        createAllAddresses();
        createAllCompanies();
        createAllEmployees();

        //When you start to solve new question, comment out the System.out.println statement


        //EXAMPLE
        System.out.println("***get all employees if their Id number is odd");
        System.out.println(filter(getAllEmployees(), employee -> employee.getId() % 2 != 0));

/**
 * todo @Kadifa kudic
 */
//        System.out.println("***get all employees if their Id number is even");


        //System.out.println("***get all employees if they are FEMALE***");


        //System.out.println("***get all employees if they are MALE***");


        //System.out.println("***get all employees if they are older than 50");

/**
* todo @Violetta
*/
        //System.out.println("***get all employees whose company name info starts with A or a");


        //System.out.println("*** get all employees their company is located in Utah Indiana or California as a state ");


        //System.out.println("get all companies if the company name consist of ,");

/**
 * todo @Shukur
 */
        //System.out.println("get all companies if the company name ends with a");


        //System.out.println("get all companies if their street information starts with numeric value");


        //System.out.println("get the single employee with id information. If there is no employee with the id then throw exception");
/**
 * todo @Kramer
 */

        //System.out.println("get the single company with id information. If there is no company with the id then throw exception");


        //System.out.println("get the single address with id information. If there is no address with the id then throw exception");


        //System.out.println("show all the employees full name and corresponding age information in one list");

/**
 * todo Entisar
 */
        //System.out.println("show all the employees address information with their age in one list");
//still didnt figure this out

        System.out.println("show all the employees address information with their age in one list");

        //still working on this

        System.out.println("***get just the fullName of all employees if their Id number is even***");
        Function<Employee,List<String> > employee_fullNAme= ( emp)->{
            List<String> FullNames_List=new ArrayList<>();
            if(emp.getId()%2==0){
                String fullName=  emp.getFullName();
                FullNames_List.add(fullName);
            }
            return FullNames_List;
        };
        System.out.println(employee_fullNAme);

        //System.out.println("***just print the employees if their address id is 6");
        Function<Employee,List<Employee> > employee_List= (emp)->{
            List<Employee> emp_List=new ArrayList<>();
            String id=Integer.toString(emp.getId());
         if(id.startsWith("6")){
                emp_List.add(emp);
            }
            return emp_List;
        };
        System.out.println(employee_List);

/**
 * todo @Nihan
 */
        //System.out.println("***just print the companies if they are located in address id 2");


        //System.out.println("***get one employee with id and if she/he is older than 50 promote her/him - create an PromotedEmployee object with any information");


        //System.out.println("***get all female employees older than 45 and promote all with 100.000 salary and manager role");

/**
* todo @Adelina
*/
        //System.out.println("***print all employees***");


        //System.out.println("print all companies");


        //System.out.println("print all address");

/**
 * todo @Tugay
 */
        //System.out.println("***SORTING QUESTIONS***");

        //System.out.println("***sort all employees with id in ascending order***");


        //System.out.println("***sort all employees with id in descending order***");

/**
 * todo @Medina
 */
        //System.out.println("sort all employees with age in ascending order");


        //System.out.println("sort all employees with age in descending order");


        //System.out.println("sort all employees with company id in ascending order");

    }
}

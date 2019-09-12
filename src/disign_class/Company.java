package disign_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

    private String company_name;
    private List<String> employees = new ArrayList<>();


    public void printSorted(){
        System.out.println("companyName= " + company_name);
        Collections.sort(employees);
        System.out.println("soted workers " + employees);
    }

    public String getCompany_name() {
        return company_name;
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }

    public void addEmployee(String name){
        if(name == null){
            return;
        }else {
            employees.add(name);
        }
    }
}

package disign_class;

public class DataEncapsulation {

    public static void main(String[] args) {

        Company company = new Company();
        company.setCompany_name("Vivo tech solutions");
        company.addEmployee("mfundo");
        company.addEmployee("yam yam");
        company.addEmployee("yash");
        company.addEmployee("zee");
        company.addEmployee(null);
        company.addEmployee("vinny");
        company.printSorted();

    }
}

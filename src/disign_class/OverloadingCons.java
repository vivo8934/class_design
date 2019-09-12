package disign_class;

class Person{

    private String name;
    private String clan_name;
    private int age;
    private double weight;

    public Person(String name){
        this(name,  "Mawawa");
    }
    public Person(String name,String clan_name){
        this(name, clan_name, 30);
    }
    public Person(String name, String clan_name, int age){
        this(name, clan_name, age, 76.3);
    }
    public Person(String name, String clan_name, int age, double weight){
        this.name = name;
        this.clan_name = clan_name;
        this.age = age;
        this.weight = weight;
    }

    public void printInfo(){
        System.out.println("Name= " + name + " Clan_Name= " + clan_name + " age= " + age + " weight= " + weight);
    }
}


public class OverloadingCons {
    public static void main(String[] args) {

        Person p1 = new Person("Mfundo");
        p1.printInfo();
        Person p2 = new Person("Yamkela", "Mamqwathi");
        p2.printInfo();
        Person p3 = new Person("Anele", "Tom", 26);
        p3.printInfo();
        Person p4 = new Person("Zozuko", "Mamjwarha", 23, 70.1);
        p4.printInfo();

    }
}

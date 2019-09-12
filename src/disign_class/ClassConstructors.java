package disign_class;

class Dog{

    private String color;

    public Dog(String color){
        System.out.println("Constructor");
        this.color = color;
    }
    public  Dog(){}

    public void printColor(){
        System.out.println("color=" + this.color);
    }
}

class Cat{
    private String color;
    private int height;
    private  int length;

    public Cat(int height, int length) {
        color = "white";
        this.height = height;
        this.length = length;
    }

    public void  printInfo(){
        System.out.println("Cat lenght= " + this.length + " Cat height= " + this.length + " Color= " + color);
    }
}

public class ClassConstructors {

    public static void main (String[]args){

        Dog dog = new Dog("red");
        Dog dog1 = new Dog();
        dog.printColor();

        Cat cat = new Cat(4,5);
        cat.printInfo();
    }

}

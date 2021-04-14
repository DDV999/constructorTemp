public class conT8 {
    public static void main(String[] args) {

        Person1 undef = new Person1();
        undef.displayInfo();

        Person1 tom = new Person1("Tom");
        tom.displayInfo();

        Person1 sam = new Person1("Sam", 25);
        sam.displayInfo();
    }
}
class Person1{

    String name;    // имя
    int age;        // возраст
    Person1()
    {
        this("Undefined", 18);
    }
    Person1(String name)
    {
        this(name, 18);
    }
    Person1(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}

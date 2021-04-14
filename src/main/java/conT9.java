public class conT9 {
    public static void main(String[] args) {

        Person2 undef = new Person2();
        undef.displayInfo();

        Person2 tom = new Person2("Tom");
        tom.displayInfo();
    }
}
class Person2{

    String name;    // имя
    int age;        // возраст

    /*начало блока инициализатора*/
    {
        name = "Undefined";
        age = 18;
    }
    /*конец блока инициализатора*/
    Person2(){

    }
    Person2(String name){

        this.name = name;
    }
    Person2(String name, int age){

        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}

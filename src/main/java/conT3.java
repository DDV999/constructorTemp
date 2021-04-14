public class conT3 {
    String name;
    int age;
    int carsCount;

    public conT3(String name, int age, int carsCount) {
        this.name = name;
        this.age = age;
        this.carsCount = carsCount;

        System.out.println("Наша автомобильная фабрика называется " + this.name);
        System.out.println("Она была основана " + this.age + " лет назад" );
        System.out.println("За это время на ней было произведено " + this.carsCount +  " автомобилей");
        System.out.println("В среднем она производит " + (this.carsCount/this.age) + " машин в год");
    }

    public static void main(String[] args) {

        conT3 ford = new conT3("Ford", 115 , 50000000);
    }
}

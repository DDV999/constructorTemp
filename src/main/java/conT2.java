public class conT2 {
    String name;
    int age;

    //для первого кота
    public conT2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //для второго кота
    public conT2(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        conT2 barsik = new conT2("Barsik", 5);
        conT2 streetCatNamedBob = new conT2("Bob");
    }
}

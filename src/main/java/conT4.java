public class conT4 {

    String brain;
    String heart;

    public conT4(String brain, String heart) {
        this.brain = brain;
        this.heart = heart;
    }

    public static class Cat extends conT4 {

        String tail;

        public Cat(String brain, String heart, String tail) {
            super(brain, heart);
            this.tail = tail;
        }

        public static void main(String[] args) {
            Cat cat = new Cat("Мозг", "Сердце", "Хвост");
        }
    }
}
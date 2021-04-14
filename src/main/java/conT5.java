class conT5{
    int age;
    int birthday;

    // Инициализируем переменные явно
    conT5(int i, int j) {
        age = i;
        birthday = j;
    }

    // Инициализируем переменные одним и тем значением
    conT5(int i) {
        this(i, i); // вызывается Cat(i, i);
    }

    // Присвоим значения по умолчанию 0
    conT5() {
        this(0); // вызывается Cat(0);
    }

    public static void main(String[] args) {
        conT5 con1 = new conT5(8);
        conT5 con2 = new conT5(0);
        conT5 con3 = new conT5();
    }
}
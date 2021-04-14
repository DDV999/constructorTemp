public class conT6 {
    double width;
    double height;
    double depth;

    conT6() {
        System.out.println("Конструирование объекта Вох");
        width = 10;
        height = 10;
        depth = 10;
    }

    /**
     * Подсчитать объем коробки
     *
     * @return объем
     */
    double getVolume() {
        return width * height * depth;
    }
}

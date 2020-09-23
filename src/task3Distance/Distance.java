package task3Distance;

public class Distance {

    double distance; // здесь static не нужен, т.к. у тебя может быть несколько экземпляров
                     // Distance с разными distance.

    // Простой конструктор
    Distance(double distance) {
        this.distance = distance;
    }

    // Т.к. поле distance теперь не static, а поля экземляров внутри static-методов использовать
    // нельзя, то убираем модификатор static метода print()
    void print() {
        System.out.println("the distance: " + distance + " in km");
    }

    static class Converter {

//        Distance distance = new Distance();

        // В этом классе нам нужно просто определить два остальных метода.
        // Конструктор тут избыточен
//        Converter(double i) {
//            distance = i;
//        }

        // Эти методы могут вызываться из других классов и пакетов, поэтому делаем их public

        public static double convertToMeters(double distance) {
            double result = distance * 1000;
//            System.out.println("In meters: " + result);
            return result;

        }

        public static double convertToMiles (double distance) {
            double result = distance * 0.62;
//            System.out.println("In miles: " + result);
            return result;
        }
    }

    // В этом методе мы используем метод вложенного статического класса :)
    // Возвращает конвертированную дистанцию
    public double toMiles() {
        return Converter.convertToMiles(distance);
    }
}

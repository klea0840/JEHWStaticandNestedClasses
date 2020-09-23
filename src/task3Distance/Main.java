package task3Distance;

public class Main {

    public static void main(String[] args) {

        double i = 5;

//        Distance.Converter convert = new Distance.Converter(i);
//        Distance.print();
//        convert.convertToMeters(i);
//        convert.convertToMiles(i);

        // Использование методов вложенного класса напрямую
        System.out.println("In meters: " + Distance.Converter.convertToMeters(i));
        System.out.println("In miles: " + Distance.Converter.convertToMiles(i));

        // ...через метод внешнего класса
        Distance d = new Distance(45);
        System.out.println("In miles: " + d.toMiles());

    }
}

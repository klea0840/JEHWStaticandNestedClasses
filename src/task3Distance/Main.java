package task3Distance;

public class Main {

    public static void main(String[] args) {

        double i = 5;

        Distance.Converter convert = new Distance.Converter(i);
        Distance.print();
        convert.convertToMeters(i);
        convert.convertToMiles(i);
    }
}

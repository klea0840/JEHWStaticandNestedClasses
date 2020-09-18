package task3Distance;

public class Distance {

    static double distance;
    static void print() {
        System.out.println("the distance: " + distance + " in km");
    }

    static class Converter {

//        Distance distance = new Distance();

        Converter(double i) {
            distance = i;
        }

        double convertToMeters (double distance) {
            double result = distance * 1000;
            System.out.println("In meters: " + result);
            return result;

        }

        double convertToMiles (double distance) {
            double result = distance * 0.62;
            System.out.println("In miles:" + result);
            return result;
        }
    }
}

public class overloadedMethods {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(1, 10));
        System.out.println(calcFeetAndInchesToCentimeters(156));
        System.out.println(calcFeetAndInchesToCentimeters(-10));
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }

        double ftToCm = (feet*12) * 2.54; //1 inch = 2.52cm, 1ft = 12 inch
        double inchToCm = inches * 2.54;
        return ftToCm + inchToCm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        }

        int feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}

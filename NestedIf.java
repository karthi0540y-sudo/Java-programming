public class NestedIf {
    public static void main(String[] args) {

        int att = 75;
        boolean fees = true;

        if (att >= 75) {
            if (fees == true) {
                System.out.println("Allowed");
            } else {
                System.out.println("Fees Payment");
            }
        } else {
            System.out.println("Low ATT");
        }
    }
}
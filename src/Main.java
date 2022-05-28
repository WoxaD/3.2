public class Main {
    public static void main(String[] args) {

        int currentBalance = 100;
        int amountPaid = 1050;

        int finalAmount = currentBalance + amountPaid;
        int bonusAmount = (finalAmount > 1000) ? finalAmount / 100 : finalAmount;
        System.out.println(finalAmount);
        System.out.println(bonusAmount);
    }
}

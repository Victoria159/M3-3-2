public class Main {
    public static void main(String[] args) {
        int startAmount = 100;
        int depositAmount = 2500;

        int bonus = depositAmount / 100;
        int totalAmount = bonus + startAmount + depositAmount;
        if (depositAmount > 1000) {
            System.out.println(bonus);
            System.out.println(totalAmount);
        } else{
            System.out.println(totalAmount);
        }
        }
}


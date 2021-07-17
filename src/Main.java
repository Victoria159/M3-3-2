public class Main {
    public static void main(String[] args) {
        int startAmount = 100;
        int depositAmount = 1150;

        int bonus;
        int totalAmount;
        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
            totalAmount = bonus + startAmount + depositAmount;
            System.out.println(bonus);
            System.out.println(totalAmount);
        } else{
            totalAmount = startAmount + depositAmount;
            System.out.println(totalAmount);
        }
        }
}


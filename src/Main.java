public class Main {
    public static void main(String[] args) {
        int startAmount = 100;
        int depositAmount = 2000;

        int bonus=0;

        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        }else{}
        int totalAmount = bonus + startAmount + depositAmount;
        System.out.println(bonus);
        System.out.println(totalAmount);
    }
}


public class Main {
    public static void main(String[] args){
        int currentBalance = 100_00;
        int summAdded = 1100_75;

        if (summAdded > 1000_00) {
            int bonusStep = 100_00;
            int bonusAmmount = summAdded / bonusStep * 100;
            currentBalance += summAdded + bonusAmmount;
        }
        else currentBalance += summAdded;
        int balanceRuble = currentBalance / 100;
        int balanceCents = currentBalance % 100;
        System.out.println("Баланс после пополнения: "+balanceRuble+" руб. "+balanceCents+" коп.");
    }
}

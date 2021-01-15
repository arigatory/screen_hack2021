public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        System.out.println("Кофе-машина");

        int moneyAmount = 140;
        boolean canBuySomething = false;
        System.out.println("Вы внесли: " + moneyAmount + " руб.");

        int[] drinkPrices = {150, 80, 20, 40};
        String[] drinkNames = {"капучино", "эспрессо", "вода", "молоко"};

        for(int i = 0; i < drinkPrices.length; i = i +1 ) {
            if (moneyAmount >= drinkPrices[i]) {
                System.out.println("Вы можете купить " + drinkNames[i]);
                canBuySomething = true;
            }
        }

      if (!canBuySomething) {
            System.out.println("Недостаточно средств :( Изучайте Java и зарабатывайте много!))");
      }
    }
}

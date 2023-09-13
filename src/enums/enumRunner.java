package enums;

public class enumRunner {
    public static void main(String[] args) {
        Game game = new Game();
         for (int i = 0; i <10; i++)  game.flipCoin(CoinFlip.HEADS);
    }
}

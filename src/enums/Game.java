package enums;

import java.util.Random;

public class Game {
    private Random rand = new Random();
    public boolean flipCoin(CoinFlip call){
        int num = this.rand.nextInt(2);
        CoinFlip actual = null;
        if (num == 1) actual = CoinFlip.HEADS;
        else actual = CoinFlip.TAILS;

        System.out.println("You called " + call);
        System.out.println("And it was " + actual);
        return call == actual;
    }
}

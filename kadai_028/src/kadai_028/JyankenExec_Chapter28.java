package kadai_028;

public class JyankenExec_Chapter28 {
    public static void main(String[] args) {
        Jyanken_Chapter28 game = new Jyanken_Chapter28();
        String myHand = game.getMyChoice();
        String enemyHand = game.getRandom();
        game.playGame(myHand, enemyHand);
    }
}
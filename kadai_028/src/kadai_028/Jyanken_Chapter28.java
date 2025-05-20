package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
        String input = scanner.nextLine().toLowerCase();
        return input;
    }

    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        int index = (int) Math.floor(Math.random() * 3);
        return hands[index];
    }

    public void playGame(String myHand, String enemyHand) {
        HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        System.out.println("自分の手は" + handMap.get(myHand) + ", 対戦相手の手は" + handMap.get(enemyHand));

        if (myHand.equals(enemyHand)) {
            System.out.println("あいこです");
        } else if (
            (myHand.equals("r") && enemyHand.equals("s")) ||
            (myHand.equals("s") && enemyHand.equals("p")) ||
            (myHand.equals("p") && enemyHand.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
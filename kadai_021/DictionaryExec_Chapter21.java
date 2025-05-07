package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        // Dictionary_Chapter21のインスタンスを作成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べたい単語の配列
        String[] words = {"apple", "banana", "grape", "orange"};

        // 各単語の意味を調べて表示
        for (String word : words) {
            System.out.println(word + "の意味は" + dictionary.getMeaning(word));
        }
    }
}
package kadai_004;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employees_Chapter04 {
    public static void main(String[] args) {
        // DB接続情報
        final String URL = "jdbc:mysql://localhost:3306/challenge_java";
        final String USER = "root";
        final String PASS = "seiya718";

        // try-with-resources に Statement を追加
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = conn.createStatement()) {

            System.out.println("データベース接続成功：" + conn);

            String sql = "CREATE TABLE IF NOT EXISTS employees ("
                       + "id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,"
                       + "name VARCHAR(60) NOT NULL,"
                       + "email VARCHAR(255) NOT NULL,"
                       + "age INT(11),"
                       + "address VARCHAR(255)"
                       + ")";
            int result = stmt.executeUpdate(sql);
            System.out.println("社員テーブルを作成しました: 更新レコード数=" + result);

        } catch (Exception e) {
            System.out.println("エラー発生：" + e.getMessage());
            e.printStackTrace();
        }
    }
}
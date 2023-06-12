import java.util.Scanner;

public class kazuate {
    public static void main(String[] args) {
        int targetNumber = 75; // プログラマが設定した数
        int attemptsLeft = 5; // 残りの試行回数

        Scanner scanner = new Scanner(System.in);

        System.out.println("数当てゲームを開始します！");

        while (attemptsLeft > 0) {
            System.out.print("2桁の正の整数を入力してください（残りの試行回数: " + attemptsLeft + "）: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("当たり！おめでとうございます！");
                break;
            } else if (Math.abs(guess - targetNumber) >= 20) {
                System.out.println("大きすぎるか小さすぎるか、かなり離れています！");
            } else if (guess > targetNumber) {
                System.out.println("もっと小さい数です。");
            } else {
                System.out.println("もっと大きい数です。");
            }

            attemptsLeft--;
        }

        if (attemptsLeft == 0) {
            System.out.println("残念！試行回数を使い切りました。正解は " + targetNumber + " でした。");
        }

        scanner.close();
    }
}
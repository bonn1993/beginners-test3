package org.example;


import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // 有効な携帯電話番号の定義
    // ハイフンが2個付いている
    // 3桁, 4桁, 4桁で区切られている
    // 1つ目の3桁が"070", "080", "090" のいずれかである

    Scanner scanner = new Scanner(System.in);

    System.out.print("携帯電話番号を入力してください: ");
    String phoneNumber = scanner.next();
    String[] numberParts = phoneNumber.split("-"); // ハイフンで配列を区切る
    if (numberParts.length == 3 && // 区切られた配列が3つに分割されている　かつ
        numberParts[0].length() == 3 && // 1つ目の配列が3桁　かつ
        numberParts[1].length() == 4 && // 2つ目の配列が4桁　かつ
        numberParts[2].length() == 4 && // 3つ目の配列が4桁　かつ
        (numberParts[0].equals("070") || // 1つ目の配列が"070", "080", "090" のいずれかである　かつ
            numberParts[0].equals("080") ||
            numberParts[0].equals("090")) &&
        numberParts[1].matches("^[0-9]+$") && // 2つ目、3つ目の配列が数字のみで構成されている場合true
        numberParts[2].matches("^[0-9]+$")) {
      System.out.println(phoneNumber + "は有効な携帯電話番号です。");
    } else {
      System.out.println(phoneNumber + "は無効な携帯電話番号です。");
    }
  }
}
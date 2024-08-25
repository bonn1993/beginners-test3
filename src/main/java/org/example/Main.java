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
    if (phoneNumber.matches("^(070|080|090)-\\d{4}-\\d{4}$")) {
      System.out.println(phoneNumber + "は有効な携帯電話番号です。");
    } else {
      System.out.println(phoneNumber + "は無効な携帯電話番号です。");
    }
  }
}
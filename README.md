## 第7回課題

### 概要

----
HTTPメソッドのGET/POST/PATCH/DELETEのリクエストを扱えるControllerを実装
オリジナルの仕様を追加する
⇒バリデーションについて調べてnameが20文字以上の場合はエラーとする
⇒バリデーションについて調べてnameが空文字の場合はエラーとする
⇒クエリ文字列を受け取れるようにする

### 環境

---
Project: Gradle - Groovy
Java: 17
Spring Boot: 3.0.4

### 実行結果

---
## 1-1 Getリクエストの値が返る
![1-1](https://github.com/mado11x11/image_wiki/blob/Issue_7/1_1.png)

## 1-2 バリデーションについて調べてnameが20文字以上の場合はエラーとする
![1-2](https://github.com/mado11x11/image_wiki/blob/Issue_7/1_2.png)

## 1-3 バリデーションについて調べてnameが空文字の場合はエラーとする
![1-3](https://github.com/mado11x11/image_wiki/blob/Issue_7/1_3.png)

## 2-1 Postが正常に行える　クエリ文字列を受け取る
![2-1_1](https://github.com/mado11x11/image_wiki/blob/Issue_7/2_1_1.png)

![2-1_2](https://github.com/mado11x11/image_wiki/blob/Issue_7/2_1_2.png)

## 2-2 Pathが正常に行える
![2-2](https://github.com/mado11x11/image_wiki/blob/Issue_7/2_2.png)

## 2-3 Deleteが正常に行える
![2-3](https://github.com/mado11x11/image_wiki/blob/Issue_7/2_3.png)

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
![1-1_1](https://github.com/mado11x11/image_wiki/blob/Issue_7/1_1_1.png)
![1-1_2](https://github.com/mado11x11/image_wiki/blob/Issue_7/1_1_2.png)

## 1-2 バリデーションについて調べてnameが20文字以上の場合はエラーとする
![1-2](https://github.com/mado11x11/image_wiki/blob/Issue_7/1_2.png)

## 1-3 バリデーションについて調べてnameが空文字の場合はエラーとする
![1-3](https://github.com/mado11x11/image_wiki/blob/Issue_7/1_3.png)

## 1_4 Postが正常に行える　クエリ文字列を受け取る
![1_4_1](https://github.com/mado11x11/image_wiki/blob/Issue_7/1_4_1.png)
![1_4_2](https://github.com/mado11x11/image_wiki/blob/Issue_7/1_4_2.png)

## 1-5 Patchが正常に行える
![1-5](https://github.com/mado11x11/image_wiki/blob/Issue_7/1_5.png)

## 1-6 Deleteが正常に行える
![1-6](https://github.com/mado11x11/image_wiki/blob/Issue_7/1_6.png)

## 1-7例外処理
![1-7_1](https://github.com/mado11x11/image_wiki/blob/Issue_7/1_7_1.png)
![1-7_2](https://github.com/mado11x11/image_wiki/blob/Issue_7/1_7_2.png)

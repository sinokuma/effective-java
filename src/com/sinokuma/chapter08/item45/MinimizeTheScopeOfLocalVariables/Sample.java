package com.sinokuma.chapter08.item45.MinimizeTheScopeOfLocalVariables;

import java.util.ArrayList;
import java.util.List;

/**
 * ローカル変数のスコープを最小限にする<br>
 *     ローカル変数が初めて使用された時に宣言する
 *     初期化子を含めた上で宣言する
 *     whileよりもforループを選ぶ
 *     メソッドを小さくして焦点をハッキリさせる
 *
 * @author sinokuma
 *
 */
public class Sample {

    public static void main(String args[]) {
        List<String> collections = new ArrayList<>();
        collections.add(args[0]);
        collections.add(args[1]);

        // コレクションをイテレートする好ましいイディオム
        for (String str : collections) {
            doSomething(str);
        }
    }

    private static void doSomething(String str) {
        System.out.println(str);
    }

}

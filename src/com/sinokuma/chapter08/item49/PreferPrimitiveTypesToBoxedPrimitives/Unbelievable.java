package com.sinokuma.chapter08.item49.PreferPrimitiveTypesToBoxedPrimitives;

/**
 * ボクシングされた基本データより基本データ型を選ぶ。
 *
 * @author sinokuma
 */
public class Unbelievable {
    static Integer i;

    public static void main(String[] args) {
        if (i == 42)
            System.out.println("Unbelievable");
    }
}

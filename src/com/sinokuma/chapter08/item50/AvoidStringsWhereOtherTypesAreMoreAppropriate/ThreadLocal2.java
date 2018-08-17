package com.sinokuma.chapter08.item50.AvoidStringsWhereOtherTypesAreMoreAppropriate;

/**
 * 他の型が適切な場所では、文字列を避ける。
 * 文字列は、他の値型/列挙型/集合型/ケイパビリティに対する代替としては貧弱。
 *
 *
 * @author sinokuma
 */
public class ThreadLocal2 {

    // インスタンス化不可能
    private ThreadLocal2() {
        // do nothing
    }

    // ケイパビリティ
    public static class Key {
        Key() {
            // do something
        }
    }

    // 一意の偽造できないキーを生成する
    public static Key getKey() {
        return new Key();
    }

    // 名前付き変数に対するカレントスレッドの値を設定する。
    public static void set(Key key, Object value) {
        // do something
    }

    // 名前付き変数に対するカレントスレッドの値を返す。
    public static Object get(Key key) {
        return null;
    }
}

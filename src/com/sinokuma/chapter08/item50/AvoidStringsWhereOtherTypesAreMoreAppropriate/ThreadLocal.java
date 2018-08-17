package com.sinokuma.chapter08.item50.AvoidStringsWhereOtherTypesAreMoreAppropriate;

/**
 * 他の型が適切な場所では、文字列を避ける。
 *
 * @author sinokuma
 */
// 不完全 - ケイパビリティとして、Stringの不適切な使用！
// keyが共有されたグローバルな名前空間を表している。
public class ThreadLocal {

    // インスタンス化不可能
    private ThreadLocal() {
        // do nothing
    }

    // 名前付き変数に対するカレントスレッドの値を設定する。
    public static void set(String key, Object value) {
        // do something
    }

    // 名前付き変数に対するカレントスレッドの値を返す。
    public static Object get(String key) {
        return null;
    }
}

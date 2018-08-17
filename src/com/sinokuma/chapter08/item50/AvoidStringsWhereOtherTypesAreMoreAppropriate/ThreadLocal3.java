package com.sinokuma.chapter08.item50.AvoidStringsWhereOtherTypesAreMoreAppropriate;

/**
 * 他の型が適切な場所では、文字列を避ける。
 * より良いデータ型が存在する、あるいは書くことができる場合に、
 * 何も考えずに文字列でオブジェクトを表現してしまうことは避ける。
 *
 * @author sinokuma
 */
public final class ThreadLocal3<T> {

    // インスタンス化不可能
    public ThreadLocal3() {
        // do something
    }

    // 名前付き変数に対するカレントスレッドの値を設定する。
    public void set(T value) {
        // do something
    }

    // 名前付き変数に対するカレントスレッドの値を返す。
    public T get() {
        return null;
    }
}

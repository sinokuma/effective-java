/**
 *
 */
package com.sinokuma.chapter05.item28.UseBoundedWildcardsToIncreaseAPIFlexibility;

import java.util.Collection;

/**
 * APIの柔軟性向上のために境界ワイルドカードを使用する<br>
 * PECS ( producer - extends / consumer - super )
 *
 * @author sinokuma
 *
 */
public class Stack<E> {

    // Stackクラスのpublic API(内部実装は省略)
    public Stack() { }
    public void push(E e) { }
    public E pop() { return null; }
    public boolean isEmpty() { return false; }

    // ワイルドカードを使用しない(不十分)
    public void pushAll(Iterable<E> src) {
        for (E e : src)
            push(e);
    }

    // Eプロデューサとしての役割のパラメータのためのワイルドカード型
    public void pushAll2(Iterable<? extends E> src) {
        for (E e : src)
            push(e);
    }

    // ワイルドカードを使用しない(不十分)
    public void popAll(Collection<E> dst) {
        while (!isEmpty())
            dst.add(pop());
    }

    // Eコンシューマとしての役割のパラメータのためのワイルドカード
    public void popAll2(Collection<? super E> dst) {
        while (!isEmpty())
            dst.add(pop());
    }

}

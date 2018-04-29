/**
 *
 */
package chapter02.item06.eliminateObsoleteObjectReference;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 廃れたオブジェクト参照を取り除く<br>
 * メモリリークを発見できますか？
 *
 * @author sinokuma
 *
 */
public class Stack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        // スタックが大きくなった後に小さくなると、
        // 取り出されたオブジェクトは廃れた参照を保持してしまいガベージコレクトされなくなる
        return elements[--size];
    }

    public Object pop_improved() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;  // 廃れた参照を取除く
        return result;
    }

    /**
     * 配列を大きくする必要があるごとに容量を倍にして最低もう1つの要素分の容量を確保する
     *
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

}

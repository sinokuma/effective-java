/**
 *
 */
package chapter03.item11.overrideCloneJudiciously;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * cloneを注意してオーバーライドする
 *
 * @author sinokuma
 *
 */
public class Stack implements Cloneable {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] =e;
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
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    /**
     * cloneメソッドが、元のオブジェクトに対して何も害を及ぼしていないこと、<br>
     * 複製先に対して状態の不変式を適切に確立していることを保証する。
     */
    @Override
    public Stack clone() {
        try {
            Stack result = (Stack) super.clone();
            result.elements = elements.clone();	// 配列に対して再帰的にcloneを呼出す
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

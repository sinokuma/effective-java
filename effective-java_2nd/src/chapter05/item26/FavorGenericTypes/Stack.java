/**
 *
 */
package chapter05.item26.FavorGenericTypes;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * ジェネリック型を使用する
 *
 * @author sinokuma
 *
 */
public class Stack<E> {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    // 無検査警告の適切な抑制
    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        // pushは要素が型Eであることを共有しているので、キャストは正しい
        @SuppressWarnings("unchecked")
        E result = (E) elements[--size];
        elements[size] = null;  // 廃れた参照を取除く
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}

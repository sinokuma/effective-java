/**
 *
 */
package chapter05.item24.EliminateUncheckedWarnings;

import java.util.Arrays;

/**
 * 無検査警告を取り除く
 *
 * @author sinokuma
 *
 */
public class Sample {

    transient Object[] elementData;

    private int size;

    // @SuppressWarningsのスコープを狭くするためにローカル変数を追加する
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            // T[]として渡されたのと同じ型の配列を生成するので、このキャストは正しい。(理由のコメントを必ず書く)
            @SuppressWarnings("unchecked")
            T[] result = (T[]) Arrays.copyOf(elementData, size, a.getClass());
            return result;
        }
        System.arraycopy(elementData, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }


}

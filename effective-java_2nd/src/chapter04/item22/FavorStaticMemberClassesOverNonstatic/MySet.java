/**
 *
 */
package chapter04.item22.FavorStaticMemberClassesOverNonstatic;

import java.util.AbstractSet;
import java.util.Iterator;

/**
 * 非staticのメンバークラスよりstaticメンバークラスを選ぶ
 *
 * @author sinokuma
 *
 */
// 非staticメンバークラスの典型的使用方法
public class MySet<E> extends AbstractSet<E> {

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    @Override
    public int size() {
        // 何らかの処理を実装
        return 0;
    }

    /**
     * エンクロージングインスタンスへアクセスする必要がないメンバークラスを宣言するのであれば、<br>
     * その宣言にstatic修飾子を常に付与すること。
     *
     * @author sinokuma
     *
     */
    private class MyIterator implements Iterator<E> {

        @Override
        public boolean hasNext() {
            // 何らかの処理を実装
            return false;
        }

        @Override
        public E next() {
            // 何らかの処理を実装
            return null;
        }
    }
}

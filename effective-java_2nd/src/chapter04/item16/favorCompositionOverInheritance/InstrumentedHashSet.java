/**
 *
 */
package chapter04.item16.favorCompositionOverInheritance;

import java.util.Collection;
import java.util.HashSet;

/**
 * 継承よりコンポジションを選ぶ<br>
 * 不完全 - 継承の不適切な使用
 *
 * @author sinokuma
 *
 */
public class InstrumentedHashSet<E> extends HashSet<E> {
    // 要素の挿入回数
    private int addCount = 0;

    public InstrumentedHashSet() {
    }

    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        // HashSetのaddAllメソッドは内部的にaddメソッドを使用しているため、重複カウントしてしまう
        return super.addAll(c);
    }

    public int getCount() {
        return addCount;
    }
}

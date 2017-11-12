/**
 *
 */
package chapter04.item16.favorCompositionOverInheritance;

import java.util.Collection;
import java.util.Set;

/**
 * 継承よりコンポジションを選ぶ<br>
 * ラッパークラス - 継承の代わりにコンポジションを使用している
 *
 * @author sinokuma
 *
 */
public class InstrumentedSet<E> extends ForwardingSet<E> {
    private int addCount = 0;

    public InstrumentedSet(Set<E> s) {
        super(s);
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

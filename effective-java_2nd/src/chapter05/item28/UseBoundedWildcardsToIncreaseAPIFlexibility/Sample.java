/**
 *
 */
package chapter05.item28.UseBoundedWildcardsToIncreaseAPIFlexibility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * APIの柔軟性向上のために境界ワイルドカードを使用する
 *
 * @author sinokuma
 *
 */
public class Sample {

    static <E> E reduce(List<? extends E> list, Function<E> f, E initVal) {
        List<E> snapshot;
        synchronized (list) {
            snapshot = new ArrayList<>();
        }
        E result = initVal;
        for (E e : snapshot)
            result = f.apply(result, e);
        return result;
    }

    // 戻り値にワイルドカードを使用しない
    public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }

    public static <T extends Comparable<? super T>> T max(List<? extends T> list) {
        Iterator<? extends T> i = list.iterator();
        T result = i.next();
        while (i.hasNext()) {
            T t = i.next();
            if (t.compareTo(result) > 0)
                result = t;
        }
        return result;
    }
}

interface Function<T> {
    T apply(T arg1, T arg2);
}

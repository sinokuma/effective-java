/**
 *
 */
package chapter05.item25.PreferListsToArrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 配列よりもリストを選ぶ
 *
 * @author sinokuma
 *
 */
public class Sample {

    // ジェネリクスを使用しない簡約、そして並行性の欠陥
    static Object reduce(List list, Function f, Object initVal) {
        synchronized (list) {
            Object result = initVal;
            for (Object o : list)
                result = f.apply(result, o);
            return result;
        }
    }

    // ジェネリクスを使用せず、並行性の欠陥もない簡約
    static Object reduce2(List list, Function f, Object initVal) {
        // リストを内部的に
        Object[] snapshot = list.toArray();
        Object result = initVal;
        for (Object o : snapshot)
            result = f.apply(result, o);
        return result;
    }

    // リストに基づく簡約
    static <E> E reduce3(List<E> list, Function<E> f, E initVal) {
        List<E> snapshot;
        synchronized (list) {
            snapshot = new ArrayList<>();
        }
        E result = initVal;
        for (E e : snapshot)
            result = f.apply(result, e);
        return result;
    }
}

interface Function<T> {
    T apply(T arg1, T arg2);
}

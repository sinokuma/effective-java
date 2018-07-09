/**
 *
 */
package com.sinokuma.chapter04.item18.preferInterfacesToAbstractClasses;

import java.util.Map;

/**
 * 抽象クラスよりインタフェースを選ぶ<br>
 * 骨格実装(skeletal implementation)
 *
 * @author sinokuma
 *
 */
public abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {
    // 基本操作
    public abstract K getKey();
    public abstract V getValue();

    // 変更可能なマップでのエントリーは、このメソッドをオーバーライドしなければならない
    public V setValue(V value) {
        throw new UnsupportedOperationException();
    }

    // Map.Entry.equalsの一般契約を実装
    @SuppressWarnings("rawtypes")
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Map.Entry))
            return false;
        Map.Entry<?, ?> arg = (Map.Entry) o;
        return equals(getKey(), arg.getKey()) && equals(getValue(), arg.getValue());
    }

    private static boolean equals(Object o1, Object o2) {
        return o1 == null ? o2 == null : o1.equals(o2);
    }

    // Map.Entry.hashCodeの一般契約を実装
    @Override
    public int hashCode() {
        return hashCode(getKey()) ^ hashCode(getValue());
    }
    private static int hashCode(Object obj) {
        return obj == null ? 0 : obj.hashCode();
    }

}

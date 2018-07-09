/**
 *
 */
package com.sinokuma.chapter05.item23.DontUseRawTypesInNewCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 新たなコードで原型を使用しない
 *
 * @author sinokuma
 *
 */
public class Sample {

    // 原型(List)を使用している。実行時に失敗！
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        unsafeAdd(strings, new Integer(42));
        String s = strings.get(0);	//	コンパイラ生成によるキャスト
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    // 不明な型に対して原型の使用。これをやってはいけない。
    @SuppressWarnings("rawtypes")
    static int numElementsInCommon(Set s1, Set s2) {
        int result = 0;
        for (Object o1 : s1)
            if (s2.contains(o1))
                result++;
        return result;
    }

    // 非境界ワイルドカード型。型安全で柔軟。
    static int numElementsInCommonImproved(Set<?> s1, Set<?> s2) {
        int result = 0;
        for (Object o1 : s1)
            if (s2.contains(o1))
                result++;
        return result;
    }

}

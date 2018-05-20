/**
 *
 */
package chapter05.item27.FavorGenericMethods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ジェネリックメソッドを使用する
 *
 * @author sinokuma
 *
 */
public class Sample {

    // 原型を使用している - 使用すべきではない
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    // ジェネリックメソッド
    public static <E> Set<E> union2(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }

    // ジェネリックメソッドをテストする簡単なプログラム
    public static void main(String[] args) {
        Set<String> guys = new HashSet<String>(Arrays.asList("Tom", "Dick", "Harry"));
        Set<String> stooges = new HashSet<String>(Arrays.asList("Larry", "Moe", "Curly"));
        Set<String> aflCio = union2(guys, stooges);
        System.out.println(aflCio);
    }
}

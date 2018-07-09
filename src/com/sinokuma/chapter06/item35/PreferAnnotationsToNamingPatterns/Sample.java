/**
 *
 */
package com.sinokuma.chapter06.item35.PreferAnnotationsToNamingPatterns;

/**
 * 命名パターンよりアノテーションを選ぶ<br>
 * マーカーアノテーションを含むプログラム
 *
 * @author sinokuma
 *
 */
public class Sample {

    @Test
    public static void m1() { }
    public static void m2() { }
    @Test
    public static void m3() {
        throw new RuntimeException("Boom");
    }
    public static void m4() { }
    @Test
    // 不正な使用： staticでないメソッド
    public void m5() { }
    public static void m6() { }
    @Test
    public static void m7() {
        throw new RuntimeException("Crash");
    }
    public static void m8() { }
}

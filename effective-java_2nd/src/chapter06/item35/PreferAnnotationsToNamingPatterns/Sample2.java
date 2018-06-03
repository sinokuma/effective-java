/**
 *
 */
package chapter06.item35.PreferAnnotationsToNamingPatterns;

/**
 * 命名パターンよりアノテーションを選ぶ<br>
 * パラメータを持つアノテーションを含むプログラム
 *
 * @author sinokuma
 *
 */
public class Sample2 {

    @ExceptionTest(ArithmeticException.class)
    public static void m1() {
        int i = 0;
        i = i / i;
    }
    @ExceptionTest(ArithmeticException.class)
    public static void m2() {
        int[] a = new int[0];
        @SuppressWarnings("unused")
        int i = a[1];
    }
    @ExceptionTest(ArithmeticException.class)
    public static void m3() { }
}

/**
 *
 */
package chapter06.item35.PreferAnnotationsToNamingPatterns;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 命名パターンよりアノテーションを選ぶ<br>
 * マーカーアノテーションを処理するプログラム
 *
 * @author sinokuma
 *
 */
public class RunTests {
    public static void main(String[] args) throws ClassNotFoundException {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName(args[0]);
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Test.class)) {
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(m + " failed: " + exc);
                } catch (IllegalAccessException | IllegalArgumentException e) {
                    System.out.println("INVALID @Test: " + m);
                }
            }
            if (m.isAnnotationPresent(ExceptionTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("Test %s failed: no exception%n", m);
                } catch (InvocationTargetException wrappedEx) {
                    Throwable exc = wrappedEx.getCause();
                    Class<? extends Exception> excType = m.getAnnotation(ExceptionTest.class).value();
                    if (excType.isInstance(exc)) {
                        passed++;
                    } else {
                        System.out.printf("Test %s failed: expected %s, got %s%n",
                                m, excType.getName(), exc);
                    }
                } catch (IllegalAccessException | IllegalArgumentException e) {
                    System.out.println("INVALID @Test: " + m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
    }
}

/**
 *
 */
package chapter06.item35.PreferAnnotationsToNamingPatterns;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 命名パターンよりアノテーションを選ぶ<br>
 * アノテーションが付けられたメソッドは、成功するには指定された例外をスローしなければならないテストメソッドであることを示す。
 *
 * @author sinokuma
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest {
    Class<? extends Exception> value();
}

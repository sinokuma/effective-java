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
 * このアノテーションが付けられたメソッドがテストメソッドであることを示す。<br>
 * パラメータなしのstaticのメソッドに対してだけ使用すること。
 *
 * @author sinokuma
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}

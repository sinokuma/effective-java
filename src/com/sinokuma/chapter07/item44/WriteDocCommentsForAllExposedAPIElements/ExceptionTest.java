/**
 *
 */
package com.sinokuma.chapter07.item44.WriteDocCommentsForAllExposedAPIElements;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * すべての公開API要素に対してドキュメントコメントを書く<br>
 * アノテーションを文書する際には、すべてのメンバーを文書する<br>
 *
 * Indicates that the annotated method is test method that
 * must throw the designated exception to succeed.
 *
 * @author sinokuma
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest {

    /**
     * The exception that the annotated test method must throw
     * in order to pass.(The test is permitted to throw any
     * subtype of the type described by this class object.)
     */
    Class<? extends Throwable> value();

}

/**
 *
 */
package com.sinokuma.chapter07.item44.WriteDocCommentsForAllExposedAPIElements;

/**
 * すべての公開API要素に対してドキュメントコメントを書く<br>
 * APIを適切に文書化するためには、すべての公開されているクラス、インタフェース、コンストラクタ、メソッド、フィールド宣言の前に
 * ドキュメントコメントを書かなければならない。
 *
 * @author sinokuma
 *
 */
public class Sample {

    /**
     * メソッドに関するドキュメントコメントは、メソッドとそのクライアント間の契約を簡潔に記述すべき<br>
     * メソッドが何を行なっているか、事前条件と事後条件を列挙すべき<br>
     * すべての副作用を文書化し、スレッド安全性について記述すべき
     */
    public void foo() {
        // do nothing
    }

    /**
     * ジェネリック型やジェネリックメソッドを文書化する際は、すべての型パラメータを文書化する
     * @param <E> hogehoge
     */
    public <E> void bar() {
        // do nothing
    }

}

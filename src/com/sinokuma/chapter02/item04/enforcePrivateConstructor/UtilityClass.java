/**
 * 
 */
package com.sinokuma.chapter02.item04.enforcePrivateConstructor;

/**
 * privateのコンストラクタでインスタンス化不可能を強制する
 * 
 * @author sinokuma
 *
 */
public class UtilityClass {

    // インスタンス化できないようにするためにデフォルトコンストラクタを抑制する
    private UtilityClass() {
        // 必須ではないが、同クラスから呼び出された場合の保険としてAssertionErrorをthrowする
        throw new AssertionError();
    }

}

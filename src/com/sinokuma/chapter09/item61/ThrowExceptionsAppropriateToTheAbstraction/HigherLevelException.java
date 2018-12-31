package com.sinokuma.chapter09.item61.ThrowExceptionsAppropriateToTheAbstraction;

/**
 * 抽象概念に適した例外をスローする
 *
 * 上位レイヤ例外
 *
 * @author sinokuma
 *
 */
class HigherLevelException extends RuntimeException {
    /**
     * コンストラクタ
     *
     * @param cause 原因
     */
    HigherLevelException(Throwable cause) {
        super(cause);
    }

    /**
     * コンストラクタ
     *
     * @param message メッセージ
     */
    HigherLevelException(String message) {
        System.out.println(message);
    }
}

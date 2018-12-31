package com.sinokuma.chapter09.item61.ThrowExceptionsAppropriateToTheAbstraction;

/**
 * 抽象概念に適した例外をスローする
 *
 * 下位レイヤ例外
 *
 * @author sinokuma
 *
 */
public class LowerLevelException extends RuntimeException {
    /**
     * コンストラクタ
     *
     * @param cause 原因
     */
    public LowerLevelException(Throwable cause) {
        super(cause);
    }
}

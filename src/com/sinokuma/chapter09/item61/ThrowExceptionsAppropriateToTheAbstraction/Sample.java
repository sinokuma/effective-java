package com.sinokuma.chapter09.item61.ThrowExceptionsAppropriateToTheAbstraction;

/**
 * 抽象概念に適した例外をスローする
 *
 * 上位レイヤは下位レベルの例外をキャッチして、上位レイヤの中で上位レベルの抽象概念の観点から説明可能な例外をスローすべき
 * 例外翻訳は、下位レイヤから何も考えないで例外を伝播させるよりは優れているが、乱用すべきではありません
 *
 * @author sinokuma
 */
public class Sample {

    /**
     * 例外翻訳
     */
    @SuppressWarnings("EmptyTryBlock")
    void exceptionTranslation() {
        try {
            // 処理をするために下位レベルの抽象概念を使用する
        } catch (LowerLevelException e) {
            throw new HigherLevelException("hogehoge");
        }
    }

    /**
     * 例外連鎖
     */
    @SuppressWarnings("EmptyTryBlock")
    void exceptionChaining() {
        try {
            // 処理をするために下位レベルの抽象概念を使用する
        } catch (LowerLevelException cause) {
            throw new HigherLevelException(cause);
        }
    }
}
/**
 *
 */
package com.sinokuma.chapter06.item33.UseEnumMapInsteadOfOrdinalIndexing;

/**
 * 序数インデックスの代わりにEnumMapを使用する<br>
 * 配列の配列をインデックスするのにordinal()を使用 - これを行ってはいけない
 *
 * @author sinokuma
 *
 */
public enum Phase {
    SOLID, LIQUID, GAS;

    public enum Transition {
        MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;

        // srcの序数が行で、dstの序数で列がインデックスされる
        private static final Transition[][] TRANSITIONS = {
                { null, MELT, SUBLIME },
                { FREEZE, null, BOIL },
                { DEPOSIT, CONDENSE, null }
        };

        // 1つの相から別の相への相転移を返す
        public static Transition from(Phase src, Phase dst) {
            return TRANSITIONS[src.ordinal()][dst.ordinal()];
        }
    }
}

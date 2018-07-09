/**
 *
 */
package com.sinokuma.chapter07.item38.CheckParametersForValidity;

import java.math.BigInteger;

/**
 * パラメータの正当性を検査する
 *
 * @author sinokuma
 *
 */
public class Sample {
    /**
     * 値が(this mod m)であるBigIntegerを返します。このメソッドは、<br>
     * remainderメソッドとは異なり、常に負でないBigIntegerを返します。
     *
     * @param m 正でなければならないモジュラス
     * @return this mod m
     * @throws ArithmeticException m <= 0の場合
     */
    public BigInteger mod(BigInteger m) {
        if (m.signum() <= 0)
            throw new ArithmeticException("Modulus <= 0: " + m);
        // 計算を行う
        return m;
    }

    // 再帰的ソートのためのprivateのヘルパー関数
    @SuppressWarnings("unused")
    private static void sort(long a[], int offset, int length) {
        assert a != null;
        assert offset >= 0 && offset <= a.length;
        assert length >= 0 && length <= a.length - offset;
        // 計算を行う
    }
}

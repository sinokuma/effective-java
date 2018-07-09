/**
 *
 */
package com.sinokuma.chapter07.item42.UseVarargsJudiciously;

/**
 * 可変長引数を注意して使用する<br>
 * 最後のパラメータとして配列をもつメソッドは修正すべきでない。<br>
 * そのメソッドが本当に可変長引数の値列に対して操作を行う場合にだけ、可変長引数を使用する。
 *
 * @author sinokuma
 *
 */
public class Sample {

    // 1個以上の引数を渡すために可変長引数を利用する誤った方法
    static int min(int... args) {
        if (args.length == 0)
            throw new IllegalArgumentException("Too few arguments");
        int min = args[0];
        for (int i = 1; i < args.length; i++)
            if (args[i] < min)
                min = args[i];
        return min;
    }

    // 1個以上の引数を渡すための正しい可変長引数の利用方法
    static int min(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for (int arg : remainingArgs)
            if (arg < min)
                min = arg;
        return min;
    }
}

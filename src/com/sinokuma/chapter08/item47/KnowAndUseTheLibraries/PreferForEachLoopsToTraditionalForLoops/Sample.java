package com.sinokuma.chapter08.item47.KnowAndUseTheLibraries.PreferForEachLoopsToTraditionalForLoops;

import java.util.*;

/**
 * ライブラリーを知り、ライブラリーを使う<br>
 *     java.lang、java.util、java.ioの内容はある程度知っておくべき
 *
 * @author sinokuma
 */
public class Sample {

    private static final Random rnd = new Random();

    // よく見かけるが、欠陥がある！
    static int random(int n) {
        return Math.abs(rnd.nextInt()) % n;
    }

    public static void main(String args[]) {
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        for (int i = 0; i < 1000000; i++)
            if (random(n) < n/2)
                low++;

        System.out.println(low);
    }
}

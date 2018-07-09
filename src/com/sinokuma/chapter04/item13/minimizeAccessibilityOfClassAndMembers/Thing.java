/**
 *
 */
package com.sinokuma.chapter04.item13.minimizeAccessibilityOfClassAndMembers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * クラスとメンバーへのアクセス可能性を最小限にする。
 *
 * @author sinokuma
 *
 */
public class Thing {

    // 潜在的なセキュリティホール(長さが0ではない配列は常に可変。いつ変更されるか分からない)
    // privateの配列フィールドだとしても、アクセッサが生成されていれば同様の危険性あり。
    // public static final Thing[] VALUES = { };

    // publicの配列はprivateに
    private static final Thing[] PRIVATE_VALUES = { };

    /**
     * pattern1. publicの不変リストを追加する。
     */
    public static final List<Thing> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    /**
     * pattern2. privateの配列のコピーを返すpublicメソッドを追加
     *
     * @return privateな配列
     */
    public static final Thing[] values() {
        return PRIVATE_VALUES.clone();
    }
}

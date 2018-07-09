/**
 *
 */
package com.sinokuma.chapter07.item41.UseOverloadingJudiciously;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * オーバーロードを注意して使用する<br>
 * 安全で保守的な方針は、同じパラメータ数の2つのオーバーロードされたメソッドを決して提供しない
 *
 * @author sinokuma
 *
 */
public class CollectionClassifier2 {

    public static String classify(Collection<?> c) {
        return c instanceof Set ? "Set" : c instanceof List ? "List" : "Unknown Collection";
    }

    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> c : collections)
            System.out.println(classify(c));
    }

}

/**
 *
 */
package chapter04.item21.UseFunctionObjectsToRepresentStrategies;

import java.io.Serializable;
import java.util.Comparator;

/**
 * 戦略を表現するために関数オブジェクトを使用する
 *
 * @author sinokuma
 *
 */
public class Host {
    private static class StrLenCmp implements Comparator<String>, Serializable{
        @Override
        public int compare(String s1, String s2) {
            return s1.length() - s2.length();
        }
    }

    // 返却されたコンパレータはシリアライズ可能
    public static final Comparator<String> STRING_LENGTH_COMPARATOR = new StrLenCmp();

}

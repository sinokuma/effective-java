/**
 *
 */
package chapter06.item36.ConsistentlyUseTheOverrideAnnotation;

import java.util.HashSet;
import java.util.Set;

/**
 * 常にOverrideアノテーションを使用する
 *
 * @author sinokuma
 *
 */
public class Bigram {

    private final char first;
    private final char second;

    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    // Object.equals(Object obj)をオーバーロードしてしまっている
    // 下の正しいOverrideがないと、mainメソッドの実行結果は260になる
    public boolean equals(Bigram b) {
        return b.first == first && b.second == second;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bigram))
            return false;
        Bigram b = (Bigram) o;
        return b.first == first && b.second == second;
    }

    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Bigram> s = new HashSet<>();
        for (int i = 0; i < 10; i++)
            for (char ch = 'a'; ch <= 'z'; ch++)
                s.add(new Bigram(ch, ch));
        System.out.println(s.size());
    }

}

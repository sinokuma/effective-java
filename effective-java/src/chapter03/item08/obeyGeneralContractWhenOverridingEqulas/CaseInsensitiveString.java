/**
 *
 */
package chapter03.item08.obeyGeneralContractWhenOverridingEqulas;

/**
 * equalsをオーバーライドする時は一般契約に従う<br>
 *  1. 反射的: x.equals(x) = true<br>
 *  2. 対称的: y.equals(x) = true ⇨ x.equals(y) = true<br>
 *  3. 推移的: x.equals(y), y.equals(z) = true ⇨ x.equals(z) = true<br>
 *  4. 整合的: x.equals(y)の結果は終始一貫する
 *
 * @author sinokuma
 *
 */
public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        if (s == null)
            throw new NullPointerException();
        this.s = s;
    }

    // 不完全 - 対称性を守っていない
    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        if (o instanceof String)	// 一方向の相互作用
            return s.equalsIgnoreCase((String) o);
        return false;
    }

    public boolean equals2(Object o) {
        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }
}

/**
 *
 */
package chapter03.item12.considerImplementingComparable;

/**
 * Comparableの実装を検討する。
 *
 * @author sinokuma
 *
 */
public final class CaseInsensitiveString implements Comparable<CaseInsensitiveString> {
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

    @Override
    public int compareTo(CaseInsensitiveString cis) {
        return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
    }
}

/**
 *
 */
package com.sinokuma.chapter03.item08.obeyGeneralContractWhenOverridingEqulas;

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
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point))
            return false;
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }

    // 不完全 - リスコフの置換原則違反
    // サブクラスが渡されるとうまく機能しない
    public boolean equals2(Object o) {
        if (o == null || o.getClass() != getClass())
            return false;
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }
}

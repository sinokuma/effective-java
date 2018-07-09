/**
 *
 */
package com.sinokuma.chapter03.item08.obeyGeneralContractWhenOverridingEqulas;

import java.awt.Color;

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
public final class ColorPoint {
    private Point point;
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        if (color == null)
            throw new NullPointerException();
        point = new Point(x, y);
        this.color = color;
    }

    // カラーポイントが持つポイントのビューを返す
    public Point asPoint() {
        return point;
    }

    // 不完全 - 対称性を守っていない
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint))
            return false;
        return super.equals(o) && ((ColorPoint) o).color == color;
    }

    // 不完全 - 推移性を守っていない
    public boolean equals2(Object o) {
        if (!(o instanceof Point))
            return false;
        // oが普通のポイントなら、色を無視した比較
        if (!(o instanceof ColorPoint))
            return o.equals(this);
        // oはColorPoint。完全な比較を行う
        return super.equals(o) && ((ColorPoint) o).color == color;
    }

    public boolean equals3(Object o) {
        if (!(o instanceof ColorPoint))
            return false;
        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}

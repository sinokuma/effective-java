/**
 *
 */
package chapter04.item14.inPublicClassUseAccessorMethodsNotPublicFields;

/**
 * publicクラスでは、publicフィールドではなく、アクセッサーメソッドを使う。
 *
 * @author sinokuma
 *
 */
class Point {

    // publicにすべきではない。
    // public float x;
    // public float y;

    // アクセッサー(getter)とミューテーター(setter)でカプセル化
    private double x;
    private double y;

    public Point(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
}

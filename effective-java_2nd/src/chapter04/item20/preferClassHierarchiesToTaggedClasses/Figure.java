/**
 *
 */
package chapter04.item20.preferClassHierarchiesToTaggedClasses;

/**
 * タグ付クラスよりクラス階層を選ぶ<br>
 * クラス階層による置換
 *
 * @author sinokuma
 *
 */
abstract class Figure {
    abstract double area();
}

class Circle extends Figure {
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * (radius * radius);
    }
}

class Rectangle extends Figure {
    final double length;
    final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

// 型間の自然な階層関係の反映ができ、柔軟性が増す
class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
}

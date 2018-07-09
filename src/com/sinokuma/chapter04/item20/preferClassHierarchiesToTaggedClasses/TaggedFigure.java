/**
 *
 */
package com.sinokuma.chapter04.item20.preferClassHierarchiesToTaggedClasses;

/**
 * タグ付クラスよりクラス階層を選ぶ<br>
 * タグ付クラス - クラス階層よりかなり劣る
 *
 * @author sinokuma
 *
 */
class TaggedFigure {
    enum Shape { RECTANGLE, CIRCLE };

    // タグフィールド - 図形
    final Shape shape;

    // shapeがRECTANGLEの場合のみ使用するフィールド
    double length;
    double width;

    // shapeがCIRCLEの場合のみ使用するフィールド
    double radius;

    // 円のためのコンストラクタ
    TaggedFigure(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    // 四角形のためのコンストラクタ
    TaggedFigure(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area() {
        switch(shape) {
        case RECTANGLE:
            return length * width;
        case CIRCLE:
            return Math.PI * (radius * radius);
        default:
            throw new AssertionError();
        }
    }
}

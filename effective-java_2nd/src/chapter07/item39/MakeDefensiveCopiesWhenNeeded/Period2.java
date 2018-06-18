/**
 *
 */
package chapter07.item39.MakeDefensiveCopiesWhenNeeded;

import java.util.Date;

/**
 * 必要な場合には、防御的にコピーする<br>
 * 真の教訓は、可能な場所では不変オブジェクトを使用すること
 *
 * @author sinokuma
 *
 */
public final class Period2 {
    private final Date start;
    private final Date end;

    /**
     * @param start 期間の開始
     * @param end 期間の終わりで、開始より前であってはならない
     * @throws IllegalArgumentException startがendの後の場合
     * @throws NullPointerException startかendがnullの場合
     */
    // 修正されたコンストラクタ - パラメータの防御的コピーをする
    public Period2(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        // パラメータの妥当性検証前に防御的コピーを行い、コピーに対して正当性検証を行う(TOCTOU攻撃を防ぐ)
        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(this.start + " after " + this.end);

    }

    // 修正されたアクセッサ - 内部フィールドの防御的コピーをする
    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }
}

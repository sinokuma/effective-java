/**
 *
 */
package chapter04.item14.inPublicClassUseAccessorMethodsNotPublicFields;

/**
 * publicクラスでは、publicフィールドではなく、アクセッサーメソッドを使う。<br>
 * 公開された不変フィールドを持つpublicクラス(疑わしい)
 *
 * @author sinokuma
 *
 */
public class Time {

    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_DAY = 60;

    // APIを変更することなく、クラス表現を変更できない。
    // フィールドが読み込まれた時に補助的な処理を行うことができない。
    public final int hour;
    public final int minute;

    public Time(int hour, int minute) {
        if (hour < 0 || hour >= HOURS_PER_DAY)
            throw new IllegalArgumentException("Hour: " + hour);
        if (minute < 0 || minute >= MINUTES_PER_DAY)
            throw new IllegalArgumentException("Min: " + minute);
        this.hour = hour;
        this.minute = minute;
    }

}

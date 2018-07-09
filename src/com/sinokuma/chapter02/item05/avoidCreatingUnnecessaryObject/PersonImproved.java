/**
 * 
 */
package com.sinokuma.chapter02.item05.avoidCreatingUnnecessaryObject;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 不必要なオブジェクトの生成を避ける<br>
 * 改善コーディング例
 * 
 * @author sinokuma
 *
 */
public class PersonImproved {

    private final Date birthDate = new Date();  // 誕生日を設定する
    /**
     * ベビーブームの開始と終わりの日付
     */
    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_END = gmtCal.getTime();
    }

    // メソッドが使用されないからといって遅延初期化をするのは非推奨。
    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOM_START) >= 0 && 
                birthDate.compareTo(BOOM_END) < 0;

    }

}

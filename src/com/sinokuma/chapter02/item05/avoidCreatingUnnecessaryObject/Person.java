/**
 * 
 */
package com.sinokuma.chapter02.item05.avoidCreatingUnnecessaryObject;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 不必要なオブジェクトの生成を避ける<br>
 * やってはいけないコーディング例
 * 
 * @author sinokuma
 *
 */
public class Person {

    private final Date birthDate = new Date();  // 誕生日を設定する

    // これをやってはいけない
    public boolean isBabyBoomer() {
        // 不必要なCalendarインスタンス、TimeZoneインスタンス、2つのDateインスタンスを生成
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = gmtCal.getTime();

        return birthDate.compareTo(boomStart) >= 0 && 
                birthDate.compareTo(boomEnd) < 0;

    }

}

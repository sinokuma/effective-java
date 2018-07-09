/**
 *
 */
package com.sinokuma.chapter07.item39.MakeDefensiveCopiesWhenNeeded;

import java.util.Date;

/**
 * 必要な場合には、防御的にコピーする<br>
 * 不完全な不変クラス
 *
 * @author sinokuma
 *
 */
public final class Period {
    private final Date start;
    private final Date end;

    /**
     * @param start 期間の開始
     * @param end 期間の終わりで、開始より前であってはならない
     * @throws IllegalArgumentException startがendの後の場合
     * @throws NullPointerException startかendがnullの場合
     */
    public Period(Date start, Date end) {
        if (start.compareTo(end) > 0)
            throw new IllegalArgumentException(start + " after " + end);
        this.start = start;
        this.end = end;
    }

    public Date start() {
        return start;
    }

    public Date end() {
        return end;
    }
}

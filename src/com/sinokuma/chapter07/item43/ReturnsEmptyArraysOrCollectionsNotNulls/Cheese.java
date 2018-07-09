/**
 *
 */
package com.sinokuma.chapter07.item43.ReturnsEmptyArraysOrCollectionsNotNulls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * nullではなく、空配列か空コレクションを返す
 *
 * @author sinokuma
 *
 */
public class Cheese {

    private final List<Cheese> cheesesInStock = new ArrayList<>();

    private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

    /**
     * @return 店にあるすべてのチーズを含むリスト、もしくは
     * 買えるチーズがなければnull
     */
    public Cheese[] getCheeses() {
        if (cheesesInStock.size() == 0)
            return null;
        return (Cheese[]) cheesesInStock.toArray();
    }

    /**
     * コレクションから配列を返す正しい方法
     *
     * @return 店にあるすべてのチーズを含む配列
     */
    public Cheese[] getCheeses2() {
        return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
    }

    public List<Cheese> getCheeseList() {
        if (cheesesInStock.isEmpty())
            // 常に同一リストを返す
            return Collections.emptyList();
        else
            return new ArrayList<>(cheesesInStock);
    }


}

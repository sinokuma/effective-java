package com.sinokuma.chapter08.item48.AvoidFloatAndDoubleIfExactAnswersAreRequired;


import java.math.BigDecimal;

/**
 * 正確な答えが必要ならば、floatとdoubleを避ける<br>
 * 金銭計算にはBigDecimal、int、あるいはlongを使用すること
 *
 * @author sinokuma
 */
public class Sample2 {

    // BigDecimalは基本データ型より不便で遅い
    public static void main(String args[]) {
        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS;
             funds.compareTo(price) >= 0;
             price = price.add(TEN_CENTS)) {
            itemsBought++;
            funds = funds.subtract(price);
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Money left over: " + funds);
    }
}

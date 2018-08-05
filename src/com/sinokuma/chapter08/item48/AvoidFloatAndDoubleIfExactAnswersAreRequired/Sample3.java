package com.sinokuma.chapter08.item48.AvoidFloatAndDoubleIfExactAnswersAreRequired;


/**
 * 正確な答えが必要ならば、floatとdoubleを避ける<br>
 * 金銭計算にはBigDecimal、int、あるいはlongを使用すること
 *
 *
 * @author sinokuma
 */
public class Sample3 {

    // パフォーマンス重視で18桁以下ならintまたはlong使用可能
    public static void main(String args[]) {
        int itemsBought = 0;
        int funds = 100;
        for (int price = 10; funds >= price; price += 10) {
            itemsBought++;
            funds -= price;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Money left over: " + funds + " cents");
    }
}

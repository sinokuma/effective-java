package com.sinokuma.chapter08.item48.AvoidFloatAndDoubleIfExactAnswersAreRequired;


/**
 * 正確な答えが必要ならば、floatとdoubleを避ける<br>
 * float型とdouble型は、特に金銭計算には適していない
 *
 * @author sinokuma
 */
public class Sample {

    // 不完全 - 金銭計算に浮動小数点を使用している
    public static void main(String args[]) {
        double funds = 1.00;
        int itemsBought = 0;
        for (double price = .10; funds >= price; price += .10) {
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Change: $" + funds);
    }
}

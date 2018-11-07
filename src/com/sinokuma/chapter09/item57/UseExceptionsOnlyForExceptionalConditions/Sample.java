package com.sinokuma.chapter09.item57.UseExceptionsOnlyForExceptionalConditions;

import java.util.ArrayList;
import java.util.List;

/**
 * 例外的状態にだけ例外を使用する
 *
 * @author sinokuma
 */
public class Sample {

    public static void main(String[]args) {
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("the Andes"));
        mountains.add(new Mountain("Mount Everest"));
        mountains.add(new Mountain("Mount Fuji"));

        // 例外のひどい乱用。決しては行ってはならない！
        try {
            int i = 0;
            while (true)
                mountains.get(i).climb();
        } catch (ArrayIndexOutOfBoundsException e) {
            // Nothing to do
        }
    }
}
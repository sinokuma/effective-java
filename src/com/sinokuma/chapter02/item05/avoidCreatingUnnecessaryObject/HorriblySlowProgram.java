/**
 * 
 */
package com.sinokuma.chapter02.item05.avoidCreatingUnnecessaryObject;

/**
 * ボクシングされた基本データ型よりも基本データ型を選ぶ。<br>
 * 意図しない自動ボクシングには注意すること。
 * 
 * @author sinokuma
 *
 */
public class HorriblySlowProgram {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}

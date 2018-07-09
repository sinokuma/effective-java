/**
 *
 */
package com.sinokuma.chapter05.item26.FavorGenericTypes;

/**
 * ジェネリック型を使用する
 *
 * @author sinokuma
 *
 */
public class UsingStackExample {

    // ジェネリックStackを使用する小さなプログラム
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String arg : args)
            stack.push(arg);
        while (!stack.isEmpty())
            System.out.println(stack.pop().toUpperCase());
    }
}

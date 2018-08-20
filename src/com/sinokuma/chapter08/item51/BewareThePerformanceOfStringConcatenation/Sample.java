package com.sinokuma.chapter08.item51.BewareThePerformanceOfStringConcatenation;

/**
 * 文字列結合のパフォーマンスに用心する
 * n個の文字列を結合するのに、文字列結合演算子を繰り返し使用すると、nに関して2次の時間を必要とする
 *
 * @author sinokuma
 */
public class Sample {

    private static final int LINE_WIDTH = 30;

    public String statement() {
        String result = "";
        for (int i = 0; i < numItems(); i++)
            result += lineForItem(i);   // String結合
        return result;
    }

    public String statementWithSb() {
        StringBuilder b = new StringBuilder(numItems() * LINE_WIDTH);
        for (int i = 0; i < numItems(); i++)
            b.append(lineForItem(i));
        return b.toString();
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        long start = System.currentTimeMillis();
        sample.statement();
        long end = System.currentTimeMillis();
        System.out.println("statement process time: " + (end - start));

        start = System.currentTimeMillis();
        sample.statementWithSb();
        end = System.currentTimeMillis();
        System.out.println("statementWithSb process time: " + (end - start));

    }

    private int numItems() {
        return 100;
    }

    private String lineForItem(int i) {
        return "これはサンプル実装で、合計２０文字です。";
    }
}

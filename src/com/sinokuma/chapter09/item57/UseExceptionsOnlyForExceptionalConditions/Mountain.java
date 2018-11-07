package com.sinokuma.chapter09.item57.UseExceptionsOnlyForExceptionalConditions;

/**
 * 例外的状態にだけ例外を使用する
 *
 * @author sinokuma
 */
class Mountain {

    private String mountainName;

    Mountain(String name) {
        this.mountainName = name;
    }

    void climb() {
        System.out.println("Because " + mountainName + "is there.");
    }
}

package com.sinokuma.chapter08.item46.PreferForEachLoopsToTraditionalForLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 従来のforループよりfor-eachループを選ぶ
 *
 * @author sinokuma
 */
public class Sample {

    static Collection<Card.Suit> suits = Arrays.asList(Card.Suit.values());
    static Collection<Card.Rank> ranks = Arrays.asList(Card.Rank.values());

    public static void main(String args[]) {
        List<Card> deck = new ArrayList<>();
        // コレクションと配列に対するネストしたループのための望ましいイディオム
        for (Card.Suit suit : suits)
            for (Card.Rank rank : ranks)
                deck.add(new Card(suit, rank));
    }
}

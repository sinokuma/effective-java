package com.sinokuma.chapter08.item46.PreferForEachLoopsToTraditionalForLoops;

/**
 * 従来のforループよりfor-eachループを選ぶ
 *
 * @author sinokuma
 */
public class Card {

    enum Suit {CLUB, DIAMOND, HEART, SPADE}

    enum Rank {ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

    public Card(Suit suit, Rank rank) {
        // do nothing
    }

}

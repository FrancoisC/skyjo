package io.github.francoisc.skyjo.model;

import lombok.AllArgsConstructor;

import static io.github.francoisc.skyjo.Constants.DEFAULT_CARD_OCCURRENCES;

@AllArgsConstructor
public enum CardValue {
    MINUS_TWO(-2, 5),
    MINUS_ONE(-1),
    ZERO(0, 15),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    ELEVEN(11),
    TWELVE(12);

    final int value;
    final int occurrences;
    CardValue(int value) {
        this(value, DEFAULT_CARD_OCCURRENCES);
    }
}

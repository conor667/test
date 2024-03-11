package org.types;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Hiragana {

    private final String value;

    public static Hiragana of (String value) {
        if (value == null) {
            throw new IllegalArgumentException("Cannot make hiragana from null");
        }
        if (!value.matches("[ぁ-んゔ゛]")) {
            throw new IllegalArgumentException("Please use a hiragana character");
        }
        return new Hiragana(value);
    }
}

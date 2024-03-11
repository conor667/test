package org.generator;
import org.types.Hiragana;

import java.security.SecureRandom;
import java.util.*;

public class HiraganaGenerator {
    public Map<Hiragana, String> hiraganaGenerator(int size) {

        Random random = new SecureRandom();
        Map<Hiragana, String> possibleHiragana = makePossibleHiraganaList();
        List<Map.Entry<Hiragana, String>> hiraganaEntries = new ArrayList<>(possibleHiragana.entrySet());
        Map<Hiragana, String> hiraganaList = new HashMap<>();

        Collections.shuffle(hiraganaEntries, random);

        int availableSize = hiraganaEntries.size();
        if (size > availableSize) {
            throw new IllegalArgumentException("size is too large for hiragana generator, please use 1 - " + makePossibleHiraganaList().size());
        }

        for (int i = 0; i < size; i++) {
            Map.Entry<Hiragana, String> hiraganaEntry = hiraganaEntries.get(i);
            hiraganaList.put(hiraganaEntry.getKey(), hiraganaEntry.getValue());
        }
        return hiraganaList;
    }

    private Map<Hiragana, String> makePossibleHiraganaList() {
        HashMap<Hiragana, String> possibleHiragana = new HashMap<>();
        possibleHiragana.put(Hiragana.of("あ"), "a");
        possibleHiragana.put(Hiragana.of("い"), "i");
        possibleHiragana.put(Hiragana.of("う"), "u");
        possibleHiragana.put(Hiragana.of("え"), "e");
        possibleHiragana.put(Hiragana.of("お"), "o");
        possibleHiragana.put(Hiragana.of("か"), "ka");
        possibleHiragana.put(Hiragana.of("き"), "ki");
        possibleHiragana.put(Hiragana.of("く"), "ku");
        possibleHiragana.put(Hiragana.of("け"), "ke");
        possibleHiragana.put(Hiragana.of("こ"), "ko");
        possibleHiragana.entrySet();
        return possibleHiragana;
    }
}


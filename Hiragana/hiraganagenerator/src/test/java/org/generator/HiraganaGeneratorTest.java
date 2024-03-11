package org.generator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HiraganaGeneratorTest {

    HiraganaGenerator hiraganaGenerator = new HiraganaGenerator();

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void shouldGenerateRandomHiragana(int size) {

        var result = hiraganaGenerator.hiraganaGenerator(size);

        assertThat(result.size(), equalTo(size));
    }
    @Test
    public void shouldNotGenerateRandomHiraganaWithInvalidSize() {

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> hiraganaGenerator.hiraganaGenerator(20));

        assertThat(e.getMessage(), equalTo("size is too large for hiragana generator, please use 1 - 10"));
    }
}

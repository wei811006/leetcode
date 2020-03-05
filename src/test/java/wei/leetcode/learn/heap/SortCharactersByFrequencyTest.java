package wei.leetcode.learn.heap;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class SortCharactersByFrequencyTest {

    @InjectMocks
    private SortCharactersByFrequency sortCharactersByFrequency;

    @ParameterizedTest
    @CsvSource({
            "tree,eert",
            "cccaaa,cccaaa",
            "Aabb,bbAa"
    })
    void frequencySort(String s, String check) {
        String result = sortCharactersByFrequency.frequencySort(s);

        assertThat(result).isEqualTo(check);
    }
}
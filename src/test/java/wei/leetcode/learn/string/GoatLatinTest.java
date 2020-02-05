package wei.leetcode.learn.string;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class GoatLatinTest {

    @InjectMocks
    private GoatLatin goatLatin;

    @ParameterizedTest
    @CsvSource({
            "I speak Goat Latin,Imaa peaksmaaa oatGmaaaa atinLmaaaaa",
            "The quick brown fox jumped over the lazy dog,heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
            "Each word consists of lowercase and uppercase letters only,Eachmaa ordwmaaa onsistscmaaaa ofmaaaaa owercaselmaaaaaa andmaaaaaaa uppercasemaaaaaaaa etterslmaaaaaaaaa onlymaaaaaaaaaa"
    })
    void toGoatLatin(String s, String check) {
        String result = goatLatin.toGoatLatin(s);

        assertThat(result).isEqualTo(check);
    }
}
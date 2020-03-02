package wei.leetcode.learn.contest.contest178;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RankTeamsByVotesTest {

    @InjectMocks
    private RankTeamsByVotes rankTeamsByVotes;

    static Stream<Arguments> getSource() {
        return Stream.of(
                Arguments.of(
                        new String[]{"ABC","ACB","ABC","ACB","ACB"},"ACB"
                ),
                Arguments.of(
                        new String[]{"WXYZ","XYZW"},"XWYZ"
                ),
                Arguments.of(
                        new String[]{"ZMNAGUEDSJYLBOPHRQICWFXTVK"},"ZMNAGUEDSJYLBOPHRQICWFXTVK"
                ),
                Arguments.of(
                        new String[]{"BCA","CAB","CBA","ABC","ACB","BAC"},"ABC"
                ),
                Arguments.of(
                        new String[]{"M","M","M","M"}, "M"
                ),
                Arguments.of(
                        new String[]{"FVSHJIEMNGYPTQOURLWCZKAX","AITFQORCEHPVJMXGKSLNZWUY","OTERVXFZUMHNIYSCQAWGPKJL","VMSERIJYLZNWCPQTOKFUHAXG","VNHOZWKQCEFYPSGLAMXJIUTR","ANPHQIJMXCWOSKTYGULFVERZ","RFYUXJEWCKQOMGATHZVILNSP","SCPYUMQJTVEXKRNLIOWGHAFZ","VIKTSJCEYQGLOMPZWAHFXURN","SVJICLXKHQZTFWNPYRGMEUAO","JRCTHYKIGSXPOZLUQAVNEWFM","NGMSWJITREHFZVQCUKXYAPOL","WUXJOQKGNSYLHEZAFIPMRCVT","PKYQIOLXFCRGHZNAMJVUTWES","FERSGNMJVZXWAYLIKCPUQHTO","HPLRIUQMTSGYJVAXWNOCZEKF","JUVWPTEGCOFYSKXNRMHQALIZ","MWPIAZCNSLEYRTHFKQXUOVGJ","EZXLUNFVCMORSIWKTYHJAQPG","HRQNLTKJFIEGMCSXAZPYOVUW","LOHXVYGWRIJMCPSQENUAKTZF","XKUTWPRGHOAQFLVYMJSNEIZC","WTCRQMVKPHOSLGAXZUEFYNJI"},"VWFHSJARNPEMOXLTUKICZGYQ"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getSource")
    void rankTeams(String[] votes, String check) {
        String result = rankTeamsByVotes.rankTeams(votes);

        assertThat(result).isEqualTo(check);
    }
}
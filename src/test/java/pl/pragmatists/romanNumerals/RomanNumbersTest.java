package pl.pragmatists.romanNumerals;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class RomanNumbersTest {


    @Test
    public void testName() throws Exception {
        assertThat(romanNumbers().parse(1)).isEqualTo("I");
        assertThat(romanNumbers().parse(2)).isEqualTo("II");
        assertThat(romanNumbers().parse(3)).isEqualTo("III");
        assertThat(romanNumbers().parse(4)).isEqualTo("IV");
        assertThat(romanNumbers().parse(5)).isEqualTo("V");
        assertThat(romanNumbers().parse(6)).isEqualTo("VI");
        assertThat(romanNumbers().parse(7)).isEqualTo("VII");
        assertThat(romanNumbers().parse(8)).isEqualTo("VIII");
        assertThat(romanNumbers().parse(9)).isEqualTo("IX");
    }


    private RomanNumbers romanNumbers() {
        return new RomanNumbers();
    }


    private class RomanNumbers {

        Map<String, Integer> map = new LinkedHashMap<String, Integer>() {{
            put("X", 10);
            put("IX", 9);
            put("V", 5);
            put("IV", 4);
            put("I", 1);
        }};

        public String parse(Integer number) {
            String result = "";

            for (Map.Entry<String, Integer> romanTo : map.entrySet()) {
                Integer arabic = romanTo.getValue();
                String roman = romanTo.getKey();
                while (number >= arabic) {
                    result += roman;
                    number -= arabic;
                }
            }

            return result;
        }
    }
}

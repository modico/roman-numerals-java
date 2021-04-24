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

        public String parse3(Integer number) {
            String result = "";

            if (number == 1) {
                return "I";
            }
            if (number == 2) {
                return "II";
            }
            if (number == 3) {
                return "III";
            }

            return result;
        }

        public String parse3_loop(Integer number) {
            String result = "";

            while (number >= 1) {
                number -= 1;
                result += "I";
            }

            return result;
        }

        public String parse4(Integer number) {
            String result = "";

            if (number == 4) {
                result = "IV";
            } else {
                while (number >= 1) {
                    number -= 1;
                    result += "I";
                }
            }


            return result;
        }

        public String parse4_refactor(Integer number) {
            String result = "";

            if (number == 4) {
                number -= 4;
                result += "IV";
            }

            while (number >= 1) {
                number -= 1;
                result += "I";
            }

            return result;
        }

        public String parse4_refactor2(Integer number) {
            String result = "";

            while (number >= 4) {
                number -= 4;
                result += "IV";
            }

            while (number >= 1) {
                number -= 1;
                result += "I";
            }

            return result;
        }

        public String parse5_6_7_8(Integer number) {
            String result = "";

            while (number >= 5) {
                number -= 5;
                result += "V";
            }

            while (number >= 4) {
                number -= 4;
                result += "IV";
            }

            while (number >= 1) {
                number -= 1;
                result += "I";
            }

            return result;
        }


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

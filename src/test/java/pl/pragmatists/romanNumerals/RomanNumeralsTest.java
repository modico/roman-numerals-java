package pl.pragmatists.romanNumerals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanNumeralsTest {

    @Test
    public void return_I_for_1() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(14)).isEqualTo("XIV");
    }

    @Test
    public void return_V_for_5() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(5)).isEqualTo("V");
    }

    @Test
    public void return_X_for_10() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(10)).isEqualTo("X");
    }

    @Test
    public void return_III_for_3() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(3)).isEqualTo("III");
    }

    @Test
    public void return_VIII_for_8() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(8)).isEqualTo("VIII");
    }

    @Test
    public void return_IV_for_4() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(4)).isEqualTo("IV");
    }

    @Test
    public void return_IX_for_9() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(9)).isEqualTo("IX");
    }

    @Test
    public void return_XIX_for_19() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(19)).isEqualTo("XIX");
    }

    @Test
    public void return_L_for_50() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(50)).isEqualTo("L");
    }

    @Test
    public void return_XXXVIII_for_38() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(38)).isEqualTo("XXXVIII");
    }

    @Test
    public void return_XL_for_40() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(40)).isEqualTo("XL");
    }

    @Test
    public void return_XLIX_for_49() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(49)).isEqualTo("XLIX");
    }

    @Test
    public void return_LXXXVIII_for_88() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(88)).isEqualTo("LXXXVIII");
    }

    @Test
    public void return_XCIX_for_99() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(99)).isEqualTo("XCIX");
    }

    @Test
    public void return_CXLIX_for_149() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(149)).isEqualTo("CXLIX");
    }

    @Test
    public void return_CCXCIX_for_199() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(299)).isEqualTo("CCXCIX");
    }

    @Test
    public void return_CDXCIX_for_499() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(499)).isEqualTo("CDXCIX");
    }

    @Test
    public void return_DLXXXVIII_for_588() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(588)).isEqualTo("DLXXXVIII");
    }

    @Test
    public void return_CMXCIX_for_999() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(999)).isEqualTo("CMXCIX");
    }

    @Test
    public void return_MMCMXCIX_for_2999() throws NoRomanRepresentationException {
        assertThat(new RomanNumerals().get(2999)).isEqualTo("MMCMXCIX");
    }

    @Test
    public void throw_exception_when_number_has_no_roman_representation() {
        assertThrows(NoRomanRepresentationException.class, () -> new RomanNumerals().get(3456));
    }

}

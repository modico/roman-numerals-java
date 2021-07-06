package pl.pragmatists.romanNumerals;

public class RomanNumerals {

    public String get(int number) throws NoRomanRepresentationException {
        if (number < 1 || number > 3000) {
            throw new NoRomanRepresentationException();
        }
        StringBuilder romanNumeral = new StringBuilder();
        for (RomanNumeral numeral : RomanNumeral.values()) {
            romanNumeral.append(processNumbers(number, numeral));
            number = number % numeral.getMultiplier();
        }
        return romanNumeral.toString();
    }

    private String processNumbers(int number, RomanNumeral numeral) {
        StringBuilder romanNumeral = new StringBuilder();
        if (isNine(number, numeral)) {
            romanNumeral.append(numeral.getNines());
        } else if (isFive(number, numeral)) {
            romanNumeral.append(numeral.getFives());
        } else if (isFour(getModuloFive(number, numeral), numeral)) {
            romanNumeral.append(numeral.getFours());
        }
        for (int counter = 0; counter < getNumberOfUnits(number, numeral); counter++) {
            romanNumeral.append(numeral.getUnit());
        }
        return romanNumeral.toString();
    }

    private int getNumberOfUnits(int number, RomanNumeral numeral) {
        return isFour(getModuloFive(number, numeral), numeral) ? 0 : getModuloFive(number, numeral) / numeral.getMultiplier();
    }

    private boolean isFour(int number, RomanNumeral numeral) {
        return number / numeral.getMultiplier() == 4;
    }

    private int getModuloFive(int number, RomanNumeral numeral) {
        return number % (5 * numeral.getMultiplier());
    }

    private boolean isFive(int number, RomanNumeral numeral) {
        return number / (5 * numeral.getMultiplier()) == 1;
    }

    private boolean isNine(int number, RomanNumeral numeral) {
        return number / numeral.getMultiplier() == 9;
    }

}
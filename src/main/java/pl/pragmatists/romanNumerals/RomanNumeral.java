package pl.pragmatists.romanNumerals;

enum RomanNumeral {
    THOUSANDS(1000,"M","","",""),
    HUNDREDS(100,"C","CD","D","CM"),
    TENS(10,"X","XL","L","XC"),
    ONES(1,"I","IV","V","IX");

    private final int multiplier;
    private final String unit;
    private final String fours;
    private final String fives;
    private final String nines;

    RomanNumeral(int multiplier, String unit, String fours, String fives, String nines) {
        this.multiplier = multiplier;
        this.unit = unit;
        this.fours = fours;
        this.fives = fives;
        this.nines = nines;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public String getUnit() {
        return unit;
    }

    public String getFours() {
        return fours;
    }

    public String getFives() {
        return fives;
    }

    public String getNines() {
        return nines;
    }

}
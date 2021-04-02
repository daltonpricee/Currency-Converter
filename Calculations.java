public class Calculations {

    private double total;
    private String result;
    private double OGCur;
    private double newCur;
    private String usd = "US Dollars";
    private String yen = "Yen";
    private String euro = "Euros";
    private String peso = "Pesos";
    private String pound = "Pounds";
    private double enteredAmount;
    private double newAmount;

    /*
     * Do the conversions for usd
     * @param to the currency to convert to
     * @param amount the entered amount
     *
     */
    public double doConversionUS(String to, double amount) {
        switch (to) {
            case "Yen":
                total = 250.40 * amount;
                break;

            case "Euros":
                total =  0.85 * amount;
                break;

            case "Pesos":
                total =  20.29 * amount;
                break;

            case "Pounds":
               total =  0.6292 * amount;
        }
        return total;
     }

     /*
     * Do the conversions for yen
     * @param to the currency to convert to
     * @param amount the entered amount
     *
      */
    public double doConversionYen(String to, double amount) {
        switch (to) {
            case "US Dollars":
                total = 0.0040 * amount;
                break;

            case "Euros":
                total =  0.034 * amount;
                break;

            case "Pesos":
                total =  0.081 * amount;
                break;

            case "Pounds":
                total =  0.0029 * amount;
        }
        return total;
    }

    /*
     * Do the conversions for peso
     * @param to the currency to convert to
     * @param amount the entered amount
     *
     */
    public double doConversionPeso(String to, double amount) {
        switch (to) {
            case "Yen":
                total = 123.4 * amount;
                break;

            case "Euros":
                total =  0.042 * amount;
                break;

            case "US Dollars":
                total =  0.049 * amount;
                break;

            case "Pounds":
                total =  0.036 * amount;
        }
        return total;
    }

    /*
     * Do the conversions for Pound
     * @param to the currency to convert to
     * @param amount the entered amount
     *
     */
    public double doConversionPounds(String to, double amount) {
        switch (to) {
            case "Yen":
                total = 346.42 * amount;
                break;

            case "Euros":
                total =  1.17 * amount;
                break;

            case "Pesos":
                total =  28.07 * amount;
                break;

            case "US Dollars":
                total =  1.38 * amount;
        }
        return total;
    }

    /*
     * Do the conversions for Euro
     * @param to the currency to convert to
     * @param amount the entered amount
     *
     */
    public double doConversionEuro(String to, double amount) {
        switch (to) {
            case "Yen":
                total = 294.93 * amount;
                break;

            case "US Dollars":
                total =  1.18 * amount;
                break;

            case "Pesos":
                total =  23.9 * amount;
                break;

            case "Pounds":
                total =  0.85 * amount;
        }
        return total;

    }

}

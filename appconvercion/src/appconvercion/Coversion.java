package appconvercion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Coversion {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the amount to convert: ");
            double amount = Double.parseDouble(reader.readLine());

            String fromCurrency = currencyInputControl(reader, "Enter the currency to convert from (EUR, USD, GBP, JPY): ");
            String toCurrency = currencyInputControl(reader, "Enter the currency to convert to (EUR, USD, GBP, JPY): ");

            Double exchangeRate = getExchange(fromCurrency, toCurrency);

            if (exchangeRate != null) {
                double convertedAmount = amount * exchangeRate;
                System.out.printf("Converted amount: %.2f %s%n", convertedAmount, toCurrency);
            } else {
                System.out.println("Invalid currency or conversion error.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String currencyInputControl(BufferedReader reader, String promptMessage) throws IOException {
        String currency;
        String[] validCurrencies = {"EUR", "USD", "GBP", "JPY"};

        do {
            System.out.print(promptMessage);
            currency = reader.readLine().toUpperCase();
        } while (!isValidCurrency(currency, validCurrencies));

        return currency;
    }

    private static boolean isValidCurrency(String currency, String[] validCurrencies) {
        for (String validCurrency : validCurrencies) {
            if (validCurrency.equals(currency)) {
                return true;
            }
        }
        return false;
    }

    private static Double getExchange(String fromCurrency, String toCurrency) {
        try {
            String url = "https://currency-exchange.p.rapidapi.com/exchange?from=" + fromCurrency + "&to=" + toCurrency;
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-RapidAPI-Key", "e56cb3d176mshd9b8080b057c0cbp10f7b7jsn04af09923bdd");
            connection.setRequestProperty("X-RapidAPI-Host", "currency-exchange.p.rapidapi.com");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String response = reader.readLine();
                return Double.parseDouble(response);
            } else {
                System.err.println("Failed to retrieve exchange rate. HTTP Error: " + responseCode);
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

package services;
import org.json.JSONObject;
import services.cripto.BitCoin;
import services.cripto.DogeCoin;
import services.cripto.Ethereum;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Wallet {
    public static final int BITCOIN = 0;
    public static final int ETHEREUM = 1;
    public static final int DOGECOIN = 2;

    private Double euros;
    private Double bitCoins;
    private Double ethereum;
    private Double dogeCoin;

    private BitCoin bitCoinStatus;
    private DogeCoin dogeCoinStatus;
    private Ethereum ethereumStatus;

    public Wallet() {
        this.euros = 0.0;
        this.bitCoins = 0.0;
        this.ethereum = 0.0;
        this.dogeCoin = 0.0;
        this.bitCoinStatus = new BitCoin(0d);
        this.dogeCoinStatus = new DogeCoin(0d);
        this.ethereumStatus = new Ethereum(0d);
    }

    public void acturalizarPrecios(){
        String apiKey = "CG-juBzsHmvPRQcswip1fhbxdpc";
        String[] symbols = {"bitcoin", "ethereum", "dogecoin"};
        String auxSymbol = "";
        HttpClient client = HttpClient.newHttpClient();

        for (String symbol : symbols) {
            String url = "https://api.coingecko.com/api/v3/simple/price?ids=" + symbol + "&vs_currencies=usd";
            auxSymbol = symbol;
            HttpRequest request;
            try {
                request = HttpRequest.newBuilder(new URI(url))
                        .header("accept", "application/json")
                        .header("Authorization", "Bearer " + apiKey)
                        .build();
            } catch (URISyntaxException e) {
                System.err.println("URL mal formada: " + e.getMessage());
                return;
            }

            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == 200) {
                    JSONObject jsonResponse = new JSONObject(response.body());
                    JSONObject prices = jsonResponse.getJSONObject(symbol);
                    double priceUSD = prices.getDouble("usd");

                    System.out.println("El precio de " + symbol.toUpperCase() + " es: $" + priceUSD);
                    if (bitCoinStatus.getSymbol() == auxSymbol) {
                        bitCoinStatus.setPrice(priceUSD);
                    }else if (dogeCoinStatus.getSymbol() == auxSymbol) {
                        dogeCoinStatus.setPrice(priceUSD);
                    }else if (ethereumStatus.getSymbol() == auxSymbol) {
                        ethereumStatus.setPrice(priceUSD);
                    }else {
                        System.out.println("Algo raro pasa");
                    }
                } else {
                    System.err.println("Error al obtener el precio de " + symbol + ". Código de estado: " + response.statusCode());
                }
            } catch (IOException | InterruptedException e) {
                System.err.println("Error al enviar la solicitud: " + e.getMessage());
            }
        }
    }
    public void comprarCriptomoneda(int opcion, int shellNumber){
        switch (opcion){
            case BITCOIN:
                bitCoins = bitCoins + shellNumber;
                System.out.println("Has comprado"+shellNumber+" Bitcoins");
                break;
            case ETHEREUM:
                ethereum = ethereum + shellNumber;
                System.out.println("Has comprado"+shellNumber+" ethereum");
                break;
            case DOGECOIN:
                dogeCoin = dogeCoin + shellNumber;
                System.out.println("Has comprado"+shellNumber+" dogeCoin");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
    public Double precioTransaccion(int opcion){
        return switch (opcion) {
            case BITCOIN -> bitCoinStatus.getPrice();
            case ETHEREUM -> ethereumStatus.getPrice();
            case DOGECOIN -> dogeCoinStatus.getPrice();
            default -> null;
        };
    }
    public boolean aceptarTransaccion(Double precio, int opcion){
        if (precio < euros) {
            euros = euros - precio;
            comprarCriptomoneda(opcion, 1);
            return true;
        }else return false;
    }

    public Double getEuros() {
        return euros;
    }

    public void setEuros(Double euros) {
        this.euros = euros;
    }

    public Double getBitCoins() {
        return bitCoins;
    }

    public void setBitCoins(Double bitCoins) {
        this.bitCoins = bitCoins;
    }

    public Double getEthereum() {
        return ethereum;
    }

    public void setEthereum(Double ethereum) {
        this.ethereum = ethereum;
    }

    public Double getDogeCoin() {
        return dogeCoin;
    }

    public void setDogeCoin(Double dogeCoin) {
        this.dogeCoin = dogeCoin;
    }

    public BitCoin getBitCoinStatus() {
        return bitCoinStatus;
    }

    public void setBitCoinStatus(BitCoin bitCoinStatus) {
        this.bitCoinStatus = bitCoinStatus;
    }

    public DogeCoin getDogeCoinStatus() {
        return dogeCoinStatus;
    }

    public void setDogeCoinStatus(DogeCoin dogeCoinStatus) {
        this.dogeCoinStatus = dogeCoinStatus;
    }

    public Ethereum getEthereumStatus() {
        return ethereumStatus;
    }

    public void setEthereumStatus(Ethereum ethereumStatus) {
        this.ethereumStatus = ethereumStatus;
    }
}
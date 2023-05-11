package exceptions;

public class WrongCurrencyException extends Exception{
    private String currency;

    public WrongCurrencyException(String currency){
        super(currency);
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }
}

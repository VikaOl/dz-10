package exceptions;

public class WrongAccountException extends Exception {
    private String accountId;

    public WrongAccountException(String accountId) {
        super(accountId);
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }
}


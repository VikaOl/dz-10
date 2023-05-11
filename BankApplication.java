import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class BankApplication {

    private final List<Account> accounts = new ArrayList<>() {{
        add(new Account("accountId001", 100, "USD"));
        add(new Account("accountId002", 500, "EUR"));
        add(new Account("accountId003", 250, "HRV"));
        add(new Account("accountId004", 1000, "USD"));
        add(new Account("accountId005", 750, "USD"));
        add(new Account("accountId006", 50, "USD"));
    }};


    public void process(String accountId, int amount, String currency) throws WrongAccountException, WrongCurrencyException, WrongOperationException {

        accounts.stream().filter(account -> account.getId().equals(accountId))
                .findAny().orElseThrow(() -> new WrongAccountException("Provided account " + accountId + " does not exist in the system."));


        accounts.stream().filter(account -> account.getId().equals(accountId))
                .filter(account -> account.getCurrency().equals(currency))
                .findAny().orElseThrow(() -> new WrongCurrencyException("Provided currency " + currency + " is wrong. The account has a balance in another currency."));

        accounts.stream().filter(account -> account.getId().equals(accountId))
                .filter(account -> account.getCurrency().equals(currency))
                .filter(account -> account.getBalance() >= amount)
                .findAny().orElseThrow(() -> new WrongOperationException("Account does not have enough balance",amount));


        Account desiredAccount = accounts.stream()
                .filter(account -> account.getId().equals(accountId))
                .filter(account -> account.getCurrency().equals(currency))
                .filter(account -> account.getBalance() >= amount)
                .findAny()
                .orElseThrow(() -> new WrongOperationException("Account does not have enough balance",amount));

        int randomInt = new Random().nextInt(2);

        if (randomInt == 1) {
            throw new RuntimeException("Error during processing, try again");
        }

        desiredAccount.setBalance(desiredAccount.getBalance() - amount);
    }
}


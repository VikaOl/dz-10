import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

import java.io.FileNotFoundException;
import javax.annotation.processing.AbstractProcessor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws Exception {
        BankApplication bankApplication = new BankApplication();
        try {
            bankApplication.process("accountId000", 50, "USD");

        } catch (WrongAccountException wrongAccountException) {
            System.out.println(wrongAccountException.getAccountId());
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println(wrongCurrencyException.getMessage());
        } catch (WrongOperationException wrongOperationException) {
            System.out.println(wrongOperationException.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Thank you for using our service.");
        }
        try {
            bankApplication.process("accountId003", 250, "HRV");

        } catch (WrongAccountException wrongAccountException) {
            System.out.println(wrongAccountException.getAccountId());
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println(wrongCurrencyException.getMessage());
        } catch (WrongOperationException wrongOperationException) {
            System.out.println(wrongOperationException.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Thank you for using our service.");
        }
        try {
            bankApplication.process("accountId001", 50, "EUR");

        } catch (WrongAccountException wrongAccountException) {
            System.out.println(wrongAccountException.getAccountId());
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println(wrongCurrencyException.getMessage());
        } catch (WrongOperationException wrongOperationException) {
            System.out.println(wrongOperationException.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Thank you for using our service.");
        }
        try {
            bankApplication.process("accountId001", 50, "USD");

        } catch (WrongAccountException wrongAccountException) {
            System.out.println(wrongAccountException.getAccountId());
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println(wrongCurrencyException.getMessage());
        } catch (WrongOperationException wrongOperationException) {
            System.out.println(wrongOperationException.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Thank you for using our service.");
        }
        try {
            bankApplication.process("accountId001", 50, "USD");

        } catch (WrongAccountException wrongAccountException) {
            System.out.println(wrongAccountException.getAccountId());
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println(wrongCurrencyException.getMessage());
        } catch (WrongOperationException wrongOperationException) {
            System.out.println(wrongOperationException.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Thank you for using our service.");
        }
    }
}

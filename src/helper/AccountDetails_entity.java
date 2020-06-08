/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

/**
 *
 * @author Sumit Kumar
 */

    // getters & setters for 'AccountDetails' table
public class AccountDetails_entity {
    
    private String cardNo;
    private String pin;
    private String accountNo;
    private String accountType;
    private String name;
    private String accBalance;
    private String LastTransaction;
    private String transactionDate;

    public AccountDetails_entity() {
    }

    
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(String accBalance) {
        this.accBalance = accBalance;
    }
    
    public String getTransactionDate() {
        return transactionDate;
    }

    public String getLastTransaction() {
        return LastTransaction;
    }

    public void setLastTransaction(String LastTransaction) {
        this.LastTransaction = LastTransaction;
    }
    
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
    
}

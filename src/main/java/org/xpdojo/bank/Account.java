package org.xpdojo.bank;

public class Account {
    private int balance = 0;

    public int balance(){
        return balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void payment(int amount){
        balance -= amount;
    }

    public void transfer(int amount, Account transferMoneyTo){
        if (amount <= balance) {
            balance -= amount;
            transferMoneyTo.deposit(amount);
        }
    }
}

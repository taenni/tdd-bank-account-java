package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    @Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        assertThat("your first test").isBlank();
    }

    @Test
    public void newAccountShouldHaveZeroBalance(){
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositMultipleAmountsToIncreaseAndDecreaseTheBalance(){
        Account account = new Account();
        account.deposit(10);
        account.deposit(20);
        account.payment(10);
        assertThat(account.balance()).isEqualTo(20);
    }

    public void transferBetweenAccounts(){
        Account accountA = new Account();
        Account accountB = new Account();
        accountA.deposit(20);
        accountB.deposit(10);
        accountA.transfer(20, accountB);
        assertThat(accountA.balance()).isEqualTo(0);
    }
}



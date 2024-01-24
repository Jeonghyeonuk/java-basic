package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원 입금, 현재 잔액 : " + balance);
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액 부족, 잔고 : " + balance);
            return;
        }
        balance -= amount;
        System.out.println(amount + "원 출금, 현재 잔액 : " + balance);
    }
}

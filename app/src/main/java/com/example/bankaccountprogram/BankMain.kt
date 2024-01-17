package com.example.bankaccountprogram

fun main() {

    val tristanBankAccount = BankAccount(accountHolder = "Tristan Theart", balance = 1338.20)
    val sarahBankAccount = BankAccount(accountHolder = "Sarah", balance = 0.0)

    tristanBankAccount.deposit(amount = 200.00)
    tristanBankAccount.withdraw(amount = 1200.00)
    tristanBankAccount.deposit(amount = 3000.00)
    tristanBankAccount.deposit(amount = 2000.00)
    tristanBankAccount.withdraw(amount = 3333.15)

    tristanBankAccount.displayTransactionHistory()
    println("${tristanBankAccount.accountHolder}'s balance is ${tristanBankAccount.acctBalance()}")
    println()


    sarahBankAccount.deposit(amount = 100.00)
    sarahBankAccount.withdraw(amount = 10.00)
    sarahBankAccount.deposit(amount = 300.00)

    sarahBankAccount.displayTransactionHistory()
    println("${sarahBankAccount.accountHolder}'s balance is ${sarahBankAccount.acctBalance()}")
    println()
}
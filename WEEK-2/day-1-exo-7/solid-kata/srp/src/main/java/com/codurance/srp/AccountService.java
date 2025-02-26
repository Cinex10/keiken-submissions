package com.codurance.srp;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.stream.Collectors.toCollection;

public class AccountService {



    private TransactionRepository transactionRepository;
    private Clock clock;
    Presenter presenter;

    public AccountService(TransactionRepository transactionRepository, Clock clock, Presenter presenter) {
        this.transactionRepository = transactionRepository;
        this.clock = clock;
        this.presenter = presenter;
    }

    public void deposit(int amount) {
        transactionRepository.add(transactionWith(amount));
    }


    public void withdraw(int amount) {
        transactionRepository.add(transactionWith(-amount));
    }


    private Transaction transactionWith(int amount) {
        return new Transaction(clock.today(), amount);
    }

    List<Transaction> getTransactions() {
        return transactionRepository.all();
    }

}
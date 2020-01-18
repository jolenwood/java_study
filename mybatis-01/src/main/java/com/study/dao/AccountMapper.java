package com.study.dao;

import com.study.pojo.Account;

import java.util.List;

public interface AccountMapper {

    List<Account> getAccounts();

    Account getAccount(int id);

    void insertAccount(Account account);

    void deleteAccount(int id);

    void updateAccount(Account account);

}

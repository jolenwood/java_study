package com.study.dao;

import com.study.pojo.Account;

import java.util.List;

public interface AccountMapper {

    List<Account> getAccounts();

    Account getAccount(int id);
    //test git

}

package com.study.dao;

import com.study.pojo.Account;

import java.util.List;
import java.util.Map;

public interface AccountMapper {

    List<Account> getAccounts();

    Account getAccount(int id);

    void insertAccount(Account account);

    void deleteAccount(int id);

    void updateAccount(Account account);

    //使用map来传递参数

    void addAccount(Map<String,Object> map);

}

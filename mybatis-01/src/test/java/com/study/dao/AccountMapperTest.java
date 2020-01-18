package com.study.dao;

import com.study.pojo.Account;
import com.study.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountMapperTest {

    @Test
    public void getAccounts(){
        // 第1步：获取sqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //方式一：
        // 第2步：获取mapper实现对象 调用接口实现方法
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> accounts = mapper.getAccounts();

        //方式二：
        //List<Account> accounts = sqlSession.selectList("com.study.dao.AccountMapper.getAccounts");

        // 第3步：打印结果
        for (Account account : accounts) {
            System.out.println(account.toString());
        }

        sqlSession.close();

    }

    @Test
    public void getAccount(){
        // 第1步：获取sqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //方式一：
        // 第2步：获取mapper实现对象 调用接口实现方法
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        Account account = mapper.getAccount(1);

        System.out.println(account);

        sqlSession.close();

    }

    @Test
    public void insertAccount(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);

        Account account = new Account(4,"Hello","pwd");

        mapper.insertAccount(account);

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void updateAccount(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);

        Account account = new Account(4,"HHH","123456");

        mapper.updateAccount(account);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteAccount(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);

        mapper.deleteAccount(4);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void addAccount(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("account_id",5);
        map.put("account_name","WWW");
        map.put("account_pwd","123456");

        mapper.addAccount(map);

        sqlSession.commit();
        sqlSession.close();

    }

}

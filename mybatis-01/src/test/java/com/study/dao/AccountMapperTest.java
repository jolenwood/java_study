package com.study.dao;

import com.study.pojo.Account;
import com.study.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

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
}

package com.vlluvia.mapper;

import com.vlluvia.domain.Account;

import java.util.List;

public interface AccountMapper {

    public void save(Account account);

    public List<Account> findAll();

}

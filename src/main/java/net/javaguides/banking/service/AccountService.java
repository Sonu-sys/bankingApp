package net.javaguides.banking.service;

import net.javaguides.banking.dto.AccountDTO;
import net.javaguides.banking.entity.Account;

import java.util.List;

public interface AccountService {
    AccountDTO createAccount(AccountDTO accountDto);
    AccountDTO getAccountById(Long id);
    AccountDTO depositAmount(Long id,double balance);
    AccountDTO withdrawAmount(Long id,double balance);
    List<AccountDTO> getAllAccounts();
    void deleteAccountById(Long id);


}


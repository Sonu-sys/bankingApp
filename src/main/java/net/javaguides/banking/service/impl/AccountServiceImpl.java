package net.javaguides.banking.service.impl;

import net.javaguides.banking.dto.AccountDTO;
import net.javaguides.banking.entity.Account;
import net.javaguides.banking.mapper.AccountMapper;
import net.javaguides.banking.repository.AccountRepository;
import net.javaguides.banking.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


@Override

    public AccountDTO createAccount(AccountDTO accountDto) {
        Account account = AccountMapper.maptoAccount(accountDto);
        Account newAccount =accountRepository.save(account);
        return AccountMapper.maptoAccountDto(newAccount);




    }

    @Override
    public AccountDTO getAccountById(Long id) {
        Account account =accountRepository.findAllById(id).orElseThrow(()=> new RuntimeException("Account does not exits"));

        return AccountMapper.maptoAccountDto(account);
    }

    @Override
    public AccountDTO depositAmount(Long id, double balance) {
        Account account =accountRepository.findAllById(id);
       double total= account.getBalance()+balance;
       account.setBalance(total);
        Account SaveAccount=  accountRepository.save(account);


        return AccountMapper.maptoAccountDto(SaveAccount);
    }

    @Override
    public AccountDTO withdrawAmount(Long id, double balance) {
        Account account =accountRepository.findAllById(id);
        if (account.getBalance()<balance){
            throw new RuntimeException("insufficent amount");
            double total=account.getBalance()-balance;
            account.setBalance(total);
            Account SaveAccount=  accountRepository.save(account);


            return AccountMapper.maptoAccountDto(SaveAccount);

        }
    }

    @Override
    public List<AccountDTO> getAllAccounts() {
        List<Account> accounts =accountRepository.findAll();
        return accounts.stream().map((accounts)=>AccountMapper.maptoAccountDto(accounts)).collect(Collectors.toList());
    }

    @Override
    public void deleteAccountById(Long id) {
        Account account =accountRepository.findAllById(id);
         accountRepository.deleteById(id);


    }
}

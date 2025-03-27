package net.javaguides.banking.mapper;

import net.javaguides.banking.dto.AccountDTO;
import net.javaguides.banking.entity.Account;

public class AccountMapper {
    public static Account maptoAccount(AccountDTO accountDTO)
    {
        return new Account(
                accountDTO.getId(),
                accountDTO.getAccounHolderName(),
                accountDTO.getBalance()
        );
    }
    public static AccountDTO maptoAccountDto(Account account)
    {
        return new AccountDTO(

                        account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
                );
    }
}

package net.javaguides.banking.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.javaguides.banking.dto.AccountDTO;
import net.javaguides.banking.entity.Account;
import net.javaguides.banking.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }



    @PutMapping
    public ResponseEntity<AccountDTO> createAccount(@RequestBody AccountDTO accountDTO)
    {
        return new ResponseEntity<>(accountService.createAccount(accountDTO), HttpStatus.CREATED);
    }
    @GetMapping("/id")
    public ResponseEntity<AccountDTO> getAccountById(@PathVariable Long id)
    {
        AccountDTO accountDTO=accountService.getAccountById(id);
        return ResponseEntity.ok(accountDTO);
    }
    @PutMapping
    public ResponseEntity<AccountDTO> addbalance(@PathVariable Long id,Map<String, double> request)
    {
        AccountDTO accountDTO=accountService.depositAmount(id,request.get("amount"));
        return ResponseEntity.ok(accountDTO);
    }
    @PutMapping
    public ResponseEntity<AccountDTO> addbalance(@PathVariable Long id,Map<String, double> request)
    {
        AccountDTO accountDTO=accountService.withdrawAmount(id,request.get("amount"));
        return ResponseEntity.ok(accountDTO);
    }
    @GetMapping()
    public ResponseEntity<List<AccountDTO>> getAllAccounts()
    {
        List<AccountDTO> accountDTOS=accountService.getAllAccounts();
        return ResponseEntity.ok(accountDTOS);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAccount(@pathVaribale Long id)
    {
        accountService.deleteAccountById(id);
        return ResponseEntity.ok("Account is deleted");
    }

}

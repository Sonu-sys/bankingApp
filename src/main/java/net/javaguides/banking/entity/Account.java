package net.javaguides.banking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="accounts")
public class Account {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
   @Column(name="account_holder_name")
    private String accountHolderName;
    private double balance;

}

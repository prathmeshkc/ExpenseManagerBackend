package com.pcdev.expensemanagerbackend.model.transaction.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {

    private String title;
    private Double amount;
    private String transactionType;
    private String category;
    private String transactionDate;
    private String note;

}

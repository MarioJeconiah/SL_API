package com.laundry.service;

import com.laundry.dto.response.TransactionResponse;

import java.time.LocalDate;
import java.util.List;

public interface BusinessService {
    List<TransactionResponse> getAllTransactions();
    TransactionResponse editTransactionPickUp(Long id, LocalDate pickupDate);
    TransactionResponse getTotalRevenue();
}

package com.laundry.service;

import com.laundry.dto.request.TransactionRequest;
import com.laundry.dto.response.TransactionResponse;

public interface TransactionService {
    TransactionResponse getTransactionById(Long id);
    TransactionResponse createTransaction(TransactionRequest request);
}

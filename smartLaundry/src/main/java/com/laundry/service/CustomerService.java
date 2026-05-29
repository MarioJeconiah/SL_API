package com.laundry.service;

import com.laundry.dto.request.CustomerRequest;
import com.laundry.dto.response.CustomerResponse;

import java.util.List;

public interface CustomerService {
    List<CustomerResponse> getAllCustomers();
    CustomerResponse getCustomerById(Long id);
    CustomerResponse addCustomer(CustomerRequest request);
    CustomerResponse editCustomerName(Long id, String name);
    CustomerResponse editCustomerPhone(Long id, String phone);
    CustomerResponse editCustomerAdress(Long id, String adress);
    CustomerResponse deleteCustomer(Long id);
}

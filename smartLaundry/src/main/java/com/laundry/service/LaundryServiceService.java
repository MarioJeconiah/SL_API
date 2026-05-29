package com.laundry.service;

import com.laundry.dto.request.LaundryServiceRequest;
import com.laundry.dto.response.LaundryServiceResponse;

import java.util.List;

public interface LaundryServiceService {
    List<LaundryServiceResponse> getAllServices();
    LaundryServiceResponse getLaundryServiceById(Long id);
    LaundryServiceResponse createService(LaundryServiceRequest request);
}

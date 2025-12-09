package com.myfinbank.admin.feign;


import com.myfinbank.admin.dto.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "CUSTOMER-MICROSERVICE")
public interface CustomerClient {

    @GetMapping("/api/customers")
    List<CustomerDto> getAllCustomers();

    @GetMapping("/api/customers/{id}")
    CustomerDto getCustomerById(@PathVariable("id") Long id);

    @PutMapping("/api/customers/{id}")
    CustomerDto updateCustomer(@PathVariable("id") Long id, @RequestBody CustomerDto dto);

    @PutMapping("/api/customers/{id}/deactivate")
    CustomerDto deactivateCustomer(@PathVariable("id") Long id);

    @PutMapping("/api/customers/{id}/activate")
    CustomerDto activateCustomer(@PathVariable("id") Long id);
}

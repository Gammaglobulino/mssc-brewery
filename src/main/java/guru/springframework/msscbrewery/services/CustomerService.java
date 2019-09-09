package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    void updateCustomer(UUID customerId, CustomerDto customerDto);
    CustomerDto getCustomerById(UUID customerId);
    CustomerDto saveNewCustomer(CustomerDto customerDto);
    void deleteById(UUID customerId);
}

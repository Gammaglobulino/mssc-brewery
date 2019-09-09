package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        // TODO - implement the logic for updating and save a customer
    }

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                                    .Name("Andrea Mazzanti")
                                    .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().
                id(UUID.randomUUID()).
                build();
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting customer...");
    }

}

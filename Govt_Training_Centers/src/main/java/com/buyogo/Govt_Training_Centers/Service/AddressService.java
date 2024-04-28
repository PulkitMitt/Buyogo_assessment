package com.buyogo.Govt_Training_Centers.Service;

import com.buyogo.Govt_Training_Centers.Model.Address;
import com.buyogo.Govt_Training_Centers.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;
    public void saveAddress(Address address) {
        iAddressRepo.save(address);
    }
}

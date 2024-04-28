package com.buyogo.Govt_Training_Centers.Repository;

import com.buyogo.Govt_Training_Centers.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Integer> {

}

package com.buyogo.Govt_Training_Centers.Service;

import com.buyogo.Govt_Training_Centers.Model.Address;
import com.buyogo.Govt_Training_Centers.Model.TrainingCenter;
import com.buyogo.Govt_Training_Centers.Repository.IAddressRepo;
import com.buyogo.Govt_Training_Centers.Repository.ITrainingCenterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TrainingCenterService {

    @Autowired
    AddressService addressService;

    @Autowired
    ITrainingCenterRepo iTrainingCenterRepo;

    public TrainingCenter SignUpTrainingCenter(TrainingCenter trainingCenter) {
        Address address = trainingCenter.getAddress();
        addressService.saveAddress(address);

        // This will set object's LocalDateTime attribute as system's current Local Date Time
        trainingCenter.setCreatedOn(LocalDateTime.now().toString());
        return iTrainingCenterRepo.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return iTrainingCenterRepo.findAll();
    }
}

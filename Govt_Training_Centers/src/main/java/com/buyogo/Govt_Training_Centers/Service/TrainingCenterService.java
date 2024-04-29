package com.buyogo.Govt_Training_Centers.Service;

import com.buyogo.Govt_Training_Centers.Exceptions.ContactNoValidationException;
import com.buyogo.Govt_Training_Centers.Exceptions.EmailValidationException;
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

    public void validateEmail(String email) {
        // Perform email validation logic
        if (!isValidEmail(email)) {
            try{
                throw new EmailValidationException("Invalid email address: " + email);
            }
            catch (EmailValidationException e){
                System.out.println(e);
            }
        }
    }
    private boolean isValidEmail(String email) {
        // Your email validation logic here
        // You can use regex, third-party libraries, or other methods to validate email
        return email.matches(".*@gmail\\.com$");
    }

    public void validateContactNo(String contactNo) {
        // Perform contactNo validation logic
        if (!isValidContactNo(contactNo)) {
            try{
                throw new ContactNoValidationException("contact number should be of 10 digits");
            }
            catch (ContactNoValidationException e){
                System.out.println(e);
            }
        }
    }
    private boolean isValidContactNo(String contactNo) {
        // Your contact number validation logic here
        // You can use regex, third-party libraries, or other methods to validate contact number
        return contactNo.matches("^\\d{10}$");
    }
}

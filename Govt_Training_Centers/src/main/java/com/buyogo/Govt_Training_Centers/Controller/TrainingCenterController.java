package com.buyogo.Govt_Training_Centers.Controller;

import com.buyogo.Govt_Training_Centers.Model.TrainingCenter;
import com.buyogo.Govt_Training_Centers.Service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@Validated
@RestController
public class TrainingCenterController {

    @Autowired
    TrainingCenterService trainingCenterService;

    // A Post API to add a newly created training center into the database
    @PostMapping("trainingCenter/signup")
    public TrainingCenter SignUpTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter){
        return trainingCenterService.SignUpTrainingCenter(trainingCenter);
    }

    @GetMapping("training_centers")
    public List<TrainingCenter> getAllTrainingCenters(){
        return trainingCenterService.getAllTrainingCenters();
    }

}

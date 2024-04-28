package com.buyogo.Govt_Training_Centers.Repository;

import com.buyogo.Govt_Training_Centers.Model.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrainingCenterRepo extends JpaRepository<TrainingCenter, Integer> {

}

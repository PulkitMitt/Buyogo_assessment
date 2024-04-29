package com.buyogo.Govt_Training_Centers.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TrainingCenter {

    private String CenterName;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer CenterCode;

    private Integer studentCapacity;
    private List<String> coursesOffered;
    private String createdOn ;

    @Pattern(regexp = ".*@gmail\\.com$")
    @Email(message = "Invalid email address")
    private String contactEmail;

    @Pattern(regexp = "^\\d{10}$")
    private String contactNumber;

    @OneToOne
    @JoinColumn(name = "fk_address_id")
    private Address address;

    public void setCreatedOn(String createdOn) {
        this.createdOn = LocalDateTime.now().toString();

    }

    @Override
    public String toString() {
        return "TrainingCenter{" +
                "CenterName='" + CenterName + '\'' +
                ", CenterCode='" + CenterCode + '\'' +
                ", studentCapacity=" + studentCapacity +
                ", coursesOffered=" + coursesOffered +
                ", createdOn=" + createdOn +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactPhone='" + contactNumber + '\'' +
                ", address=" + address +
                '}';
    }
}

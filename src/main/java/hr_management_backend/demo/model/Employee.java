package hr_management_backend.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    private Long id;
    private String name;
    private String position;
    private Double salary;


}

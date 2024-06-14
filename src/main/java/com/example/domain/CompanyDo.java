package com.example.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Company")
@NoArgsConstructor
public class CompanyDo {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
   
   private String companyName;
   
   private String comanyCode;
   
   private int noOfEmployees;
   
    @OneToMany(targetEntity = Employee.class,cascade = CascadeType.ALL)
    @JoinColumn(name="company_fk",referencedColumnName = "id")
    private List<Employee> employee;
}

package com.onetomany.unidirectional.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class University {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String universityName;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "university_Id",referencedColumnName = "id")
  private List<Student> students;
  
  
}



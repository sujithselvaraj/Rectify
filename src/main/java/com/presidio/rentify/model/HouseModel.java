package com.presidio.rentify.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "house_model")
public class HouseModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String place;
    private String bedrooms;
    private String aminities;
    private String area;
    private String rent;
    private LocalDateTime time;
    private String contactNo;
    private String ownerName;
}

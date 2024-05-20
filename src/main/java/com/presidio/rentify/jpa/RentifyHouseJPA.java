package com.presidio.rentify.jpa;

import com.presidio.rentify.model.HouseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentifyHouseJPA extends JpaRepository<HouseModel,Long>
{

}

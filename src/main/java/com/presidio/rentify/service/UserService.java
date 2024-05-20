package com.presidio.rentify.service;


import com.presidio.rentify.jpa.RentifyHouseJPA;
import com.presidio.rentify.jpa.RentifyUserJPA;
import com.presidio.rentify.model.HouseModel;
import com.presidio.rentify.model.UserModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService
{
    private RentifyUserJPA rentifyUserJPA;
    private RentifyHouseJPA rentifyHouseJPA;

    public UserModel saveUser(UserModel userModel)
    {
        return rentifyUserJPA.save(userModel);
    }

    public HouseModel savehouse(HouseModel houseModel)
    {
        return rentifyHouseJPA.save(houseModel);
    }

    public List<HouseModel> viewHouses()
    {
        return  rentifyHouseJPA.findAll();
    }




}

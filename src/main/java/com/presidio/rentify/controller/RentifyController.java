package com.presidio.rentify.controller;


import com.presidio.rentify.model.ApiResponse;
import com.presidio.rentify.model.HouseModel;
import com.presidio.rentify.model.UserModel;
import com.presidio.rentify.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@AllArgsConstructor
public class RentifyController
{
    private UserService userService;

    @PostMapping("/adduser")
    public ResponseEntity<ApiResponse<String>> createUser(@RequestBody UserModel userModel)
    {
        UserModel userModel1 = userService.saveUser(userModel);
        ApiResponse<String> response = new ApiResponse<>("success", "User Created Successfully", null);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


    @PostMapping("/v1/addhouse")
    public ResponseEntity<ApiResponse<String>> createHouse(@RequestBody HouseModel houseModel)
    {
        HouseModel houseModel1 = userService.savehouse(houseModel);
        ApiResponse<String> response = new ApiResponse<>("success", "House Added Successfully", null);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/v1/houses")
    public ResponseEntity<ApiResponse<String>> viewHouses()
    {
        HouseModel houseModel1 = (HouseModel) userService.viewHouses();
        ApiResponse<String> response = new ApiResponse("success", "House Added Successfully", houseModel1);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/v1/houses/{Id}")
    public ResponseEntity<ApiResponse<String>> viewHousesById(@PathVariable Long Id)
    {
        Optional<HouseModel> houseModel1 =  userService.viewHousesById(Id);
        ApiResponse<String> response = new ApiResponse("success", "House fetched Successfully", houseModel1);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }




}

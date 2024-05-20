package com.presidio.rentify.controller;


import com.presidio.rentify.model.ApiResponse;
import com.presidio.rentify.model.HouseModel;
import com.presidio.rentify.model.UserModel;
import com.presidio.rentify.service.UserService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class RentifyController
{
    private UserService userService;

    @PostMapping("/v1/adduser")
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
        ApiResponse<String> response = new ApiResponse<>("success", "House Added Successfully", null);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/v1/houses/{id}")
    public ResponseEntity<ApiResponse<String>> viewHousesByParam(@PathParam(@Value("id")))
    {
        HouseModel houseModel1 = (HouseModel) userService.viewHouses();
        ApiResponse<String> response = new ApiResponse<>("success", "House Added Successfully", null);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/v1/houses")
    public ResponseEntity<ApiResponse<String>> viewHousesByParam(@RequestParam(@Query("id")))
    {
        HouseModel houseModel1 = (HouseModel) userService.viewHouses();
        ApiResponse<String> response = new ApiResponse<>("success", "House Added Successfully", null);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}

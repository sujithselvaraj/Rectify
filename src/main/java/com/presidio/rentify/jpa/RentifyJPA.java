package com.presidio.rentify.jpa;

import com.presidio.rentify.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentifyJPA extends JpaRepository<UserModel,String>
{

}

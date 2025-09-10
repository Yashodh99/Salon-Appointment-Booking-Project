package com.yashodh.service;

import com.yashodh.dto.SalonDTO;
import com.yashodh.dto.UserDTO;
import com.yashodh.model.Salon;

public interface SalonService {

    Salon createSalon(SalonDTO salon, UserDTO user);




}

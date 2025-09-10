package com.yashodh.service;

import com.yashodh.dto.SalonDTO;
import com.yashodh.dto.UserDTO;
import com.yashodh.model.Salon;

import java.util.List;

public interface SalonService {

    Salon createSalon(SalonDTO salon, UserDTO user);

    Salon updateSalon(SalonDTO salon,UserDTO user, Long salonId);

    List<Salon> getAllSalons();

    Salon getSalonById(Long salonId) throws Exception;

    Salon getSalonByOwnerId(Long ownerId);

    List<Salon> searchSalonByCity(String city);






}

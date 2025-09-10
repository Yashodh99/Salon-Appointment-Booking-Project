package com.yashodh.mapper;

import com.yashodh.dto.SalonDTO;
import com.yashodh.model.Salon;

public class SalonMapper {


    public static SalonDTO mapToDTO(Salon salon){

        SalonDTO salonDTO = new SalonDTO();
        salonDTO.setId(salon.getId());

        salonDTO.setName(salon.getName());
        salonDTO.setAddress(salonDTO.getAddress());
        salon.setEmail(salonDTO.getEmail());
        salon.setCity(salonDTO.getCity());
        salon.setImages(salonDTO.getImages());
        salon.setOwnerId(salonDTO.getOwnerId());
        salon.setOpenTime(salonDTO.getOpenTime());
        salon.setCloseTime(salonDTO.getCloseTime());
        salon.setPhoneNumber(salonDTO.getPhoneNumber());
        return salonDTO;
    }
}

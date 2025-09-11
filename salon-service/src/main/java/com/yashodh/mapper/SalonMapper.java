package com.yashodh.mapper;

import com.yashodh.dto.SalonDTO;
import com.yashodh.model.Salon;

public class SalonMapper {


    public static SalonDTO mapToDTO(Salon salon){

        SalonDTO salonDTO = new SalonDTO();
        salonDTO.setId(salon.getId());

        salonDTO.setName(salon.getName());
        salonDTO.setAddress(salon.getAddress());
        salonDTO.setEmail(salon.getEmail());
        salonDTO.setCity(salon.getCity());
        salonDTO.setImages(salon.getImages());
        salonDTO.setOwnerId(salon.getOwnerId());
        salonDTO.setOpenTime(salon.getOpenTime());
        salonDTO.setCloseTime(salon.getCloseTime());
        salonDTO.setPhoneNumber(salon.getPhoneNumber());
        return salonDTO;
    }
}

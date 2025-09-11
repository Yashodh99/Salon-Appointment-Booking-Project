package com.yashodh.service.impl;


import com.yashodh.dto.SalonDTO;
import com.yashodh.dto.UserDTO;
import com.yashodh.model.Salon;
import com.yashodh.repository.SalonRepository;
import com.yashodh.service.SalonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SalonServiceImpl implements SalonService {


    private final SalonRepository salonRepository;

    @Override
    public Salon createSalon(SalonDTO req, UserDTO user) {
        Salon salon = new Salon();
        salon.setName(req.getName());
        salon.setAddress(req.getAddress());
        salon.setEmail(req.getEmail());
        salon.setCity(req.getCity());
        salon.setImages(req.getImages());
        salon.setOwnerId(req.getOwnerId());
        salon.setOpenTime(req.getOpenTime());
        salon.setCloseTime(req.getCloseTime());
        salon.setPhoneNumber(req.getPhoneNumber());


        return salonRepository.save(salon);
    }

    @Override
    public Salon updateSalon(SalonDTO salon, UserDTO user, Long salonId) throws Exception {

        Salon existingSalon = salonRepository.findById(salonId).orElse(null);

        if (existingSalon == null) {
            throw new Exception("Salon does not exist");
        }

        // Check if logged-in user is the owner
        if (!existingSalon.getOwnerId().equals(user.getId())) {
            throw new Exception("You don't have permission to update this salon");
        }

        existingSalon.setName(salon.getName());
        existingSalon.setAddress(salon.getAddress());
        existingSalon.setEmail(salon.getEmail());
        existingSalon.setCity(salon.getCity());
        existingSalon.setImages(salon.getImages());
        existingSalon.setOpenTime(salon.getOpenTime());
        existingSalon.setCloseTime(salon.getCloseTime());
        existingSalon.setPhoneNumber(salon.getPhoneNumber());

        return salonRepository.save(existingSalon);
    }




    @Override
    public List<Salon> getAllSalons() {
        return salonRepository.findAll();

    }

    @Override
    public Salon getSalonById(Long salonId) throws Exception {
        Salon salon = salonRepository.findById(salonId).orElse((null));
        if(salon == null){
            throw new Exception("salon not exist");
        }
        return salon;
    }

    @Override
    public Salon getSalonByOwnerId(Long ownerId) {
        return salonRepository.findByOwnerId(ownerId);
    }

    @Override
    public List<Salon> searchSalonByCity(String city) {
        return salonRepository.searchSalons(city);
    }
}

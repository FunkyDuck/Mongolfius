package com.loicjacques.mongolfius.mapper;

import com.loicjacques.mongolfius.models.dto.BalloonDTO;
import com.loicjacques.mongolfius.models.entity.Balloon;
import org.springframework.stereotype.Service;

@Service
public class BalloonMapper {
    public BalloonDTO toDto(Balloon entity){
        if(entity==null){
            return null;
        }

        BalloonDTO dto = new BalloonDTO();
        dto.setId(entity.getId());
        dto.setRegistration(entity.getRegistration());
        dto.setReleaseDate(entity.getReleaseDate());
        dto.setPlaces(entity.getPlaces());

        return dto;
    }
}

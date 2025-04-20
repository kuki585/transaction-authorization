package com.poc.transaction_authorization.mappers.impl

import com.poc.transaction_authorization.dtos.StationDTO
import com.poc.transaction_authorization.entities.Station
import com.poc.transaction_authorization.mappers.StationMapper
import org.springframework.stereotype.Component

@Component
class StationMapperImpl : StationMapper {

    override fun mapToEntity(stationDTO: StationDTO): Station {
        return Station(
            stationId =  stationDTO.stationId,
            stationName = stationDTO.stationName
        )
    }

    override fun mapToDTO(station: Station): StationDTO {
        return StationDTO(
            stationId =  station.stationId,
            stationName = station.stationName
        )
    }
}
package com.poc.transaction_authorization.mappers.impl

import com.poc.transaction_authorization.dtos.DriverStationAssociationDTO
import com.poc.transaction_authorization.entities.DriverStationAssociation
import com.poc.transaction_authorization.mappers.DriverStationMapper
import org.springframework.stereotype.Component

@Component
class DriverStationMapperImpl : DriverStationMapper {

    override fun mapToEntity(driverStationDTO: DriverStationAssociationDTO): DriverStationAssociation {
        return DriverStationAssociation(
            associationId =  driverStationDTO.associationId,
            driverId = driverStationDTO.driverId,
            stationId = driverStationDTO.stationId
        )
    }

    override fun mapToDTO(driverStation: DriverStationAssociation): DriverStationAssociationDTO {
        return DriverStationAssociationDTO(
            associationId =  driverStation.associationId,
            driverId = driverStation.driverId,
            stationId = driverStation.stationId
        )
    }
}
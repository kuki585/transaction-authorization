package com.poc.transaction_authorization.mappers

import com.poc.transaction_authorization.dtos.DriverStationAssociationDTO
import com.poc.transaction_authorization.entities.DriverStationAssociation

interface DriverStationMapper {

    fun mapToEntity(driverStationDTO: DriverStationAssociationDTO) : DriverStationAssociation

    fun mapToDTO(driverStation: DriverStationAssociation) : DriverStationAssociationDTO
}
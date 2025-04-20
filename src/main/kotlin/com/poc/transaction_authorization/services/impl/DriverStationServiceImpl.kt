package com.poc.transaction_authorization.services.impl

import com.poc.transaction_authorization.dtos.DriverStationAssociationDTO
import com.poc.transaction_authorization.entities.DriverStationAssociation
import com.poc.transaction_authorization.mappers.DriverStationMapper
import com.poc.transaction_authorization.repositories.DriverStationAssociationRepo
import com.poc.transaction_authorization.services.DriverStationService
import org.springframework.stereotype.Service

@Service
class DriverStationServiceImpl(
    private val driverStationAssociationRepo : DriverStationAssociationRepo,
    private val driverStationMapper : DriverStationMapper
) : DriverStationService {

    override fun registerDriverStation(driverStationDTO: DriverStationAssociationDTO) {
        val driverStationAssociation : DriverStationAssociation =
            driverStationMapper.mapToEntity(driverStationDTO)
        driverStationAssociationRepo.save<DriverStationAssociation>(driverStationAssociation)
    }

    override fun updateDriverStation(driverStationDTO: DriverStationAssociationDTO) {
        val driverStationAssociation : DriverStationAssociation =
            driverStationMapper.mapToEntity(driverStationDTO)
        driverStationAssociationRepo.save<DriverStationAssociation>(driverStationAssociation)
    }

    override fun unregisterDriverStation(associationId: String) {
        driverStationAssociationRepo.deleteById(associationId)
    }

    override fun fetchDriverStation(associationId: String): DriverStationAssociationDTO {
        val driverStationAssociation : DriverStationAssociation =
            driverStationAssociationRepo.getReferenceById(associationId)
        return driverStationMapper.mapToDTO(driverStationAssociation)

    }
}

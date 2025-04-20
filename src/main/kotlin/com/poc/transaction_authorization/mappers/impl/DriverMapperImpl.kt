package com.poc.transaction_authorization.mappers.impl

import com.poc.transaction_authorization.dtos.DriverDTO
import com.poc.transaction_authorization.entities.Driver
import com.poc.transaction_authorization.mappers.DriverMapper
import org.springframework.stereotype.Component

@Component
class DriverMapperImpl : DriverMapper {

    override fun mapToEntity(driverDTO: DriverDTO): Driver {
        return Driver(
            driverId =  driverDTO.driverId,
            driverName = driverDTO.driverName,
            chargingAllowed = driverDTO.chargingAllowed
        )
    }

    override fun mapToDTO(driver: Driver): DriverDTO {
        return DriverDTO(
            driverId =  driver.driverId,
            driverName = driver.driverName,
            chargingAllowed = driver.chargingAllowed
        )
    }
}
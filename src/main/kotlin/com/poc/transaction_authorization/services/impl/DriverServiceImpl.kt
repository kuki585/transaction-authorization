package com.poc.transaction_authorization.services.impl

import com.poc.transaction_authorization.dtos.DriverDTO
import com.poc.transaction_authorization.entities.Driver
import com.poc.transaction_authorization.mappers.DriverMapper
import com.poc.transaction_authorization.repositories.DriverRepository
import com.poc.transaction_authorization.services.DriverService
import org.springframework.stereotype.Service

@Service
class DriverServiceImpl(
    private val driverRepository : DriverRepository,
    private val driverMapper : DriverMapper
) : DriverService {

    override fun registerDriver(driverDTO: DriverDTO): String? {
        val driver : Driver = driverMapper.mapToEntity(driverDTO)
        val responseDriver = driverRepository.save<Driver>(driver)
        return responseDriver.driverId;
    }

    override fun updateDriver(driverDTO: DriverDTO) {
        val driver : Driver = driverMapper.mapToEntity(driverDTO)
        driverRepository.save<Driver>(driver)
    }

    override fun unregisterDriver(driverId: String) {
        driverRepository.deleteById(driverId)
    }

    override fun fetchDriver(driverId: String): DriverDTO {
        val driver : Driver = driverRepository.getReferenceById(driverId)
        return driverMapper.mapToDTO(driver)

    }
}

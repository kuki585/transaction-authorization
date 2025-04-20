package com.poc.transaction_authorization.services.impl

import com.poc.transaction_authorization.dtos.DriverDTO
import com.poc.transaction_authorization.mappers.DriverMapper
import com.poc.transaction_authorization.repositories.DriverRepository
import com.poc.transaction_authorization.services.DriverService
import org.springframework.stereotype.Service

@Service
class DriverServiceImpl(
    private val driverRepository : DriverRepository,
    private val driverMapper : DriverMapper
) : DriverService {

    override fun registerDriver(driverDTO: DriverDTO) {

    }

    override fun updateDriver(driverDTO: DriverDTO) {
        TODO("Not yet implemented")
    }

    override fun unregisterDriver(driverId: String) {
        TODO("Not yet implemented")
    }

    override fun fetchDriver(driverId: String): DriverDTO {
        TODO("Not yet implemented")
    }
}

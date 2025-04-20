package com.poc.transaction_authorization.mappers

import com.poc.transaction_authorization.dtos.DriverDTO
import com.poc.transaction_authorization.entities.Driver

interface DriverMapper {

    fun mapToEntity(driverDTO: DriverDTO) : Driver

    fun mapToDTO(driver: Driver) : DriverDTO
}
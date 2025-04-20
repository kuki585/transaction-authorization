package com.poc.transaction_authorization.mappers

import com.poc.transaction_authorization.dtos.StationDTO
import com.poc.transaction_authorization.entities.Station

interface StationMapper {

    fun mapToEntity(stationDTO: StationDTO) : Station

    fun mapToDTO(station: Station) : StationDTO
}
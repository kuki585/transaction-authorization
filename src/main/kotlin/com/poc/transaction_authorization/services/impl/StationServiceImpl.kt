package com.poc.transaction_authorization.services.impl

import com.poc.transaction_authorization.dtos.StationDTO
import com.poc.transaction_authorization.entities.Station
import com.poc.transaction_authorization.mappers.StationMapper
import com.poc.transaction_authorization.repositories.StationRepository
import com.poc.transaction_authorization.services.StationService
import org.springframework.stereotype.Service

@Service
class StationServiceImpl(
    private val stationRepository : StationRepository,
    private val stationMapper : StationMapper
) : StationService {

    override fun registerStation(stationDTO: StationDTO) {
        val station : Station = stationMapper.mapToEntity(stationDTO)
        stationRepository.save<Station>(station)
    }

    override fun updateStation(stationDTO: StationDTO) {
        val station : Station = stationMapper.mapToEntity(stationDTO)
        stationRepository.save<Station>(station)
    }

    override fun unregisterStation(stationId: String) {
        stationRepository.deleteById(stationId)
    }

    override fun fetchStation(stationId: String): StationDTO {
        val station : Station = stationRepository.getReferenceById(stationId)
        return stationMapper.mapToDTO(station)

    }
}

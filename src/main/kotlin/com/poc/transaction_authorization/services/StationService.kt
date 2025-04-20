/***********************************************
 * @Copyright Ankur Jain
 *
 *  Date    		Author      Comments
 *  20-Apr-2025     Ankur Jain  Initial Draft
 *
 ***********************************************/
package com.poc.transaction_authorization.services

import com.poc.transaction_authorization.dtos.StationDTO

/**
 * This interface acts as the template to provide business logic for the
 * addition of stations to the database.
 * @author Ankur Jain
 *
 */
interface StationService {
    fun registerStation(stationDTO : StationDTO): String?

    fun updateStation(stationDTO : StationDTO)

    fun unregisterStation(stationId : String)

    fun fetchStation(stationId : String) : StationDTO
}

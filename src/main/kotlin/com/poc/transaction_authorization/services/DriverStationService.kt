/***********************************************
 * @Copyright Ankur Jain
 *
 *  Date    		Author      Comments
 *  20-Apr-2025     Ankur Jain  Initial Draft
 *
 ***********************************************/
package com.poc.transaction_authorization.services

import com.poc.transaction_authorization.dtos.DriverStationAssociationDTO

/**
 * This interface acts as the template to provide business logic for the
 * addition of Driver station association to the database.
 * @author Ankur Jain
 *
 */
interface DriverStationService {
    fun registerDriverStation(driverStationDTO : DriverStationAssociationDTO): String?

    fun updateDriverStation(driverStationDTO : DriverStationAssociationDTO)

    fun unregisterDriverStation(associationId : String)

    fun fetchDriverStation(associationId : String) : DriverStationAssociationDTO
}

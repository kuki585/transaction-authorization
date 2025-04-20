/***********************************************
 * @Copyright Ankur Jain
 *
 *  Date    		Author      Comments
 *  20-Apr-2025     Ankur Jain  Initial Draft
 *
 ***********************************************/
package com.poc.transaction_authorization.services

import com.poc.transaction_authorization.dtos.DriverDTO

/**
 * This interface acts as the template to provide business logic for the
 * addition of Drivers to the database.
 * @author Ankur Jain
 *
 */
interface DriverService {
    fun registerDriver(driverDTO : DriverDTO): String?

    fun updateDriver(driverDTO : DriverDTO)

    fun unregisterDriver(driverId : String)

    fun fetchDriver(driverId : String) : DriverDTO
}

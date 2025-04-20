/***********************************************
 * @Copyright Ankur Jain
 *
 *  Date    		Author      Comments
 *  20-Apr-2025     Ankur Jain  Initial Draft
 *
 ***********************************************/
package com.poc.transaction_authorization.dtos

/**
 * This class is used to transfer the data for Driver entity object.
 * @author Ankur Jain
 *
 */
data class DriverDTO(
    val driverId: String,
    val driverName: String,
    val chargingAllowed: Boolean
)

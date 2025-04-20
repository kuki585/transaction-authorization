/***********************************************
 * @Copyright Ankur Jain
 *
 *  Date    		Author      Comments
 *  20-Apr-2025     Ankur Jain  Initial Draft
 *
 ***********************************************/
package com.poc.transaction_authorization.dtos

/**
 * This class is used to hold AuthorizationRequest object.
 * @author Ankur Jain
 *
 */
data class AuthorizationRequestDTO(
    val stationUuid: String,
    val driverIdentifier: DriverIdentifierDTO)

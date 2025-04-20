/***********************************************
 * @Copyright Ankur Jain
 *
 *  Date    		Author      Comments
 *  20-Apr-2025     Ankur Jain  Initial Draft
 *
 ***********************************************/
package com.poc.transaction_authorization.dtos

/**
 * This class is used to transfer the data for Station entity object.
 * @author Ankur Jain
 *
 */
data class StationDTO(
    val stationId: String? = null,
    val stationName: String)
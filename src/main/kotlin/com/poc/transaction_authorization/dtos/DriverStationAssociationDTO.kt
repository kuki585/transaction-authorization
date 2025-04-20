/***********************************************
 * @Copyright Ankur Jain
 *
 *  Date    		Author      Comments
 *  20-Apr-2025     Ankur Jain  Initial Draft
 *
 ***********************************************/
package com.poc.transaction_authorization.dtos

/**
 * This class is used to transfer the data for DriverStationAssociation entity object.
 * @author Ankur Jain
 *
 */
data class DriverStationAssociationDTO(
    val associationId: String? = null,
    val driverId: String,
    val stationId: String)
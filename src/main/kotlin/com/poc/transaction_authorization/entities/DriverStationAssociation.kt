/***********************************************
 * @Copyright Ankur Jain
 *
 *  Date    		Author      Comments
 *  20-Apr-2025     Ankur Jain  Initial Draft
 *
 ***********************************************/
package com.poc.transaction_authorization.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

/**
 * This class represents the Java equivalence of driver_station table in the database.
 * @author Ankur Jain
 *
 */
@Entity
@Table(name="driver_station")
data class DriverStationAssociation(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="association_id")
    val associationId: String,

    @Column(name="driver_id")
    val driverId: String,

    @Column(name="station_id")
    val stationId: String
)
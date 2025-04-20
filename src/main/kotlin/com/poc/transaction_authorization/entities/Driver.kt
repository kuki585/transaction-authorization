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
 * This class represents the Java equivalence of drivers table in the database.
 * @author Ankur Jain
 *
 */
@Entity
@Table(name="drivers")
data class Driver(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="driver_id")
    val driverId: String,

    @Column(name="driver_name")
    val driverName: String,

    @Column(name="charging_allowed")
    val chargingAllowed: Boolean
)

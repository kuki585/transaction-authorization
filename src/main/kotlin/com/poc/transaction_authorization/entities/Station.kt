/***********************************************
 * @Copyright Ankur Jain
 *
 *  Date    		Author      Comments
 *  20-Apr-2025     Ankur Jain  Initial Draft
 *
 ***********************************************/
package com.poc.transaction_authorization.entities

import jakarta.persistence.*

/**
 * This class represents the Java equivalence of station table in the database.
 * @author Ankur Jain
 *
 */
@Entity
@Table(name="station")
data class Station(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="station_id")
    val stationId: String,

    @Column(name="station_name")
    val stationName: String
)
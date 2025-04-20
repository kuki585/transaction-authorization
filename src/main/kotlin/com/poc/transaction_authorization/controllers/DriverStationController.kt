/***********************************************
 * @Copyright Ankur Jain
 *
 *  Date    		Author      Comments
 *  20-Apr-2025     Ankur Jain  Initial Draft
 *
 ***********************************************/
package com.poc.transaction_authorization.controllers

import com.poc.transaction_authorization.dtos.DriverStationAssociationDTO
import com.poc.transaction_authorization.services.DriverStationService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

/**
 * This class orchestrates all the rest api exposed for driver station association entity.
 *
 * @author Ankur Jain
 *
 */
@RestController
@RequestMapping("/driver/station")
class DriverStationController(private val driverStationService: DriverStationService) {

    @PostMapping
    fun registerDriver(@RequestBody driverStationDTO :
                       DriverStationAssociationDTO): String? {

        return driverStationService.registerDriverStation(driverStationDTO)
    }

    @PutMapping
    fun updateDriver(@RequestBody driverStationDTO : DriverStationAssociationDTO) {

        driverStationService.updateDriverStation(driverStationDTO)
    }

    @DeleteMapping("/{associationId}")
    fun unregisterDriver(@PathVariable associationId : String) {

        driverStationService.unregisterDriverStation(associationId)
    }

    @GetMapping("/{associationId}")
    fun fetchDriver(@PathVariable associationId : String) : ResponseEntity<Any?>{

        val driverStationDTO : DriverStationAssociationDTO =
            driverStationService.fetchDriverStation(associationId)
        return ResponseEntity.ok(driverStationDTO)
    }

}
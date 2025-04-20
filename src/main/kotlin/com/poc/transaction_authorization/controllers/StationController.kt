/***********************************************
 * @Copyright Ankur Jain
 *
 *  Date    		Author      Comments
 *  20-Apr-2025     Ankur Jain  Initial Draft
 *
 ***********************************************/
package com.poc.transaction_authorization.controllers

import com.poc.transaction_authorization.dtos.StationDTO
import com.poc.transaction_authorization.services.StationService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

/**
 * This class orchestrates all the rest api exposed for station entity.
 *
 * @author Ankur Jain
 *
 */
@RestController
@RequestMapping("/stations")
class StationController(private val stationService: StationService) {

    @PostMapping
    fun registerStation(@RequestBody stationDTO : StationDTO): String? {

        return stationService.registerStation(stationDTO)
    }

    @PutMapping
    fun updateStation(@RequestBody stationDTO : StationDTO) {

        stationService.updateStation(stationDTO)
    }

    @DeleteMapping("/{stationId}")
    fun unregisterStation(@PathVariable stationId : String) {

        stationService.unregisterStation(stationId)
    }

    @GetMapping("/{stationId}")
    fun fetchStation(@PathVariable stationId : String) : ResponseEntity<Any?>{

        val stationDTO : StationDTO = stationService.fetchStation(stationId)
        return ResponseEntity.ok(stationDTO)
    }

}
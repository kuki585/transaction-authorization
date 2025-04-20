/***********************************************
 * @Copyright Ankur Jain
 *
 *  Date    		Author      Comments
 *  20-Apr-2025     Ankur Jain  Initial Draft
 *
 ***********************************************/
package com.poc.transaction_authorization.controllers

import com.poc.transaction_authorization.dtos.DriverDTO
import com.poc.transaction_authorization.services.DriverService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * This class orchestrates all the rest api exposed for driver entity.
 *
 * @author Ankur Jain
 *
 */
@RestController
@RequestMapping("/driver")
class DriverController(private val driverService: DriverService) {

    @PostMapping("register")
    fun registerDriver(@RequestBody driverDTO : DriverDTO) {

        driverService.registerDriver(driverDTO)
    }

    @PutMapping("update")
    fun updateDriver(@RequestBody driverDTO : DriverDTO) {

        driverService.updateDriver(driverDTO)
    }

    @DeleteMapping("unRegister/{id}")
    fun unregisterDriver(@PathVariable driverId : String) {

        driverService.unregisterDriver(driverId)
    }

    @GetMapping("/{id}")
    fun fetchDriver(@PathVariable driverId : String) : ResponseEntity<Any?>{

        val driverDTO : DriverDTO = driverService.fetchDriver(driverId)
        return ResponseEntity.ok(driverDTO)
    }

}
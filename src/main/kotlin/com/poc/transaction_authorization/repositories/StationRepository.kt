/***********************************************
 * @Copyright Ankur Jain
 *
 *  Date    		Author      Comments
 *  20-Apr-2025     Ankur Jain  Initial Draft
 *
 ***********************************************/
package com.poc.transaction_authorization.repositories

import com.poc.transaction_authorization.entities.Station
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * This interface acts as the repository layer to access stations Table.
 * @author Ankur Jain
 *
 */
@Repository
interface StationRepository : JpaRepository<Station, String>
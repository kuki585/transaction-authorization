package com.poc.transaction_authorization.services.impl

import com.poc.transaction_authorization.constants.TransactionAuthConst
import com.poc.transaction_authorization.dtos.AuthorizationRequestDTO
import com.poc.transaction_authorization.dtos.AuthorizationResponseDTO
import com.poc.transaction_authorization.dtos.DriverIdentifierDTO
import com.poc.transaction_authorization.entities.Driver
import com.poc.transaction_authorization.repositories.DriverRepository
import com.poc.transaction_authorization.services.TransactionService
import jakarta.persistence.EntityNotFoundException
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
@Transactional
class TransactionServiceImpl(
    private val driverRepository : DriverRepository
) : TransactionService {

    override fun authorize(authorizationRequestDTO: AuthorizationRequestDTO):
            AuthorizationResponseDTO {
        val stationUuid : String = authorizationRequestDTO.stationUuid
        val driverIdentifierDTO : DriverIdentifierDTO =
            authorizationRequestDTO.driverIdentifier

        var authorizationStatus: String

        try{
            val driver : Driver = driverRepository
                .getReferenceById(driverIdentifierDTO.id)
            authorizationStatus = if(driver.chargingAllowed){
                TransactionAuthConst.ACCEPTED
            }else{
                TransactionAuthConst.REJECTED
            }
        }catch (entityNotFoundException: EntityNotFoundException){
            authorizationStatus = TransactionAuthConst.UNKNOWN
        }

        return AuthorizationResponseDTO(
            authorizationStatus = authorizationStatus
        )
    }
}

package com.leo.async.usecases

import com.leo.async.data.InformationRepository

class GetInformation (
    val informationRepository: InformationRepository
        ) {
    suspend operator fun invoke() = informationRepository.getInformation()
}
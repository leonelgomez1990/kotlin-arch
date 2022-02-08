package com.leo.hilt.usecases

import com.leo.hilt.data.InformationRepository

class GetInformation (
    val informationRepository: InformationRepository
        ) {
    operator fun invoke() = informationRepository.getInformation()
}
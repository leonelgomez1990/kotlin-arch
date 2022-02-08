package com.leo.hilt.data

import com.leo.hilt.framework.InformationDataSource

class InformationRepository constructor(
    private val informationDataSource: InformationDataSource
){
    fun getInformation () : String {
        return informationDataSource.getData()
    }
}
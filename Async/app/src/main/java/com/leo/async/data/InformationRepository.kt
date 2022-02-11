package com.leo.async.data

import com.leo.async.framework.InformationDataSource

class InformationRepository constructor(
    private val informationDataSource: InformationDataSource
){
    fun getInformation () : String {
        return informationDataSource.getData()
    }
}
package com.leo.async.framework

interface InformationDataSource {
    suspend fun getData() : String
}
package com.leo.async.framework

import javax.inject.Inject

class FakeDataSource @Inject constructor(): InformationDataSource {
    override fun getData(): String {
        return "Jane Doe"
    }

}
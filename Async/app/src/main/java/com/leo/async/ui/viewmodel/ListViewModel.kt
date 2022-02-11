package com.leo.async.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.leo.async.usecases.GetInformation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    val getSomeInformation: GetInformation
): ViewModel() {

    private val _txtInformation = MutableLiveData<String>()
    val txtInformation : LiveData<String> get() = _txtInformation

    fun getInformation() {
        _txtInformation.value = getSomeInformation()
    }

}
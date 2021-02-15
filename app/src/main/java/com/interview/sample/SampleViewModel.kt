package com.interview.sample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SampleViewModel : ViewModel() {

    val showHello = MutableLiveData<Boolean>(true)

}
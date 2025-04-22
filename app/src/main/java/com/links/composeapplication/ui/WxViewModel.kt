package com.links.composeapplication.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class WxViewModel:ViewModel() {
    var selectTab by mutableIntStateOf(0)
}
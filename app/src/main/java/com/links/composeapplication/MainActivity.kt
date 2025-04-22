package com.links.composeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.links.composeapplication.ui.BottomNavigationBar
import com.links.composeapplication.ui.WxViewModel
import com.links.composeapplication.ui.theme.ComposeApplicationTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel:WxViewModel = viewModel()
            ComposeApplicationTheme {
                Column {
                    HorizontalPager(PagerState { 3 },Modifier.weight(1f)) { }
                    BottomNavigationBar(viewModel.selectTab){
                        viewModel.selectTab = it
                    }
                }
            }
        }
    }
}





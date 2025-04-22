package com.links.composeapplication.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.links.composeapplication.R

@Composable
fun TabItem(
    @DrawableRes iconId: Int, title: String, tint: Color,
    modifier: Modifier
) {
    Column(
        modifier.padding(top = 8.dp, bottom = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(painterResource(iconId), title, Modifier.size(24.dp), tint)
        Text(title, fontSize = 10.sp, color = tint)
    }
}


@Composable
fun BottomNavigationBar(selected: Int, onSelect:(Int)->Unit) {
    Row (Modifier.padding().navigationBarsPadding()){
        TabItem(
            if (selected == 0) R.drawable.icon_media_fill else R.drawable.icon_media_outline, "媒体库",
            if (selected == 0) Color.Green else Color.Black, Modifier.weight(1f).clickable {onSelect(0) }
        )
        TabItem(
            if (selected == 1) R.drawable.icon_resource_fill else R.drawable.icon_resource_outline,
            "资源库",
            if (selected == 1) Color.Green else Color.Black, Modifier.weight(1f).clickable {
                onSelect(1)}
        )
        TabItem(
            if (selected == 2) R.drawable.icon_me_fill else R.drawable.icon_me_outline,
            "我的",
            if (selected == 2) Color.Green else Color.Black, Modifier.weight(1f).clickable {onSelect(2)}
        )
    }
}

@Composable
@Preview(showBackground = true)
fun TabItemPreview() {
    TabItem(R.drawable.icon_chat_outline, "聊天", Color.Black, Modifier)
}


@Composable
@Preview(showBackground = true)
fun BottomNavigationBarPreview() {
    var selectTab by remember{ mutableIntStateOf(0) }
    BottomNavigationBar(selectTab){
        selectTab = it
    }

}
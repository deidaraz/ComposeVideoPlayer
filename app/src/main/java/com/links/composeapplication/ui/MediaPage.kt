package com.links.composeapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.links.composeapplication.R

@Composable
fun MediaPage() {
    Column(Modifier.fillMaxSize()) {
        TopBar()
        MovieList()
        TvList()
    }
}

@Composable
private fun TopBar() {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(painterResource(R.drawable.icon_popcorn), "搜索", Modifier.size(36.dp))
                Text("爆米花视频", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(painterResource(R.drawable.icon_search), "搜索", Modifier.size(24.dp))
                Icon(painterResource(R.drawable.icon_refresh), "刷新", Modifier.size(24.dp))
            }

        }

    }
}

@Composable
fun MovieList() {
    Column(Modifier.fillMaxWidth()) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(15.dp,10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("电影", fontSize = 14.sp, fontWeight = FontWeight.Bold)
            Text("全部", fontSize = 10.sp)
        }
        LazyRow {
            items(20) {
                Row{
                    Spacer(Modifier.size(15.dp))
                    Column {
                        Image(
                            painterResource(R.drawable.img_test),
                            "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clip(RoundedCornerShape(5.dp))
                                .height(140.dp)
                                .fillMaxWidth()
                                .aspectRatio(3f / 4f)
                        )
                        Text("描述", Modifier.padding(0.dp, 5.dp), fontSize = 10.sp)
                        Text("1978-01-01", fontSize = 8.sp)
                    }
                }
            }
        }
    }

}

@Composable
fun TvList(){
    Column(Modifier.fillMaxWidth()) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(15.dp,10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("电视剧", fontSize = 14.sp, fontWeight = FontWeight.Bold)
            Text("全部", fontSize = 10.sp)
        }
        LazyRow {
            items(20) {
                Row{
                    Spacer(Modifier.size(15.dp))
                    Column {
                        Image(
                            painterResource(R.drawable.img_test),
                            "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clip(RoundedCornerShape(5.dp))
                                .height(140.dp)
                                .fillMaxWidth()
                                .aspectRatio(3f / 4f)
                        )
                        Text("描述", Modifier.padding(0.dp, 5.dp), fontSize = 10.sp)
                        Text("1978-01-01", fontSize = 8.sp)
                    }
                }
            }
        }
    }
}


@Composable
fun ItemView() {
    Column {
        Image(
            painterResource(R.drawable.img_test),
            "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .fillMaxWidth()
                .aspectRatio(3f / 4f)
        )
        Text("描述", Modifier.padding(0.dp, 5.dp), fontSize = 10.sp)
        Text("1978-01-01", fontSize = 8.sp)
    }
}


@Composable
@Preview(showBackground = true)
fun MediaPagePreview() {
    MediaPage()
}

@Composable
@Preview(showBackground = true)
fun ItemViewPreview() {
    ItemView()
}

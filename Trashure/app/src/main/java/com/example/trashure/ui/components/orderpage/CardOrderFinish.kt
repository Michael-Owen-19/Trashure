package com.example.trashure.ui.components.orderpage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.trashure.R
import com.example.trashure.ui.theme.TrashureTheme

@Composable
fun CardOrderFinish(
    title : String,
    time : String,
    date : String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .width(340.dp)
            .wrapContentHeight(),
        shape = RoundedCornerShape(10.dp)
    ){
        Row(
            modifier = modifier
                .width(80.dp)
                .padding(start = 12.dp, top = 12.dp, bottom = 12.dp, end = 12.dp)
        ){
            Image(
                painter = painterResource(R.drawable.vector_recycle),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 2.dp)
                    .size(30.dp)
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(6.dp),
                modifier = Modifier
                .padding(start = 11.dp)
                .weight(1.0f)
            ) {
                Text(
                    text = "Pesanan sampah $title telah selesai",
                    maxLines = 1,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = modifier
                        .padding(top = 2.dp)
                ) {
                    Text(
                        text = time,
                        maxLines = 10,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        text = "|",
                        maxLines = 10,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        text = date,
                        maxLines = 10,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }
    }
}


@Composable
@Preview(showBackground = true)
fun CardOrderFinishPreview() {
    TrashureTheme {
        CardOrderFinish(
            "Plastik",
            "17.40",
            "26 May 2023"
        )
    }
}

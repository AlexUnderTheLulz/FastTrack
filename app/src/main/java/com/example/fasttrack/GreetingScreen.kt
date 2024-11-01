package com.example.fasttrack

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fasttrack.R

@Preview
@Composable

fun GreetingScreen (){

    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = colorResource(R.color.purple05)),
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Column(modifier = Modifier
            .fillMaxWidth()
            .weight(4f),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start){

            Image(
                painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.woman)),
                contentDescription = "intern",
                modifier = Modifier
                    .size(width = 210.dp, height = 145.dp)
            )
        }


        Column (modifier = Modifier
            .fillMaxWidth()
            .weight(5f)
            .clip(shape = RoundedCornerShape(50.dp, 50.dp))
            .background(color = Color.White),
            verticalArrangement = Arrangement.SpaceBetween) {


            Column(modifier = Modifier
                .fillMaxWidth()
                .weight(2f),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally){

                Text("Добро пожаловать",
                    fontSize = 20.sp,
                    fontWeight = FontWeight(500)
                )
            }

            Column(modifier = Modifier
                .fillMaxWidth()
                .weight(9f)) {

                Column(modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f))
                {

                }
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .weight(4f))
                {
                    Row(modifier = Modifier
                        .fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceBetween){
                        Column(modifier = Modifier
                            .fillMaxHeight()
                            .weight(2f)
                        ){

                        }
                        Column(modifier = Modifier
                            .fillMaxHeight()
                            .weight(6f),
                            verticalArrangement = Arrangement.SpaceBetween
                        ){
                            Row(modifier = Modifier
                                .fillMaxWidth()
                                .weight(2f)
                                .border(width = 2.dp, color = Color.LightGray, shape = RoundedCornerShape(5.dp)),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ){
                                Column(modifier = Modifier
                                    .fillMaxHeight()
                                    .weight(1f),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                )
                                {
                                    Icon(
                                        painter = painterResource(id = R.drawable.baseline_alternate_email_24),
                                        contentDescription = null,
                                        modifier = Modifier.
                                        size(20.dp),
                                        tint = Color.Gray
                                    )
                                }
                                Column(modifier = Modifier
                                    .fillMaxHeight()
                                    .weight(2f),
                                    verticalArrangement = Arrangement.Center
                                ){
                                    Text("Email"
                                        , color = Color.Gray)
                                }
                                Column(modifier = Modifier
                                    .fillMaxHeight()
                                    .weight(4f)
                                ){}
                            }
                            Row(modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f)
                            ){

                            }
                            Row(modifier = Modifier
                                .fillMaxWidth()
                                .weight(2f)
                                .border(width = 2.dp, color = Color.LightGray, shape = RoundedCornerShape(5.dp)),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ){
                                Column(modifier = Modifier
                                    .fillMaxHeight()
                                    .weight(1f),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ){
                                    Icon(
                                        painter = painterResource(id = R.drawable.baseline_alternate_email_24),
                                        contentDescription = null,
                                        modifier = Modifier.
                                        size(20.dp),
                                        tint = Color.Gray
                                    )
                                }
                                Column(modifier = Modifier
                                    .fillMaxHeight()
                                    .weight(2f),
                                    verticalArrangement = Arrangement.Center
                                ){
                                    Text("Пароль",
                                        color = Color.Gray)
                                }
                                Column(modifier = Modifier
                                    .fillMaxHeight()
                                    .weight(4f),
                                ){}
                            }
                            Column(modifier = Modifier
                                .fillMaxWidth()
                                .weight(3f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.Start
                            ){
                                Text("Забыли пароль?",
                                    fontSize = 15.sp,
                                    color = Color.Gray,
                                    textDecoration = TextDecoration.Underline)
                            }
                        }
                        Column(modifier = Modifier
                            .fillMaxHeight()
                            .weight(2f)
                        ){

                        }

                    }
                }
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f)
                )
                {
                    Row(modifier = Modifier
                        .fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    )
                    {
                        Column (modifier = Modifier
                            .fillMaxHeight()
                            .weight(2f)
                        ) {  }

                        Column (modifier = Modifier
                            .fillMaxHeight()
                            .weight(6f)
                            .clip(shape = RoundedCornerShape(5.dp))
                            .background(color = Color.Black),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text("Войти",
                                color = Color.White,
                                fontSize = 17.sp)
                        }

                        Column (modifier = Modifier
                            .fillMaxHeight()
                            .weight(2f)
                        ) {  }
                    }
                }

                Column(modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f))
                {

                }

                Column(modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom)
                {
                    Image(
                        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.yandex_icon)),
                        contentDescription = "Yandex",
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
            }


            Column(modifier = Modifier
                .fillMaxWidth()
                .weight(3f),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.Start) {

                Column(modifier = Modifier
                    .padding(20.dp)){
                    Text("Создать аккаунт",
                        fontSize = 15.sp)
                }
            }
        }
    }
}
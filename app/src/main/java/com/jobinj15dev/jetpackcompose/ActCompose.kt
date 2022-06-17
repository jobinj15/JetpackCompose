package com.jobinj15dev.jetpackcompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jobinj15dev.jetpackcompose.ui.theme.JetpackComposeTheme

class ActCompose : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//        Column(
//            modifier = Modifier
//                .background(Color.Green)
//                .fillMaxHeight(0.7f)
//                .width(300.dp)
//                .padding(horizontal = 15.dp)
//                .border(3.dp, Color.Cyan)
//        ) {
//            Text(text = "Hello")
//            Spacer(modifier = Modifier.height(20.dp))
//            Text(text = "Minchino")
//        }
//        }
            val painter = painterResource(id = R.drawable.kermit)
            val description = "Kermit in the snow"
            val title = "Kermit playin in the snow"

            Column() {
                ImageCard(painter = painter, contentDesc = description, title = title)
                Text(text = "kjdjkhd")
            }
        }

        openIntent()
    }


    private fun openIntent(){
        val intent : Intent = Intent(this, SnackbarActivity::class.java)
        startActivity(intent)
    }

    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!")
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        JetpackComposeTheme {
            Greeting("Android")
        }
    }


    @Composable
    fun ImageCard(
        painter: Painter, contentDesc: String,
        title: String, modifier: Modifier = Modifier
    ) {
        Card(
            modifier = modifier.fillMaxWidth(0.5f),
            shape = RoundedCornerShape(15.dp),
            elevation = (5.dp)

        ) {
            Box(modifier = Modifier.height(200.dp)) {
                Image(
                    painter = painter, contentDescription = contentDesc,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Box(modifier = Modifier.fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 300f
                        )
                    )
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
                }
                
            }
        }

    }

}
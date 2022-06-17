package com.jobinj15dev.jetpackcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.jobinj15dev.jetpackcompose.R

class TextStylingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fontFamily = FontFamily(
            Font(R.font.lexend_light, FontWeight.Light),
            Font(R.font.lexend_bold, FontWeight.Bold),
            Font(R.font.lexend_medium, FontWeight.Medium)
        )

        setContent {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF101010), shape = RectangleShape)){
                   Text(text = buildAnnotatedString {
                     withStyle(
                         style = SpanStyle(
                             color = Color.Green
                         )){
                         append("J")
                     }
                     append("etpack")
                       withStyle(
                           style = SpanStyle(
                               color = Color.Green
                           )){
                           append(" C")
                       }
                       append("ompose")

                   },
                   color = Color.White,
                   fontSize = 30.sp,
                   fontFamily = fontFamily,
                   )
                }

        }
    }
}
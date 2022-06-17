package com.jobinj15dev.jetpackcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

class SnackbarActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scaffoldState = rememberScaffoldState()
            var textFieldState by remember {
                mutableStateOf("")
            }
            val scope = rememberCoroutineScope()


            Scaffold(
                modifier = Modifier.fillMaxSize(),
                scaffoldState = scaffoldState
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 30.dp)
                ) {
                    TextField(
                        value = textFieldState, onValueChange = {
                            textFieldState = it
                        },
                        label = {
                            Text("Enter your name")
                        },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = {
                            scope.launch {
                                scaffoldState.snackbarHostState.showSnackbar("Hi there $textFieldState!!!")
                            }
                        },
                        modifier = Modifier.align(Alignment.End),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow)
                    ) {
                        Text(text = "Please greet me!!")
                    }
                }

            }
        }
    }


}
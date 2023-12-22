package com.example.gdscamitybirthdaycardapp

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.gdscamitybirthdaycardapp.ui.theme.GdscAmityBirthdayCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter= painterResource(id = R.drawable.cake)
            BirthdayGreeting(painter = painter, salutation ="Happy Birthday" , name ="Abhi" , contentDescription ="An image of the cake" )
        }
    }
}

@Composable
fun BirthdayGreeting(
    painter: Painter,
    salutation:String,
    name:String,
    modifier: Modifier=Modifier,
    contentDescription:String
    ){
    Column(modifier= Modifier
        .fillMaxHeight()
        .fillMaxWidth(),
        Arrangement.Center) {

        Text(text = salutation, style = TextStyle(fontSize = 30.sp))
        Text(text = name)
        Image(painter = painter, contentDescription = contentDescription)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GdscAmityBirthdayCardAppTheme {
       // Greeting("Android")
    }
}
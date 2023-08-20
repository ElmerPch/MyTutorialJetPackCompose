package com.asolutions.mytutorialjetpackcompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asolutions.mytutorialjetpackcompose.ui.theme.MyTutorialJetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTutorialJetPackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                   // modifier = Modifier.fillMaxSize()
                ) {
                    MyComponent()
                }
            }
        }
    }
}

@Composable
fun MyComponent()
{
    Row {
        MyImage()
        MyTexts()
    }

}

@Composable
fun MyImage()
{
    Image(
        painterResource(R.drawable.ic_launcher_foreground),"Imagen de pruebas",
        modifier = Modifier.background(Color.Gray)
    )
}

@Composable
fun MyTexts(){
    Column {
        Text("Hola JP")
        Spacer(modifier = Modifier.height(10.dp))
        Text("Preparado?")
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun PreviewComponent1() {
    MyTutorialJetPackComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
        ) {
            MyComponent()
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewComponent2() {
    MyTutorialJetPackComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
        ) {
            MyComponent()
        }
    }
}
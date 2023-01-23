package com.example.bussiness_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Done
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussiness_card.ui.theme.Bussiness_cardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Bussiness_cardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DefaultPreview()
                }
            }
        }
    }
}

@Composable
fun middle(){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,modifier = Modifier.fillMaxWidth()) {
        Image(painter = painterResource(id = R.drawable.android_download_free_png), contentDescription = null)
        Text(text = stringResource(id = R.string.developer), color = Color.Green,
            fontSize = 50.sp
        )
        Text(text = stringResource(id = R.string.description),color = Color.White)
    }
}

@Composable
fun botton(){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Icon(Icons.Rounded.Done, contentDescription = null, tint = Color.Green)
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = stringResource(id = R.string.git),
                color = Color.White,)
        }
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Icon(Icons.Rounded.Email, contentDescription = null, tint = Color.Green)
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = stringResource(id = R.string.email),
                color = Color.White,)
        }
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Icon(Icons.Rounded.Phone, contentDescription = null, tint = Color.Green)
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = stringResource(id = R.string.phone),
                color = Color.White,)
        }
    }
}



@Composable
fun bussiness_card(){
    Column(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.DarkGray),
        ) {
        Spacer(modifier = Modifier.height(200.dp))
        Row (){
            middle()
        }
        Spacer(modifier = Modifier.weight(1f))
        Row (verticalAlignment = Alignment.Bottom){
            botton()
        }
        Spacer(modifier = Modifier.height(25.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Bussiness_cardTheme {
        bussiness_card()
    }
}
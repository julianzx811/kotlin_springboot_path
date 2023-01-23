package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {

                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun Lemonadeapp(modifier: Modifier = Modifier
    .fillMaxSize()
    .wrapContentSize(Alignment.Center)){
    var step by remember { mutableStateOf(1) }
    var touches = 0
    var TopTouches = 1
    var text = ""
    var description = ""
    var image = painterResource(id = R.drawable.lemon_drink)
    if(step == 1){
        text = stringResource(id = R.string.text1)
        image = painterResource(id = R.drawable.lemon_tree)
        description = stringResource(id = R.string.description1)
        var touches = 0
    }
    else if(step == 2){
        text = stringResource(id = R.string.text2)
        image = painterResource(id = R.drawable.lemon_squeeze)
        description = stringResource(id = R.string.description2)
        var touches = 0
        TopTouches = (2..4).random()
    }
    else if(step == 3){
        text = stringResource(id = R.string.text3)
        image = painterResource(id = R.drawable.lemon_drink)
        description = stringResource(id = R.string.description3)
        var touches = 0
    }
    else if(step == 4){
        text = stringResource(id = R.string.text4)
        image = painterResource(id = R.drawable.lemon_restart)
        description = stringResource(id = R.string.description4)
        var touches = 0
    }
    else if(step == 5){
        step = 1
    }
    Column(modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = text, fontSize = 18.sp)

        Button(onClick = {
            touches++
            if(touches == TopTouches){
                step++
            }
        }) {
            Image(painter = image, contentDescription = description)
        }
    }
}

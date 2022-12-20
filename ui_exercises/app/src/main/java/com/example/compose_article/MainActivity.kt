package com.example.compose_article


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_article.ui.theme.Compose_articleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_articleTheme {
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

//compose article
@Composable
fun data1(){
    ComposeArticleApp(
        image = painterResource(id = R.drawable.bg_compose_background),
        tittle = stringResource(id = R.string.tittle),
        text1 = stringResource(id = R.string.text1),
        text2 = stringResource(id = R.string.text2),
    )
}

@Composable
fun ComposeArticleApp(image: Painter, tittle: String, text1: String, text2: String){
    Column{
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(),
        )
        Text(
            text = stringResource(id = R.string.tittle),
            fontSize = 24.sp,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)
        )
        Text(
            text = stringResource(id = R.string.text1),
            textAlign = TextAlign.Justify,
            fontSize =14.sp,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),
        )
        Text(
            text = stringResource(id = R.string.text2),
            textAlign = TextAlign.Justify,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)
        )
    }
}

@Composable
fun data2(){
    Task_manager(
        image = painterResource(id = R.drawable.ic_task_completed),
        text1 = stringResource(id = R.string.tasks_completed),
        text2 = stringResource(id = R.string.Nice_work) 
    )
}

@Composable
fun Task_manager(image : Painter,text1: String,text2: String){
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center)
        {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(
                text = text1,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp, bottom = 8.dp)

            )
            Text(
                text = text2,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()

            )
    }
}

@Composable
fun item(text1: String,text2: String,color: Color,modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = text1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = text2,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun Compose_quadrant(){
       Column(modifier = Modifier
           .fillMaxWidth()
           .fillMaxHeight()) {
           Row(Modifier.weight(1f)) {
                item(text1 = stringResource(id = R.string.tittle1), text2 = stringResource(id = R.string.text3), color = Color.Green,Modifier.weight(1f))
               item(text1 = stringResource(id = R.string.tittle2), text2 = stringResource(id = R.string.text4), color = Color.Yellow,Modifier.weight(1f))
           }
           Row(Modifier.weight(1f)) {
               item(text1 = stringResource(id = R.string.tittle3), text2 = stringResource(id = R.string.text5), color = Color.Cyan,Modifier.weight(1f))
               item(text1 = stringResource(id = R.string.tittle4), text2 = stringResource(id = R.string.text6), color = Color.LightGray,Modifier.weight(1f))
           }
       }
    }


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {2
    Compose_articleTheme {
        //data1()
        //data2()
        Compose_quadrant()
    }
}
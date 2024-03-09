package com.example.experiencesforfirebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.BoxScopeInstance.align
//import androidx.compose.foundation.layout.ColumnScopeInstance.align
import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.RowScopeInstance.align
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.experiencesforfirebase.ui.theme.ExperiencesForFirebaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExperiencesForFirebaseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    logButom()
                }
            }
        }
    }
}

@Composable
fun Onclick(){

}

@Composable
fun logButom() {
    /* val p =true
    //val viewModel: LoggingViewModel=hiltViewModle()
    Button(onClick = {
        if(p==true) {
            p != false
        }
    }) {
        if(p){
        Text(
            text = "Hello !",
            //modifier = modifier
        )
        }
    }

     */


/*
    Box(


        modifier = Modifier

            .width(393.dp)
            .height(852.dp)
            .clip(RoundedCornerShape(topStart = 0.dp, topEnd = 0.dp, bottomStart = 0.dp, bottomEnd = 0.dp))
            .background(Color(red = 1f, green = 1f, blue = 1f, alpha = 1f))

            .padding(start = 0.dp, top = 0.dp, end = 0.dp, bottom = 0.dp)

            .alpha(1f)


    ) {

        Text(
            text = "طلبات التوصيل الى المنزل",
            textAlign = TextAlign.End,
            fontSize = 38.sp,
            textDecoration = TextDecoration.None,
            letterSpacing = 0.sp,

            overflow = TextOverflow.Ellipsis,
            modifier = Modifier

                .width(286.dp)

                //.height(92.dp)

                .alpha(1f),
            color = Color(red = 0.8430410623550415f, green = 0.9124479293823242f, blue = 0.044862207025289536f, alpha = 1f),
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Normal,
        )




        Text(
            text = "العروض لا تشمل تكلفة الوقود",
            textAlign = TextAlign.End,
            fontSize = 26.sp,
            textDecoration = TextDecoration.None,
            letterSpacing = 0.sp,

            overflow = TextOverflow.Ellipsis,
            modifier = Modifier

                .width(286.dp)

                //.height(62.dp)

                .alpha(1f),
            color = Color(red = 0.015781275928020477f, green = 0.015781275928020477f, blue = 0.015781275928020477f, alpha = 0.33000001311302185f),
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
        )



        Box(
            modifier = Modifier
                .width(174.dp)
                .height(202.dp)
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp, bottomStart = 16.dp, bottomEnd = 16.dp))


                .background(Color(red = 0.7700468301773071f, green = 0.9324478507041931f, blue = 0.9324478507041931f, alpha = 1f))
        ){


            Text(
                text = "سوربرماركت",
                textAlign = TextAlign.Center,
                fontSize = 26.sp,
                textDecoration = TextDecoration.None,
                letterSpacing = 0.sp,

                overflow = TextOverflow.Ellipsis,
                modifier = Modifier

                    .width(143.dp)

                    //.height(57.dp)

                    .alpha(1f),
                color = Color(red = 0f, green = 0f, blue = 0f, alpha = 1f),
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
            )

        }

    }
    
 */
Text(text = "igh")


}

/*@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExperiencesForFirebaseTheme {
        Greeting("Android")
    }
}

 */
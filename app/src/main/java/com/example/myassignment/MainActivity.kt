package com.example.myassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myassignment.ui.theme.MyAssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.purple_300)
                ) {
                    Card(modifier = Modifier
                        .fillMaxSize(0.8f)
                        .padding(16.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.White)
                        , shape = RoundedCornerShape(20.dp)) {
                        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                               Image(painter = painterResource(id = R.drawable.little),
                                   contentDescription = "little girl",
                                   modifier = Modifier
                                       .padding(top = 62.dp, bottom = 6.dp)
                                       .fillMaxWidth(0.6f)
                                       .height(220.dp)
                                   ,
                                    )
                            Text(
                                text = "Create your own \n study plan",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.padding(16.dp),

                            )
                            Spacer(modifier = Modifier.height(3.dp))
                            Text(
                                text = "Study according to the \n study plan,make study \n more motivated",
                                textAlign = TextAlign.Center,
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Normal,
                            )
                            Spacer(modifier = Modifier.height(18.dp))

                            Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                                Button(modifier = Modifier
                                    .fillMaxWidth(0.05f)
                                    .height(5.dp)
                                    .padding(horizontal = 2.dp),onClick = { /*TODO*/ }) {
                                }
                                Button(modifier = Modifier
                                    .fillMaxWidth(0.05f)
                                    .height(5.dp).padding(horizontal = 2.dp),onClick = { /*TODO*/ }) {
                                }
                                Button(modifier = Modifier
                                    .fillMaxWidth(0.1f)
                                    .height(6.dp),onClick = { /*TODO*/ }) {
                                }
                            }
                            Spacer(modifier = Modifier.height(66.dp))
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(8.dp),
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ) {

                                Button( modifier = Modifier
                                    .fillMaxWidth(0.4f)
                                    .height(45.dp), onClick = { /*TODO*/ }) {
                                    Text(text = "Sign Up")
                                }
                                OutlinedButton(
                                    border = BorderStroke(1.dp, colorResource(id = R.color.purple_500)),
                                    onClick = { /*TODO*/ }, modifier = Modifier
                                        .fillMaxWidth(0.7f)
                                        .height(45.dp)) {
                                    Text(text = "Button")
                                }


                            }
                            Spacer(modifier = Modifier.height(16.dp))
                            
                            
                            
                        }
                    }
                }

        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyAssignmentTheme {
        Greeting("Android")
    }
}
package com.kygoinc.compose1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column {


                Row {

                    Column(
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .height(300.dp)
                            .background(Color.Green)
//                    .requiredWidth(600.dp)
//                    .padding(top = 40.dp, start = 30.dp)
                            .border(3.dp, Color.Red, shape = CircleShape)
                            .padding(10.dp)
                            .border(5.dp, Color.Black)
                            .padding(10.dp)
                            .border(5.dp, Color.LightGray, shape = CircleShape)
                            .padding(10.dp)
                            .border(5.dp, Color.Yellow),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Hello hello hello",
                            modifier = Modifier
                                .border(3.dp, Color.Black)
                                .padding(20.dp, 20.dp)
                                .offset(40.dp, 40.dp)
                                .border(3.dp, Color.Cyan)
                                .padding(10.dp)
                                .offset(40.dp, 40.dp)
                                .border(3.dp, Color.White)

                        )
                        Spacer(modifier = Modifier.height(60.dp))
                        Text(text = "World world world")

                    }
                }
                Row(
                    modifier = Modifier
                        .offset(0.dp, 20.dp)
                        .fillMaxWidth(1f)
                        .height(300.dp)
                        .background(Color.Red),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "This is the second row that should be under the first",
                        modifier = Modifier
                            .clickable {
                                Toast.makeText(this@MainActivity, "Haha, text clicked", Toast.LENGTH_SHORT).show()
                            })
                }
            }
        }
    }
}



package com.example.aiethervault.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import java.lang.reflect.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)
@Composable
fun AIScreen()
{
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = androidx.compose.ui.Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "AI Detection")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) {  innerPadding->
        Box(
            modifier = androidx.compose.ui.Modifier.padding(innerPadding).background(Color(0xFFA3D4EC))
                .fillMaxSize(), // Fills the entire screen
            contentAlignment = Alignment.Center
                // Aligns everything in the center
        ) {
//            Image(
//                painter = painterResource(id = R.drawable.ai),
//                contentDescription = null,
//                contentScale = ContentScale.Crop, // Adjust as needed (e.g., FillBounds, Crop, Fit, etc.)
//                modifier = androidx.compose.ui.Modifier.fillMaxSize() // The image fills the entire Box
//            )
            GeneratePhotosUI()

        }
    }
}

@Composable
fun GeneratePhotosUI() {
    Box(
        modifier = androidx.compose.ui.Modifier
            .fillMaxSize()

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Spacer(modifier = androidx.compose.ui.Modifier.height(32.dp))
            Text(
                text = "Generate",
                color = Color.White,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Your Social Photos",
                color = Color(0xFFFF4A60), // Bright Red/Pink color
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "with AI",
                color = Color.White,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = androidx.compose.ui.Modifier.height(24.dp))


            // Generated photos
            Text(
                text = "Your photos,\nGenerated with High Security:",
                color = Color.Gray,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = androidx.compose.ui.Modifier.height(16.dp))



            // Generate Button
            Button(
                onClick = { /* Handle button click */ },
                modifier = androidx.compose.ui.Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(horizontal = 16.dp),
               
                shape = RoundedCornerShape(28.dp)
            ) {
                Text(
                    text = "Generate My Photos",
                    color = Color.Black,
                    fontSize = 18.sp
                )
            }

            Spacer(modifier = androidx.compose.ui.Modifier.height(32.dp))

            // Generate Button
            Button(
                onClick = { /* Handle button click */ },
                modifier = androidx.compose.ui.Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(horizontal = 16.dp),

                shape = RoundedCornerShape(28.dp)
            ) {
                Text(
                    text = "Check Your Social Fake Account",
                    color = Color.Black,
                    fontSize = 18.sp
                )
            }

            Spacer(modifier = androidx.compose.ui.Modifier.height(32.dp))
        }
    }
}

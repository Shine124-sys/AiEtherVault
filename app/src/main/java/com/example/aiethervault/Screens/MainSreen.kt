package com.example.aiethervault.Screens




import DashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.aiethervault.Items.NavItem
import com.example.aiethervault.R
import kotlinx.coroutines.delay


@Composable
fun MainScreen()
{   var selectedindex by remember {
    mutableIntStateOf(0)
      }
    val navbaritem= listOf(
        NavItem(name="Dashboard", icon = Icons.Default.Home),
        NavItem(name="DUIS", icon = Icons.Default.Lock),
        NavItem(name="AI Scan", icon = Icons.Default.Search),
        NavItem(name="LVault", icon = Icons.Filled.AddCircle),
        NavItem(name="Settings", icon = Icons.Default.Settings),


    )

   

    Scaffold(


        bottomBar = {
            NavigationBar {
                navbaritem.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected =selectedindex==index ,
                        onClick = { selectedindex=index },
                        icon = {
                            Icon(
                                imageVector = navItem.icon,
                                contentDescription =null
                            )
                        }
                        ,
                        label = {
                            Text(text = navItem.name)
                        }
                    )
                }

            }
        }



    ) { innerPadding->
        ContentScreen(modifier = Modifier.padding(innerPadding),selectedindex)
    }


}
@Composable
fun MyApp()
{
    val  showSplash= remember {
        mutableStateOf(true)
    }

    if(showSplash.value)
    {
        SplashScreen{
            showSplash.value=false
        }

    }else{
        MainScreen()
    }
}

@Composable
fun ContentScreen(modifier: Modifier,selectedindex:Int) {
    when(selectedindex)
    {
        0-> DashScreen()
        1-> DuisAll()
        2-> AIScreen()
        3-> LandRegistrationScreen()
        4-> SettingsScreen()


    }
}

@Composable
fun SplashScreen(onTimeout: () -> Unit)
{


    LaunchedEffect(Unit) {
        delay(2000)
        onTimeout()

    }

    Box(
        modifier = Modifier
            .fillMaxSize(), // Fills the entire screen
        contentAlignment = Alignment.Center // Aligns everything in the center
    ) {
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = null,
            contentScale = ContentScale.Crop, // Adjust as needed (e.g., FillBounds, Crop, Fit, etc.)
            modifier = Modifier.fillMaxSize() // The image fills the entire Box
        )
            Box(contentAlignment = Alignment.Center) {
                Text(text = "AiEtherVault")
            }

    }
}
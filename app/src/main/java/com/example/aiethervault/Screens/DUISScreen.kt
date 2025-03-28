package com.example.aiethervault.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.autofill.AutofillType
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.KeyboardType.Companion.Password
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun DuisAll()
{
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "duis_screen") {
        composable("duis_screen") { DUISScreen(navController) }
        composable("settings_screen") { SettingsScreen() }
        composable("device_manage") { DeviceManagementScreen() }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DUISScreen(navController: NavHostController)
{

    val scrollState = rememberScrollState()
    // State variables for form input
    var fullName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var deviceId by remember { mutableStateOf("") }
    var emailVerificationChecked by remember { mutableStateOf(false) }
    var phoneVerificationChecked by remember { mutableStateOf(false) }
    var shareDataChecked by remember { mutableStateOf(false) }
    var receiveNewslettersChecked by remember { mutableStateOf(false) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Digital Unique Id System")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) {  innerPadding->
        Box(
            modifier = Modifier
                .fillMaxSize().padding(innerPadding).verticalScroll(scrollState)
                .background(Color(0xFFA3D4EC)) // Dark background
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Create New Account",
                    color = Color.White,
                    fontSize = 24.sp,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                // Full Name field
                TextField(
                    value = fullName,
                    label = "Full Name",
                    onValueChange = { fullName = it }
                )

                // Email field
               TextField(
                    value = email,
                    label = "Email Address",
                    onValueChange = { email = it },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )

                // Username field
                TextField(
                    value = username,
                    label = "Username",
                    onValueChange = { username = it }
                )

                // Password field
                TextField(
                    value = password,
                    label = "Password",
                    onValueChange = { password = it }
                )

                // Confirm Password field
                TextField(
                    value = confirmPassword,
                    label = "Confirm Password",
                    onValueChange = { confirmPassword = it }
                )



                // Verification options
                Text(text = "Verification Options", color = Color.Gray, modifier = Modifier.padding(vertical = 8.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = emailVerificationChecked,
                        onCheckedChange = { emailVerificationChecked = it },
                        colors = CheckboxDefaults.colors(checkedColor = Color.White)
                    )
                    Text(text = "Email Verification", color = Color.White)
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = phoneVerificationChecked,
                        onCheckedChange = { phoneVerificationChecked = it },
                        colors = CheckboxDefaults.colors(checkedColor = Color.White)
                    )
                    Text(text = "Phone Verification", color = Color.White)
                }



                // Register Button
                Button(
                    onClick = { /* Handle register action */ },
                    modifier = Modifier
                        .padding(vertical = 16.dp)
                        .fillMaxWidth(),


                    ) {
                    Text(text = "Register", color = Color.White)
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = {
                        navController.navigate("settings_screen")
                    },Modifier.padding(horizontal = 10.dp)) {
                        Text("Privacy Settings")
                    }
                    Button(onClick = { navController.navigate("device_manage")}) {
                        Text("Device Manage")
                    }
                }
            }
        }
    }

}


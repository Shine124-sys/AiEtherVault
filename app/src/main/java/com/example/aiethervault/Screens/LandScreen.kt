package com.example.aiethervault.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aiethervault.ViewModel.LandRegistrationViewModel

@Composable
fun LandRegistrationScreen(viewModel: LandRegistrationViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "land_screen") {
        composable("land_screen") { LandScreen(navController, viewModel) }
        composable("property_screen") { PropertyScreen(viewModel) }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LandScreen(navController: NavHostController,viewModel: LandRegistrationViewModel) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = androidx.compose.ui.Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Land Managemenet")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = androidx.compose.ui.Modifier
                .fillMaxSize()
                .padding(innerPadding).background(Color(0xFFA3D4EC))
            // Dark background similar to the image
        ) {
            // Search Bar
           // SearchBar()

            // Options for Land, House, Apartment, and Ownership
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                        .shadow(
                            elevation = 8.dp,
                            shape = RoundedCornerShape(16.dp),
                            spotColor = Color.White.copy(alpha = 0.1f)
                        ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0x1AFFFFFF) // More subtle transparent white
                    ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Button(
                        onClick = { navController.navigate("property_screen") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(70.dp), // Slightly reduced height
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 20.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Icon(
                                imageVector = Icons.Default.Home,
                                contentDescription = "Land Registration",
                                tint = Color.White.copy(alpha = 0.9f),
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .size(28.dp)
                            )
                            Text(
                                text = "Land Registration",
                                color = Color.White.copy(alpha = 0.9f),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium,
                                letterSpacing = 0.5.sp
                            )
                        }
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                        .shadow(
                            elevation = 8.dp,
                            shape = RoundedCornerShape(16.dp),
                            spotColor = Color.White.copy(alpha = 0.1f)
                        ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0x1AFFFFFF)
                    ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Button(
                        onClick = { navController.navigate("property_screen") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(70.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 20.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Icon(
                                imageVector = Icons.Default.MailOutline,
                                contentDescription = "Document History",
                                tint = Color.White.copy(alpha = 0.9f),
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .size(28.dp)
                            )
                            Text(
                                text = "Document Verification",
                                color = Color.White.copy(alpha = 0.9f),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium,
                                letterSpacing = 0.5.sp
                            )
                        }
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                        .shadow(
                            elevation = 8.dp,
                            shape = RoundedCornerShape(16.dp),
                            spotColor = Color.White.copy(alpha = 0.1f)
                        ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0x1AFFFFFF)
                    ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Button(
                        onClick = { navController.navigate("property_screen") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(70.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 20.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = "Find Owner",
                                tint = Color.White.copy(alpha = 0.9f),
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .size(28.dp)
                            )
                            Text(
                                text = "Owner Details",
                                color = Color.White.copy(alpha = 0.9f),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium,
                                letterSpacing = 0.5.sp
                            )
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun SearchBar(searchQuery: String, onQueryChange: (String) -> Unit) {
    TextField(
        value = searchQuery,
        onValueChange = onQueryChange,
        placeholder = { Text("Enter your search query") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
        }
    )
}


@Composable
fun PropertyScreen(viewModel: LandRegistrationViewModel) {
    val propertyMessage by viewModel.propertyMessage.collectAsState()

    Column(
        modifier = androidx.compose.ui.Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Property Registration",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Property Name") }
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Property ID") }
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Owner Name") }
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Owner ID") }
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Unique Identifier") }
        )

        Button(
            onClick = { /* TODO: Register property */ },
            modifier = androidx.compose.ui.Modifier.fillMaxWidth()
        ) {
            Text("Register Property")
        }

        Text(
            text = "Property successfully registered on the blockchain.",
            modifier = androidx.compose.ui.Modifier.padding(top = 16.dp)
        )
    }
}

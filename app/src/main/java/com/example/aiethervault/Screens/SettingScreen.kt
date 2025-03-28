package com.example.aiethervault.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Checkbox
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aiethervault.R

@Composable
fun SettingsScreen(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "profile_screen") {
        composable("profile_screen") { ProfileScreen(navController) }
        composable("privacy_screen") { PrivacyScreen() }
        composable("account_list") { AccountScreen() }
    }
}


@Composable
fun ProfileScreen(navController: NavHostController) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Profile Photo
            Image(
                painter = painterResource(id = R.drawable.ic_profile_placeholder), // Replace with actual image
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(Color.Gray),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Name
            Text(
                text = "Account Name",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Phone Number
            Text(
                text = "+91 0000 0000",
                fontSize = 16.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(4.dp))

            // Account ID
            Text(
                text = "Account ID: 12345678",
                fontSize = 16.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(24.dp))

            // List of Options (like Privacy, Account)
            ProfileOptionItem("Privacy")
            Divider()
            ProfileOptionItem("Account")
            Divider()
            ProfileOptionItem("Notifications")
            Divider()
            ProfileOptionItem("Help & Support")
        }
    }


@Composable
fun ProfileOptionItem(title: String, onClick: () -> Unit = {}) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            fontSize = 18.sp,
            modifier = Modifier.weight(1f)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_arrow_forward), // Replace with an actual icon
            contentDescription = "Arrow",
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun AccountScreen()
{
    Column {
        Card {
            Button(
                onClick = {  },
                modifier = androidx.compose.ui.Modifier
                    .fillMaxWidth()
                    .height(200.dp),

                shape = RoundedCornerShape(16.dp)
            ) {


                Column(

                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Person",
                        tint = Color.White,
                        modifier = androidx.compose.ui.Modifier
                            .padding(end = 16.dp)
                            .size(24.dp)
                    )
                    Text(text = "Profile", color = Color.White)
                }
            }


        }



        Card {
            Button(
                onClick = {  },
                modifier = androidx.compose.ui.Modifier
                    .fillMaxWidth().padding(5.dp)
                    ,

                shape = RoundedCornerShape(16.dp)
            ) {


                Row(

                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Apartment",
                        tint = Color.White,
                        modifier = androidx.compose.ui.Modifier
                            .padding(end = 16.dp)
                            .size(24.dp)
                    )
                    Text(text = "Profile", color = Color.White)
                }
            }


        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PrivacyScreen() {
    val isEndToEndEncryptionEnabled = remember { mutableStateOf(false) }
    val isMetadataEncrypted = remember { mutableStateOf(false) }
    val isDataAnonymized = remember { mutableStateOf(false) }
    val areCookiesBlocked = remember { mutableStateOf(false) }
    val isDataUsageReportShown = remember { mutableStateOf(false) }
    val isActivityLogEnabled = remember { mutableStateOf(false) }
    val isGPSTrackingEnabled = remember { mutableStateOf(false) }
    val isBrowserTrackingAllowed = remember { mutableStateOf(false) }
    val isSmartContractEnabled = remember { mutableStateOf(false) }
    val isSmartContractAudited = remember { mutableStateOf(false) }
    val isDataAccessAllowed = remember { mutableStateOf(false) }
    val isEncryptionKeyShared = remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Privacy Settings") })
        }
    ) { innerPadding ->
        Column(
            modifier = androidx.compose.ui.Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {

            // Section: Encryption Settings
            Text(text = "Encryption Settings", style = MaterialTheme.typography.titleMedium)
            SettingItem(
                title = "Enable End-to-End Encryption",
                checked = isEndToEndEncryptionEnabled.value,
                onCheckedChange = { isEndToEndEncryptionEnabled.value = it }
            )
            SettingItem(
                title = "Encrypt Metadata",
                checked = isMetadataEncrypted.value,
                onCheckedChange = { isMetadataEncrypted.value = it }
            )

            Spacer(modifier = androidx.compose.ui.Modifier.height(16.dp))

            // Section: Privacy Measures
            Text(text = "Privacy Measures", style = MaterialTheme.typography.titleMedium)
            SettingItem(
                title = "Data Anonymization",
                checked = isDataAnonymized.value,
                onCheckedChange = { isDataAnonymized.value = it }
            )
            SettingItem(
                title = "Block Third-Party Cookies",
                checked = areCookiesBlocked.value,
                onCheckedChange = { areCookiesBlocked.value = it }
            )

            Spacer(modifier = androidx.compose.ui.Modifier.height(16.dp))

            // Section: Transparency Settings
            Text(text = "Transparency Settings", style = MaterialTheme.typography.titleMedium)
            SettingItem(
                title = "Show Data Usage Reports",
                checked = isDataUsageReportShown.value,
                onCheckedChange = { isDataUsageReportShown.value = it }
            )
            SettingItem(
                title = "Enable Activity Logs",
                checked = isActivityLogEnabled.value,
                onCheckedChange = { isActivityLogEnabled.value = it }
            )

            Spacer(modifier = androidx.compose.ui.Modifier.height(16.dp))

            // Section: Tracking Tools Setup
            Text(text = "Tracking Tools Setup", style = MaterialTheme.typography.titleMedium)
            SettingItem(
                title = "Enable GPS Tracking",
                checked = isGPSTrackingEnabled.value,
                onCheckedChange = { isGPSTrackingEnabled.value = it }
            )
            SettingItem(
                title = "Allow Browser Tracking",
                checked = isBrowserTrackingAllowed.value,
                onCheckedChange = { isBrowserTrackingAllowed.value = it }
            )

            Spacer(modifier = androidx.compose.ui.Modifier.height(16.dp))

            // Section: Smart Contracts Management
            Text(text = "Smart Contracts Management", style = MaterialTheme.typography.titleMedium)
            SettingItem(
                title = "Enable Smart Contracts",
                checked = isSmartContractEnabled.value,
                onCheckedChange = { isSmartContractEnabled.value = it }
            )
            SettingItem(
                title = "Audit Smart Contracts",
                checked = isSmartContractAudited.value,
                onCheckedChange = { isSmartContractAudited.value = it }
            )

            Spacer(modifier = androidx.compose.ui.Modifier.height(16.dp))

            // Section: Permissions for Law Enforcement
            Text(text = "Permissions for Law Enforcement", style = MaterialTheme.typography.titleMedium)
            SettingItem(
                title = "Allow Data Access",
                checked = isDataAccessAllowed.value,
                onCheckedChange = { isDataAccessAllowed.value = it }
            )
            SettingItem(
                title = "Share Encryption Keys",
                checked = isEncryptionKeyShared.value,
                onCheckedChange = { isEncryptionKeyShared.value = it }
            )

            Spacer(modifier = androidx.compose.ui.Modifier.height(16.dp))

            // Save Button
            Row(
                modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Button(onClick = { /* Handle save action */ }) {
                    Text("Save")
                }
            }


        }
    }
}




@Composable
fun SettingItem(
    title: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            modifier = Modifier.weight(1f),
            fontWeight = FontWeight.Bold
        )
        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
    }
}
package com.example.aiethervault.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier

@Composable
fun DeviceManagementScreen() {
    Column(
        modifier = androidx.compose.ui.Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Device Management",
            style = MaterialTheme.typography.bodyLarge,
            modifier = androidx.compose.ui.Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(16.dp))

        DeviceManagementOption("Add New Device", "Enter IMEI Number", "Enter Serial Number", "Register Device")
        DeviceManagementOption("Report Theft", "Enter IMEI Number", "", "Report")
        DeviceManagementOption("Track Stolen Device", "Enter IMEI Number", "", "Track")
        SingleButtonOption("Ownership Transfer", "Initiate Transfer")
        SingleButtonOption("Repair Centers & Resellers", "View Information")

        Spacer(modifier = androidx.compose.ui.Modifier.height(16.dp))

        Text(
            text = "DUIS Blockchain © 2023",
            style = MaterialTheme.typography.bodySmall,
            modifier = androidx.compose.ui.Modifier.align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun DeviceManagementOption(
    title: String,
    placeholder1: String,
    placeholder2: String,
    buttonText: String
) {
    Column(
        modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .background(Color.White, shape = RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Text(text = title, style = MaterialTheme.typography.bodySmall)

        Spacer(modifier = androidx.compose.ui.Modifier.height(8.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            placeholder = { Text(placeholder1) },
            modifier = androidx.compose.ui.Modifier.fillMaxWidth()
        )

        if (placeholder2.isNotEmpty()) {
            Spacer(modifier = androidx.compose.ui.Modifier.height(8.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = { Text(placeholder2) },
                modifier = androidx.compose.ui.Modifier.fillMaxWidth()
            )
        }

        Spacer(modifier = androidx.compose.ui.Modifier.height(8.dp))

        Button(
            onClick = { /*TODO*/ },
            modifier = androidx.compose.ui.Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(buttonText)
        }
    }
}

@Composable
fun SingleButtonOption(title: String, buttonText: String) {
    Column(
        modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .background(Color.Gray, shape = RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Text(text = title, style = MaterialTheme.typography.bodySmall)

        Spacer(modifier = androidx.compose.ui.Modifier.height(8.dp))

        Button(
            onClick = { /*TODO*/ },
            modifier = androidx.compose.ui.Modifier.align(Alignment.End)
        ) {
            Text(buttonText)
        }
    }
}

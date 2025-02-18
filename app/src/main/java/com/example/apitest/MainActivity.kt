package com.example.apitest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.apitest.data.networking.RetrofitClient
import com.example.apitest.data.networking.model.APIHarryPotterCharactersResponse
import com.example.apitest.ui.theme.APItestTheme
import androidx.compose.runtime.setValue
import com.example.apitest.ui.page.home.HomePage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val api = RetrofitClient.api
        setContent {
            APItestTheme {
                HomePage()

            }
        }
    }
    }
                /*var characters: List<APIHarryPotterCharactersResponse>
                by remember { mutableStateOf(listOf(APIHarryPotterCharactersResponse())) } //???*/
                //var characters by remember { mutableStateOf(List<APIHarryPotterCharactersResponse>()) }
                /* LaunchedEffect(Unit) {
                        val responseCharacters = api.getCharacters()
                        characters = responseCharacters}*/

                /*Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LazyColumn(modifier = Modifier.padding(innerPadding)){
                        items(characters) {
                            Text(it.toString())
                            HorizontalDivider()}
                            }
                            }
                            }*/

                /*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    APItestTheme {
        Greeting("Android")
    }
}*/

package com.example.apitest.ui.page.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.apitest.ui.model.UiHarryPotterCharacter
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import coil3.compose.AsyncImage
import com.example.apitest.R

@Composable
fun HomePage(viewModel: HomePageViewModel = viewModel()) {
    val characters by viewModel.harryPotterCharacters.collectAsStateWithLifecycle()
    HomePageContent(characters)
}


@Composable
internal fun HomePageContent(characters: List<UiHarryPotterCharacter>){
       LazyColumn( Modifier.fillMaxSize(),
           verticalArrangement = Arrangement.spacedBy(16.dp)

       ){
           items(characters){
               HarryPotterCharacterCard(it,
                   Modifier.fillMaxWidth().padding(horizontal = 8.dp)
               )
           }

}
}

@Composable
private fun HarryPotterCharacterCard(character: UiHarryPotterCharacter,
                                     modifier: Modifier = Modifier) {
    Card(Modifier){
        Row (Modifier.fillMaxWidth()){

            AsyncImage(
                model = character.image,
                contentDescription = character.name,
                modifier = Modifier.size(128.dp),
                placeholder = painterResource(R.drawable.ic_launcher_foreground),
                contentScale = ContentScale.Crop
            )
            Column (Modifier.padding(16.dp)) {
                Text(text= character.name)
                Text(text=character.house)
            }
        }

    }

}




@Preview
@Composable
private fun PreviewHomePage() {
    HomePageContent(List(5) { UiHarryPotterCharacter.dummy })
}
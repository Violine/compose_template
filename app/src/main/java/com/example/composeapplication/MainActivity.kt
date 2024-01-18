package com.example.composeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.composeapplication.domain.ItemModel
import com.example.composeapplication.ui.theme.ComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeApplicationTheme {
                val items = listOf(
                    ItemModel(
                        name = "Йа список",
                        description = ""
                    ),
                    ItemModel(
                        name = "Йа список",
                        description = ""
                    ),
                    ItemModel(
                        name = "Йа список",
                        description = ""
                    ),
                    ItemModel(
                        name = "Йа список",
                        description = ""
                    ),
                    ItemModel(
                        name = "Йа список",
                        description = ""
                    ),
                    ItemModel(
                        name = "Йа список",
                        description = ""
                    ),
                    ItemModel(
                        name = "Йа список",
                        description = ""
                    ),
                    ItemModel(
                        name = "Йа список",
                        description = ""
                    ),
                    ItemModel(
                        name = "Йа список",
                        description = ""
                    ),
                    ItemModel(
                        name = "Йа список",
                        description = ""
                    ),
                    ItemModel(
                        name = "Йа список",
                        description = ""
                    ),
                    ItemModel(
                        name = "Йа список",
                        description = ""
                    ),
                    ItemModel(
                        name = "Йа список",
                        description = ""
                    ),
                    ItemModel(
                        name = "Йа список",
                        description = ""
                    ),
                    ItemModel(
                        name = "Йа список",
                        description = ""
                    ),
                )

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary
                ) {
                    val title = "Заголовок"

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(all = 16.dp)
                    ) {
                        MainTitle(title)
                        ItemsList(
                            items = items,
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Description(text = "Йа описание йа описание йа описание йа описание йа описание йа описание йа описание йа описание йа описание йа описание йа описание йа описание йа описание")
                        Spacer(modifier = Modifier.height(16.dp))
                        ButtonComponent(
                            text = "Йа кнопка",
                            onClick = {},
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun MainTitle(title: String) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp),
        text = title,
        style = MaterialTheme.typography.titleLarge,
        textAlign = TextAlign.Center
    )
}

@Composable
fun ItemsList(items: List<ItemModel>) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .heightIn(max = 470.dp)
            .verticalScroll(scrollState)
    ) {
        items.forEach { item ->
            Item(
                ItemModel(
                    item.name,
                    item.description,
                )
            )
        }
    }
}

@Composable
fun Item(item: ItemModel) {
    Box(
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
    ) {
        Column {
            Text(item.name)
            Text(item.description)
        }
    }
}

@Composable
fun Description(text: String) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.inversePrimary)
            .height(200.dp),
        text = text,
        color = MaterialTheme.colorScheme.error
    )
}

@Composable
fun ButtonComponent(
    text: String,
    onClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(32.dp)
    ) {
        Button(
            modifier = Modifier.align(Alignment.Center),
            onClick = onClick,
            colors = buttonColors(
                containerColor = Color.Blue,
            ),
            content = {
                Text(
                    text = text,
                    color = Color.White,
                )
            },
        )
    }
}
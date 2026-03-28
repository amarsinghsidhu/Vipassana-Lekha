package com.example.vipassanalekha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale.Companion.Fit
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily.Companion.SansSerif
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vipassanalekha.ui.theme.DarkMolasses
import com.example.vipassanalekha.ui.theme.Ochre
import com.example.vipassanalekha.ui.theme.VipassanaLekhaTheme

//Compound Data type declaration
class VipassanaLekha(
    @DrawableRes val image: Int,
    @StringRes val title: Int,
    @StringRes val description: Int,
    @StringRes val writer: Int,
    val year: Int
)
// VipassanaLekha as
//	- Image
//	- Text
//	- Text
//      - Text
//      - Number
// interpretation: An Android App with
//	- Image of an Insight text/writing
//	- Title of Insight writing
//	- Content description of image for accessibility through accessibility tools
//	- Writer of the text
//	- Year of composition

var vipassanaLekha0 = VipassanaLekha(
    image = R.drawable.vipassanalekha,
    title = R.string.logo,
    description = R.string.logo_description,
    writer = R.string.logo_writer,
    year = 2026
)
var vipassanaLekha1 = VipassanaLekha(
    image = R.drawable.a,
    title = R.string.a,
    description = R.string.a_description,
    writer = R.string.writer,
    year = 2026
)
var vipassanaLekha2 = VipassanaLekha(
    image = R.drawable.b,
    title = R.string.b,
    description = R.string.b_description,
    writer = R.string.writer,
    year = 2026
)

var vipassanaLekha3 = VipassanaLekha(
    image = R.drawable.c,
    title = R.string.c,
    description = R.string.c_description,
    writer = R.string.writer,
    year = 2026
)

var vipassanaLekha4 = VipassanaLekha(
    image = R.drawable.d,
    title = R.string.d,
    description = R.string.d_description,
    writer = R.string.writer,
    year = 2026
)

var vipassanaLekha5 = VipassanaLekha(
    image = R.drawable.e,
    title = R.string.e,
    description = R.string.e_description,
    writer = R.string.writer,
    year = 2026
)

var vipassanaLekha6 = VipassanaLekha(
    image = R.drawable.f,
    title = R.string.f,
    description = R.string.f_description,
    writer = R.string.writer,
    year = 2026
)

var vipassanaLekha7 = VipassanaLekha(
    image = R.drawable.g,
    title = R.string.g,
    description = R.string.g_description,
    writer = R.string.writer,
    year = 2026
)

/*
fun fn-for-VipassanaLekha(vipassanaLekha1) {
    ... vipassanaLekha.image
    	vipassanaLekha.title
    	vipassanaLekha.description
    	vipassanaLekha.writer
    	vipassanaLekha.year
}
 */

// Template rules in use:
//  - Compound: 5 fields

// VipassanaLekha -> VipassanaLekha
// Start of world with initial state vipassanaLekha0
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VipassanaLekhaTheme {
                BigBang()
            }
        }
    }
}

@Composable
fun BigBang() {

    var vipassanaLekha by remember { mutableStateOf(vipassanaLekha0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Ochre),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Render(vipassanaLekha)
        TouchHandling(
            vipassanaLekha = vipassanaLekha,
            onButtonClick = {
                    nextVipassanaLekha ->
                vipassanaLekha = nextVipassanaLekha
            }
        )
    }
}

// VipassanaLekha -> Image
// With some instance of the class as input, production of screen visuals
// In the file "VipassanaLekhaUITest.kt"

//@Composable
//fun Render(vipassanaLekha: VipassanaLekha) {
//	Text(text = "stub")
//}

@Composable
fun Render(vipassanaLekha: VipassanaLekha) {
    Column {

        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(vipassanaLekha.image),
            contentDescription = stringResource(vipassanaLekha.description),
            modifier = Modifier
                .padding(
                    start = 32.dp,
                    end = 32.dp,
                )
                .fillMaxWidth()
                .aspectRatio(1f)
                .align(Alignment.CenterHorizontally)
                .background(DarkMolasses),
            contentScale = Fit,
            alignment = Alignment.Center,
        )
        Box(
            modifier = Modifier
                .padding(32.dp)
                .fillMaxWidth()
                .height(140.dp)
                .background(DarkMolasses)
        ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(vipassanaLekha.title),
                    color = Ochre,
                    fontSize = 20.sp,
                    fontFamily = SansSerif,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = stringResource(vipassanaLekha.writer),
                        color = Ochre,
                        fontSize = 16.sp,
                        fontFamily = SansSerif,
                        modifier = Modifier.weight(1f)
                    )
                    Text(text = "|", color = White)
                    Text(
                        text = vipassanaLekha.year.toString(),
                        color = Ochre,
                        fontSize = 16.sp,
                        fontFamily = SansSerif,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}

// VipassanaLekha Touch -> VipassanaLekha
// With touch on one of the two buttons on screen respective previous or next image with metadata
// In the file "VipassanaLekhaUITests.kt"
//@Composable
//fun TouchHandling(
//    vipassanaLekha: VipassanaLekha,
//    onButtonClick: (VipassanaLekha) -> Unit
//) {
//
//}

@Composable
fun TouchHandling(
    vipassanaLekha: VipassanaLekha,
    onButtonClick: (VipassanaLekha) -> Unit
) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(32.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Button(
            onClick = {
                val prevVipassanaLekha = when (vipassanaLekha) {
                    vipassanaLekha0 -> vipassanaLekha7
                    vipassanaLekha1 -> vipassanaLekha0
                    vipassanaLekha2 -> vipassanaLekha1
                    vipassanaLekha3 -> vipassanaLekha2
                    vipassanaLekha4 -> vipassanaLekha3
                    vipassanaLekha5 -> vipassanaLekha4
                    vipassanaLekha6 -> vipassanaLekha5
                    vipassanaLekha7 -> vipassanaLekha6
                    else -> vipassanaLekha0
                }
                onButtonClick(prevVipassanaLekha)
            },
            modifier = Modifier.weight(1f),
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(DarkMolasses)
        ) {
            Text(
                text = stringResource(R.string.prev_button),
                color = Ochre
            )
        }
        Button(
            onClick = {
                val nextVipassanaLekha = when (vipassanaLekha) {
                    vipassanaLekha0 -> vipassanaLekha1
                    vipassanaLekha1 -> vipassanaLekha2
                    vipassanaLekha2 -> vipassanaLekha3
                    vipassanaLekha3 -> vipassanaLekha4
                    vipassanaLekha4 -> vipassanaLekha5
                    vipassanaLekha5 -> vipassanaLekha6
                    vipassanaLekha6 -> vipassanaLekha7
                    vipassanaLekha7 -> vipassanaLekha0
                    else -> vipassanaLekha0
                }
                onButtonClick(nextVipassanaLekha)
            },
            modifier = Modifier.weight(1f),
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(DarkMolasses)
        ) {
            Text(
                text = stringResource(R.string.nex_button),
                color = Ochre
            )
        }
    }
}
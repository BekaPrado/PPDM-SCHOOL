package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.components.LionSchoolCouses

@Composable
fun CursosScreen(modificador: Modifier = Modifier) {
    Box(
        modifier = modificador
            .padding(20.dp)
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top
        ) {
            Row(
                modifier = Modifier
                    .width(140.dp)
                    .height(90.dp)
                    .padding(top = 20.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.logo_lion_school),
                    contentDescription = stringResource(R.string.logo_lion_school),
                    modifier = Modifier.size(72.dp)
                )
                Text(
                    text = stringResource(R.string.title_app_name),
                    color = Color(0xFF3347B0),
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 10.dp)
                )
            }

            Divider(
                color = Color(0xFFFFC23D),
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .height(0.8.dp)
            )

            OutlinedTextField(
                value = "",
                onValueChange = { /* implementação futura */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .height(45.dp)
                    .background(Color(0xFFF5F5F5)),
                shape = RoundedCornerShape(12.dp),
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = Color(0xFFB7B7B7)
                    )
                },
                label = {
                    Text(
                        text = stringResource(R.string.text_field_courses),
                        color = Color(0xFFB7B7B7),
                        modifier = Modifier.padding(start = 25.dp)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFFFBF30),
                    unfocusedBorderColor = Color(0xFFFFC23D)
                )
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(top = 15.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.lion_list),
                    contentDescription = stringResource(R.string.lion_list),
                    modifier = Modifier.size(70.dp)
                )
                Text(
                    text = stringResource(R.string.courses),
                    color = Color(0xFF3347B0),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 7.dp)
                )
            }

            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                LionSchoolCouses(
                    acronym = stringResource(R.string.couse_acronym_ds),
                    titlecourse = stringResource(R.string.couse_name_ds),
                    descriptioncourse = stringResource(R.string.couse_description_ds),
                    termcourse = stringResource(R.string.couse_term_ds),
                    image = painterResource(R.drawable.lion_ds)
                )
                LionSchoolCouses(
                    acronym = stringResource(R.string.couse_acronym_rds),
                    titlecourse = stringResource(R.string.couse_name_rds),
                    descriptioncourse = stringResource(R.string.couse_description_rds),
                    termcourse = stringResource(R.string.couse_term_rds),
                    image = painterResource(R.drawable.lion_rds)
                )
                LionSchoolCouses(
                    acronym = stringResource(R.string.couse_acronym_ele),
                    titlecourse = stringResource(R.string.couse_name_ele),
                    descriptioncourse = stringResource(R.string.couse_description_ele),
                    termcourse = stringResource(R.string.couse_term_ele),
                    image = painterResource(R.drawable.lion_ele)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun PreviewCursosScreen() {
    CursosScreen()
}

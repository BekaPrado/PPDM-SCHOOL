package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import br.senai.sp.jandira.lionschool.screens.components.LionSchoolStudents


@Composable
fun StudentsScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceAround,

                ) {
                Image(
                    painter = painterResource(
                        R.drawable.logo_lion_school
                    ),
                    contentDescription = stringResource(
                        R.string.logo_lion_school
                    ),
                    modifier = Modifier
                        .size(70.dp)
                )

                Text(
                    text = stringResource(
                        R.string.app_name
                    ),
                    fontSize = 18.sp,
                    color = Color(0xff3347B0),
                    fontWeight = FontWeight.Bold,
                    lineHeight = 18.sp,
                    modifier = Modifier.padding(top = 10.dp)
                )

                Card(
                    modifier = Modifier
                        .padding(start = 150.dp)
                        .size(60.dp),
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xffFFC23D)
                    )
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text(
                            text = stringResource(
                                R.string.studying
                            ),
                            fontSize = 23.sp,
                            color = Color(0xff3347B0),
                            fontWeight = FontWeight.Bold

                        )
                    }
                }
            }
            Divider(
                modifier = Modifier
                    .padding(top = 12.dp, bottom = 17.dp)
                    .height(1.dp)
                    .width(320.dp),
                color = Color(0xffFFC23D)
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Find a student", fontSize = 15.sp) },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = Color(0xff9E9FA4)
                    )
                },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(all = 20.dp)
                    .height(45.dp)
                    .width(322.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xffFFC23D),
                    unfocusedBorderColor = Color(0xffFFC23D)
                )
            )

        }
        Row (
            modifier=Modifier
                .padding(top = 180.dp, start = 35.dp)
                .size(330.dp,80.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ){
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    Color(0xff3347B0)
                ),
                modifier = Modifier
                    .padding(top = 25.dp)
                    .width(77.dp),
                shape = RoundedCornerShape(24.dp)
            ) {
                Text(
                    text = stringResource(
                        R.string.app_name
                    ),
                    color = Color.White,
                    fontSize = 12.sp
                )
            }

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    Color(0xffFFC23D)
                ),
                modifier = Modifier
                    .padding(top = 25.dp, start = 5.dp)
                    .width(97.dp),
                shape = RoundedCornerShape(24.dp)
            ) {
                Text(
                    text = stringResource(
                        R.string.studying
                    ),
                    color = Color(0xff3347B0),
                    fontSize = 12.sp
                )
            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    Color(0xffFFC23D)
                ),
                modifier = Modifier
                    .padding(top = 25.dp, start = 5.dp)
                    .width(97.dp),
                shape = RoundedCornerShape(24.dp)
            ) {
                Text(
                    text = stringResource(
                        R.string.logo_instagram
                    ),
                    color = Color(0xff3347B0),
                    fontSize = 12.sp
                )
            }
        }
        Row (
            modifier = Modifier
                .padding(top = 270.dp, start = 27.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Image(
                painter = painterResource(
                    R.drawable.lion_facebook
                ),
                contentDescription = "",
                modifier = Modifier
                    .size(40.dp)
            )
            Text(
                text = stringResource(
                    R.string.logo_lion_school
                ),
                fontSize = 18.sp,
                color = Color(0xff3347B0),
                fontWeight = FontWeight.SemiBold,
            )
        }
        Column (
            modifier = Modifier
                .padding(top = 320.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            LionSchoolStudents(
                profile = painterResource(R.drawable.lion_user_luana),
                name = stringResource( R.string.lion_user_name_luana),
                matricula = stringResource( R.string.lion_user_matricula_luana),
                year = stringResource(R.string.lion_user_year_luana)
            )
            LionSchoolStudents(
                profile = painterResource(R.drawable.lion_user_pedro),
                name = stringResource( R.string.lion_user_name_pedro),
                matricula = stringResource( R.string.lion_user_matricula_pedro),
                year = stringResource(R.string.lion_user_year_pedro)
            )
            LionSchoolStudents(
                profile = painterResource(R.drawable.lion_user_luana),
                name = stringResource( R.string.lion_user_name_luana),
                matricula = stringResource( R.string.lion_user_matricula_luana),
                year = stringResource(R.string.lion_user_year_luana)
            )
            LionSchoolStudents(
                profile = painterResource(R.drawable.lion_user_pedro),
                name = stringResource( R.string.lion_user_name_pedro),
                matricula = stringResource( R.string.lion_user_matricula_pedro),
                year = stringResource(R.string.lion_user_year_pedro)
            )
            LionSchoolStudents(
                profile = painterResource(R.drawable.lion_user_luana),
                name = stringResource( R.string.lion_user_name_luana),
                matricula = stringResource( R.string.lion_user_matricula_luana),
                year = stringResource(R.string.lion_user_year_luana)
            )
        }
    }
}

@Preview
@Composable
private fun StudentsScreenPreview() {
    StudentsScreen()
}

package com.st17.workclass.ui.interfaceUnits.calendar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.ui.background.mainBackground
import com.st17.workclass.ui.elements.buttons.circleButton
import com.st17.workclass.ui.elements.texts.addictionalText
import com.st17.workclass.ui.elements.texts.titleText
import com.st17.workclass.ui.theme.BrownN
import com.st17.workclass.ui.theme.GreenD
import com.st17.workclass.ui.theme.White

@Composable
fun calendar(){
    Column(modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, top = 35.dp, bottom = 16.dp)
            .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(0.dp)) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Column {
                titleText(text = "Current date", color = White, textSize = 29.sp)
                addictionalText(text = "month", color = White)
            }

            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                circleButton()
                circleButton(rotateDegrees = 180f)
            }
        }

        Row(modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            dateUnit(circleColor = White, textColor = GreenD)
            dateUnit()
            dateUnit()
            dateUnit()
            dateUnit()
            dateUnit()
            dateUnit()
        }
    }
}


@Preview
@Composable
fun calendarPreview(navController: NavHostController = rememberNavController()){
    mainBackground()

    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Box(modifier = Modifier
            .fillMaxHeight(190/800f)
            .fillMaxWidth()){
            calendar()
        }

        Box(modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp)
            .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
            .background(White)){

        }
    }
}
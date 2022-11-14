package com.st17.workclass.ui.elements.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.st17.workclass.ui.elements.texts.text
import com.st17.workclass.ui.theme.*

@Preview
@Composable
fun see(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.Center
        ){
        standartButton(text = "Вход", color = GreenD)
    }
}

@Composable
fun standartButton(text: String = "text", color: Color = Black, width: Int = 120, height: Int = 36){
    Box(
        modifier = Modifier
            .width(width.dp)
            .height(height.dp)
            .shadow(
                elevation = 5.dp,
                shape = RoundedCornerShape(8.dp),
                clip = true)
            .clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp, bottomStart = 8.dp, bottomEnd = 8.dp))
            .background(Color.White)
            .clickable {  },
        contentAlignment = Alignment.Center
    ) {
        text(text, color)
    }
}
package com.example.navigation.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.navigation.componentes.BotaoIcone
import com.example.navigation.componentes.BotaoNormal
import com.example.navigation.componentes.BotaoNormal2
import com.example.navigation.componentes.BotaoOutline
import com.example.navigation.componentes.BotaoSwitch
import com.example.navigation.componentes.BotaoTexto
import com.example.navigation.componentes.DarkMode
import com.example.navigation.componentes.FloatingAction
import com.example.navigation.componentes.MainIconButton
import com.example.navigation.componentes.Space
import com.example.navigation.componentes.TitleBar

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Content(darkMode: MutableState<Boolean>, navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = { TitleBar(name = "Botoes") },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Green
                ),
                navigationIcon = {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            BotaoNormal()
            Space()
            BotaoNormal2()
            Space()
            BotaoTexto()
            Space()
            BotaoOutline()
            Space()
            BotaoIcone()
            Space()
            BotaoSwitch()
            Space()
            DarkMode(darkMode = darkMode)
            Space()
            FloatingAction()

        }
    }

}
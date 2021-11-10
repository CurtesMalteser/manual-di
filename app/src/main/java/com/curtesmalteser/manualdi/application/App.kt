package com.curtesmalteser.manualdi.application

import android.app.Application
import com.curtesmalteser.manualdi.application.di.AppContainer

/**
 * Created by António Bastião on 10.11.21
 * Refer to <a href="https://github.com/CurtesMalteser">CurtesMalteser github</a>
 */
class App: Application() {

    val appContainer = AppContainer()

}
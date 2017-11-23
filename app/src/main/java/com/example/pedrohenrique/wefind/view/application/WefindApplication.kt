package com.example.pedrohenrique.wefind.view.aovepplication

import android.app.Application
import com.example.pedrohenrique.wefind.view.application.di.AppComponent
import com.example.pedrohenrique.wefind.view.application.di.AppModule
import com.example.pedrohenrique.wefind.view.application.di.DaggerAppComponent

/**
 * Created by pedrohenrique on 23/11/17.
 */
class WefindApplication: Application(){

    companion object {
        lateinit var component: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        component = createAppComponent()
    }

    private fun createAppComponent(): AppComponent{
        return DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }


}
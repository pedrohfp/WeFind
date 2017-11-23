package com.example.pedrohenrique.wefind.view.application.di

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by pedrohenrique on 23/11/17.
 */
@Module
class AppModule(val application: Application){
    @Provides
    @Singleton
    fun provideApplication(): Application{
        return application
    }
}
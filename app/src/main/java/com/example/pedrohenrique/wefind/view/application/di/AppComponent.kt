package com.example.pedrohenrique.wefind.view.application.di

import dagger.Component
import javax.inject.Singleton

/**
 * Created by pedrohenrique on 23/11/17.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent
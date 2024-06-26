package util

import android.content.Context
import com.gc.weatherapp.locationModule
import di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


//
// Created by Code For Android on 15/05/24.
// Copyright (c) 2024 CFA. All rights reserved.
//

actual class KoinInitializer(
    private val application: Context,
) {
    actual fun initialize() {
        // Initialize Koin
        startKoin {
            androidContext(application)
            modules(appModule, locationModule)

        }
    }

}
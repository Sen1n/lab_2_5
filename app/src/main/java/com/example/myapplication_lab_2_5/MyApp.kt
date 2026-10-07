package com.example.myapplication_lab_2_5

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ProcessLifecycleOwner
import timber.log.Timber

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        // Ініціалізація Timber, якщо ще не ініціалізовано
        // Timber.plant(Timber.DebugTree())

        // Реєструємо глобальний детектор фону
        ProcessLifecycleOwner.get().lifecycle.addObserver(BackgroundDetector())

        // Твій попередній код registerActivityLifecycleCallbacks залишається тут без змін
        // ...
    }
}
package com.example.myapplication_lab_2_5 // Перевір свій пакет

import android.content.Context
import timber.log.Timber

object UserTracker {
    // Список, який триматиме посилання на наші екрани (Context)
    private val listeners = mutableListOf<Context>()

    fun register(context: Context) {
        listeners.add(context)
        Timber.d("UserTracker: Зареєстровано слухачів: ${listeners.size}")
    }

    // ДОДАЄМО МЕТОД ДЛЯ ОЧИЩЕННЯ
    fun unregister(context: Context) {
        listeners.remove(context)
        Timber.d("UserTracker: Слухача видалено. Залишилось: ${listeners.size}")
    }

    fun getListenersCount(): Int = listeners.size

}


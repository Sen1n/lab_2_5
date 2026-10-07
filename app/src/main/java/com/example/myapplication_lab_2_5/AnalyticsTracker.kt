package com.example.myapplication_lab_2_5

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import timber.log.Timber

class AnalyticsTracker : LifecycleEventObserver {

    // єдиний метод для перехоплення всіх подій
    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when (event) {
            Lifecycle.Event.ON_RESUME -> {
                Timber.d("AnalyticsTracker: Користувач взаємодіє з екраном (ON_RESUME)")
            }
            Lifecycle.Event.ON_PAUSE -> {
                Timber.d("AnalyticsTracker: Екран втратив фокус (ON_PAUSE)")
            }
            else -> {}
        }
    }
}
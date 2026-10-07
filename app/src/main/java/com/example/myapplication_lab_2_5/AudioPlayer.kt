package com.example.myapplication_lab_2_5
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import timber.log.Timber



class AudioPlayer : DefaultLifecycleObserver {

    // спрацьовує при події on_start
    override fun onStart(owner: LifecycleOwner) {
        Timber.d("AudioPlayer: Відтворення фонового аудіо відновлено")
    }

    // спрацьовує при події on_stop
    override fun onStop(owner: LifecycleOwner) {
        Timber.d("AudioPlayer: Відтворення фонового аудіо поставлено на паузу")
    }
}
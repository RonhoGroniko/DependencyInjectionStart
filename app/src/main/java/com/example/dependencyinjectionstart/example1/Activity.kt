package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    val keyboard = DaggerNewComponent.create().getKeyboard()
    @Inject
    lateinit var mouse: Mouse
    val monitor = DaggerNewComponent.create().getMonitor()

    init {
        DaggerNewComponent.create().inject(this)
    }

}
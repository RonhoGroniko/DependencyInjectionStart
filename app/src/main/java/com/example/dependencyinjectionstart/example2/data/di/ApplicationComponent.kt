package com.example.dependencyinjectionstart.example2.data.di

import android.content.Context
import com.example.dependencyinjectionstart.example2.data.database.ExampleDatabase
import com.example.dependencyinjectionstart.example2.data.network.ExampleApiService
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun getDatabase(): ExampleDatabase

    fun getApiService(): ExampleApiService

    fun activityComponentFactory(): ActivityComponent.ActivityComponentFactory

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance
            context: Context,
            @BindsInstance
            millis: Long
        ): ApplicationComponent
    }
}
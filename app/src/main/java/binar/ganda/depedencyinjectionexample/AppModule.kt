package binar.ganda.depedencyinjectionexample

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun namamurid(): Student{
        return Student()
    }

    @Singleton
    @Provides
    fun guru(): String{
        return "amanda"
    }



}
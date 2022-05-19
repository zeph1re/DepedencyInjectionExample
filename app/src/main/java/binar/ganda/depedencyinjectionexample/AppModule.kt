package binar.ganda.depedencyinjectionexample

import binar.ganda.depedencyinjectionexample.latihan.Nilai
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
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
    fun convertnilai(): Nilai{
        return Nilai()
    }



    @Singleton
    @Provides
    @Named("")
    fun guru(): String{
        return "amanda"
    }

    @Singleton
    @Provides
    fun gurudua(): String{
        return "bayu"
    }



}
package br.com.shido.kodeindb.android

import android.app.Application
import br.com.shido.kodeindb.database.UserRepositoryImpl
import br.com.shido.kodeindb.database.appContext
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppClass : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext

        startKoin { androidContext(this@AppClass) }
        loadAppFeature()
    }

}
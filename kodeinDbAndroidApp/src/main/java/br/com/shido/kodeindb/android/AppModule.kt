package br.com.shido.kodeindb.android

import br.com.shido.kodeindb.database.UserRepository
import br.com.shido.kodeindb.database.UserRepositoryImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

fun loadAppFeature() = loadFeature

val loadFeature by lazy {
    loadKoinModules(
        listOf(
            appModule
        )
    )
}

val appModule = module {
    viewModel { MainViewModel(get()) }

    single<UserRepository> { UserRepositoryImpl() }
}
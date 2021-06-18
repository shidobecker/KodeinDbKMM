package br.com.shido.kodeindb.database

import org.kodein.db.DB
import org.kodein.db.OpenPolicy
import org.kodein.db.getById
import org.kodein.db.impl.open
import org.kodein.db.orm.kotlinx.KotlinxSerializer
import org.kodein.db.useModels

interface UserRepository {
    suspend fun create(user: UserUI)

    suspend fun fetchAll(): List<UserUI>

}

class UserRepositoryImpl : UserRepository {

    var db: DB

    init {
        val dir = "${getApplicationFilesDirectoryPath()}/kodeindb"

        db = DB.open(dir, OpenPolicy.OpenOrCreate)

    }


    override suspend fun create(userUI: UserUI) {
        val user = User(userUI.firstName, userUI.lastName, userUI.id)
        db.put(user)
    }


    override suspend fun fetchAll(): List<UserUI> =
        db.find(User::class).all().useModels { it.toList() }.map {
            UserUI(
                it.firstName, it.lastName, it.id
            )
        }


}
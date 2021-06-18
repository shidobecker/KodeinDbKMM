package br.com.shido.kodeindb.database

import kotlinx.serialization.Serializable
import org.kodein.db.model.orm.Metadata


@Serializable
data class User(
    val firstName: String,
    val lastName: String, override val id: String,
) : Metadata


data class UserUI(
    val firstName: String,
    val lastName: String,
    val id: String
)
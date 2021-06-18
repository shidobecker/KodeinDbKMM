package br.com.shido.kodeindb.database

import org.kodein.db.DB
import org.kodein.db.OpenPolicy
import org.kodein.db.impl.open

object KodeinDatabase {

    val db = DB.open("path/to/dbKodein", OpenPolicy.OpenOrCreate)


}
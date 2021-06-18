package br.com.shido.kodeindb.database

import android.content.Context

lateinit var appContext: Context

actual fun getApplicationFilesDirectoryPath(): String =
    appContext.filesDir.absolutePath
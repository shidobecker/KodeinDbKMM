package br.com.shido.kodeindb.android

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.shido.kodeindb.database.User
import br.com.shido.kodeindb.database.UserRepository
import br.com.shido.kodeindb.database.UserUI
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import java.util.*

class MainViewModel(private val repository: UserRepository) : ViewModel() {
    val users = MutableStateFlow<List<UserUI>>(emptyList())

    init {
        fetchUser()
    }

    fun fetchUser() {
        viewModelScope.launch {
            repository.create(
                UserUI(
                    id = UUID.randomUUID().toString(),
                    firstName = UUID.randomUUID().toString().plus("Name"),
                    lastName = UUID.randomUUID().toString().plus("lastName")
                )
            )


            val result = repository.fetchAll()
            users.value = result
        }
    }


}
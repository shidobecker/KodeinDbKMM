package br.com.shido.kodeindb.android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.collect
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {


    private val viewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        lifecycleScope.launchWhenResumed {
            viewModel.users.collect { list ->
                list.forEach {
                    tv.text = tv.text.toString().plus(" ____ ").plus(it.firstName)

                }
            }
        }

    }
}

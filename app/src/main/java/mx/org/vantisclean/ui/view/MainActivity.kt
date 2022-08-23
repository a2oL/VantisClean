package mx.org.vantisclean.ui.view

import RickListAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import mx.org.vantisclean.databinding.ActivityMainBinding
import mx.org.vantisclean.ui.viewmodel.RickViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val mAdapter : RickListAdapter = RickListAdapter()

    private val rickViewModel: RickViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rickViewModel.onCreate()

        rickViewModel.rickModel.observe(this, Observer {
            mAdapter.RickListAdapter(it, this)
            binding.listaRick.layoutManager = LinearLayoutManager(this)
            binding.listaRick.adapter = mAdapter
        })
    }

}
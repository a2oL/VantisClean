package mx.org.vantisclean.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import mx.org.vantisclean.R
import mx.org.vantisclean.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(this).load(intent.getStringExtra("imagen")).into(binding.mainPhotoImage);
        binding.propertyTypeText.text = intent.getStringExtra("name")
        binding.priceValueText.text = intent.getStringExtra("gender")
        binding.textView.text = intent.getStringExtra("species")
        binding.textView2.text = intent.getStringExtra("status")
        binding.textView3.text = intent.getStringExtra("type")
    }
}
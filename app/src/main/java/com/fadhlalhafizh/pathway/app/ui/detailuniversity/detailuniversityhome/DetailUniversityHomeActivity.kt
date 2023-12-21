package com.fadhlalhafizh.pathway.app.ui.detailuniversity.detailuniversityhome

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.fadhlalhafizh.pathway.R
import com.fadhlalhafizh.pathway.app.ui.main.MainActivity
import com.fadhlalhafizh.pathway.data.model.University
import com.fadhlalhafizh.pathway.databinding.ActivityDetailUniversityHomeBinding

class DetailUniversityHomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailUniversityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailUniversityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataUniversity = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra<University>("key_University", University::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra<University>("key_University")
        }

        val universityDetailName = findViewById<TextView>(R.id.tv_universitiesName_detailUniv)
        val universityDetailAddress = findViewById<TextView>(R.id.tv__universitiesAdd_detailUniv)
        val universityDetailRank = findViewById<TextView>(R.id.tv_worldRank2_detailUniv)
        val universityDetailDescription = findViewById<TextView>(R.id.tv_desc_detailUniv)
        val universityDetailPhoto = findViewById<ImageView>(R.id.iv_univ_detailUniversity)
        val universityDetailPhotoBackground = findViewById<ImageView>(R.id.iv_background_detailUniv)

        universityDetailName.text = dataUniversity?.university ?: "Unknown Name!"
        universityDetailAddress.text = dataUniversity?.address ?: "Unknown Address!"
        universityDetailRank.text = dataUniversity?.worldRank ?: "?"
        universityDetailDescription.text = dataUniversity?.description ?: "No Data Description can be found!"
        universityDetailPhoto.setImageResource(dataUniversity?.photo ?: 0)
        universityDetailPhotoBackground.setImageResource(dataUniversity?.photoBackground ?: 0)

        goBack()
    }

    private fun goBack() {
        binding.ivBackArrowDetailUniv.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}

package com.dicoding.qrgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.qrgenerator.databinding.ActivityHelperBinding

class HelperActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHelperBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelperBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        addFragment()
    }

    private fun addFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.rootContainer, QRCodeFragment())
            .commit()
    }

}
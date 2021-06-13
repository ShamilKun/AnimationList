package com.example.animationlist.animation_screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.animationlist.R
import io.supercharge.shimmerlayout.ShimmerLayout

class ShimmerLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shimmer_layout)

        var shimmer_layout : ShimmerLayout = findViewById(R.id.shimmer_layout)
        var shimmer_text : ShimmerLayout = findViewById(R.id.shimmer_text)

        shimmer_layout.startShimmerAnimation()
        shimmer_text.startShimmerAnimation()

        val handler = Handler()
        val runnable = Runnable {
            shimmer_layout.stopShimmerAnimation()
            shimmer_text.stopShimmerAnimation()
        }

       // handler.postDelayed(runnable, 3000)
    }
}
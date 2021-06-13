package com.example.animationlist.animation_screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import com.example.animationlist.R

class LottieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lottie)
        redIconsAnimation()
        boyAnimation()
    }


    fun redIconsAnimation() {
        var car: LottieAnimationView = findViewById(R.id.redIcons)
        var play: ImageView = findViewById(R.id.playAnimation)
        var pause: ImageView = findViewById(R.id.pauseAnimation)
        var speed: SeekBar = findViewById(R.id.speedAnimation)
        var speedInfo: TextView = findViewById(R.id.speedLottie)

        play.setOnClickListener {
            car.resumeAnimation()
        }
        pause.setOnClickListener {
            car.pauseAnimation()
        }

        speed.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                car.speed = progress.toFloat()
                speedInfo.setText("Скорость анимации: X" + progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

    }

    fun boyAnimation() {
        var boy: LottieAnimationView = findViewById(R.id.boy)

        var boyFrame: SeekBar = findViewById(R.id.seekBar)

        var textFrame: TextView = findViewById(R.id.textFrame)

        boyFrame.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                boy.frame = progress
                textFrame.setText("Кадр:" + progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }
}
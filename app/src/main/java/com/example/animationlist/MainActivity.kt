package com.example.animationlist

import android.animation.ArgbEvaluator
import android.animation.ValueAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.Lottie
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable
import com.airbnb.lottie.LottieImageAsset
import com.example.animationlist.animation_screens.LottieActivity
import com.example.animationlist.animation_screens.RamotionLayout.ExpandingCollActivity
import com.example.animationlist.animation_screens.ShimmerLayoutActivity
import com.example.animationlist.animation_screens.SpaceTabLayout.SpaceTabActivity

class MainActivity : AppCompatActivity(),Navigate {

    lateinit var gg: ImageView
    lateinit var animation : MotionLayout
    lateinit var press : View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         animation = findViewById(R.id.anim)

        gg= findViewById(R.id.view)

        var gg = AnimationInfoList("sada","sadas","asdsadas")

        val qq = ArrayList<AnimationInfoList>()

        getFavorites()

        //press = findViewById(R.id.press)

       // var anim: LottieImageAsset = findViewById(R.id.animationView)
// Custom animation speed or duration.
//        val animator = ValueAnimator.ofFloat(0f, 1f)
//        animator.addUpdateListener {
//            anim.setProgress(animator.animatedValue as Float)
//        }
//        animator.start()


        //animation.transitionToState(animation.)
        Handler().postDelayed({
          //  animation.transitionToState(R.id.test4)
        }, 3000)


        var aa = 21
        //var gg = android.R.color.black
        animation.setOnClickListener{
     //  anim.playAnimation()
            //Log.e("Gomomo","" + animation.currentState)
           // kk(resources.getColor(R.color.black),resources.getColor(R.color.ggg))
                when (animation.currentState ) {
                    R.id.start -> {
                        animation.transitionToState(R.id.end)
                        kk(resources.getColor(R.color.black),resources.getColor(R.color.state1))
                    }
                    R.id.end -> {
                        animation.transitionToState(R.id.state3)
                        kk(resources.getColor(R.color.state1),resources.getColor(R.color.state2))
                    }
                    R.id.state3 -> {
                        animation.transitionToState(R.id.state5)
                        kk(resources.getColor(R.color.state2),resources.getColor(R.color.state3))
                    }
                    R.id.state5 -> {
                        animation.transitionToState(R.id.state4)
                        kk(resources.getColor(R.color.state3),resources.getColor(R.color.state4))
                    }
                    R.id.state4 -> {
                        animation.transitionToState(R.id.state60)
                        kk(resources.getColor(R.color.state3),resources.getColor(R.color.state1))
                    }
                }
        }
    }

    fun getFavorites() {
        var itemAnim = ArrayList<AnimationInfoList>()

        itemAnim.add(AnimationInfoList("sfsd","dsfsdf","dsfsdf"))
        itemAnim.add(AnimationInfoList("sfsd","dsfsdf","dsfsdf"))
        itemAnim.add(AnimationInfoList("sfsd","dsfsdf","dsfsdf"))
        itemAnim.add(AnimationInfoList("sfsd","dsfsdf","dsfsdf"))
        itemAnim.add(AnimationInfoList("sfsd","dsfsdf","dsfsdf"))
        itemAnim.add(AnimationInfoList("sfsd","dsfsdf","dsfsdf"))
        itemAnim.add(AnimationInfoList("sfsd","dsfsdf","dsfsdf"))
        itemAnim.add(AnimationInfoList("sfsd","dsfsdf","dsfsdf"))
        itemAnim.add(AnimationInfoList("sfsd","dsfsdf","dsfsdf"))
        itemAnim.add(AnimationInfoList("sfsd","dsfsdf","dsfsdf"))
        itemAnim.add(AnimationInfoList("sfsd","dsfsdf","dsfsdf"))
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        var animationAdapter: Adapter = Adapter(itemAnim,this)
        recyclerView.adapter = animationAdapter


    }

    fun kk(fromColor: Int, toColor : Int) {
        val colorFrom = resources.getColor(android.R.color.black)
        val colorTo = resources.getColor(android.R.color.holo_red_dark)
        val colorAnimation = ValueAnimator.ofObject(ArgbEvaluator(), fromColor, toColor)
        colorAnimation.duration = 1000 // milliseconds

        colorAnimation.addUpdateListener { animator -> animation.setBackgroundColor(animator.animatedValue as Int) }
        colorAnimation.start()
    }

    override fun navigateTo() {
        startActivity((Intent(this, LottieActivity::class.java)))
    }


}
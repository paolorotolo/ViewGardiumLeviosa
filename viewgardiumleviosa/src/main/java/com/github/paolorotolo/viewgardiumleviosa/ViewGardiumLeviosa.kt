package com.github.paolorotolo.viewgardiumleviosa

import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import com.github.paolorotolo.viewgardiumleviosa.ViewGardiumLeviosa.Companion.DEFAULT_DELTA
import com.github.paolorotolo.viewgardiumleviosa.ViewGardiumLeviosa.Companion.DEFAULT_DURATION

class ViewGardiumLeviosa {
    companion object {
        const val DEFAULT_DELTA = -20
        const val DEFAULT_DURATION = 700
    }
}

fun View.startFluctuate(delta: Int = DEFAULT_DELTA,
                        duration: Int = DEFAULT_DURATION) {
    val translateAnimation = TranslateAnimation(
        0f, 0f, this.y, this.y + delta
    ).apply {
        repeatMode = Animation.REVERSE
        repeatCount = Animation.INFINITE
        interpolator = AccelerateDecelerateInterpolator()
        this.duration = duration.toLong()
    }

    this.animation = translateAnimation
}

fun View.stopFluctuate() {
    this.clearAnimation()
}
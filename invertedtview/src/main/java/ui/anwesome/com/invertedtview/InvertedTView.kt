package ui.anwesome.com.invertedtview

/**
 * Created by anweshmishra on 08/04/18.
 */

import android.content.Context
import android.graphics.*
import android.view.View
import android.view.MotionEvent

class InvertedTView (ctx : Context) : View(ctx) {
    val paint : Paint = Paint(Paint.ANTI_ALIAS_FLAG)
    override fun onDraw(canvas : Canvas) {

    }
    override fun onTouchEvent(event : MotionEvent) : Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {

            }
        }
        return true
    }
}
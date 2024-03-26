package com.example.battletanks

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.FrameLayout

class GridDrawer(private val context: Context) {

    fun drawGrid() {
        val container = binding.container
        drawHorizontalLines(container)
        drawVerticalLines(container)
    }


    private fun drawHorizontalLines(container: FrameLayout?) {
        var topMargin = 0
        while (topMargin <= container!!.height) {
            val horizontalLine = View(context)
            val layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, 1)
            topMargin += 50
            layoutParams.topMargin = topMargin
            horizontalLine.layoutParams = layoutParams
            horizontalLine.setBackgroundColor( Color.WHITE)
            container.addView(horizontalLine)
        }
    }

//    private fun drawVerticalLines(container: FrameLayout?)

}


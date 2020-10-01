package ugurcmk

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class HearbeatTabBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): View(context, attrs, defStyleAttr) {

    val paint = Paint().apply {
        color = Color.RED
    }

    override fun onDraw(canvas: Canvas?) {
        canvas?.drawRoundRect(40f,40f,120f,80f, 10f, 10f, paint)
    }
}
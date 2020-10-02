package ugurcmk

import android.R
import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.util.Log
import android.view.View
import kotlin.math.roundToInt


class HeartbeatTabBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): View(context, attrs, defStyleAttr) {

    val paint = Paint().apply {
        color = Color.RED
    }
    private var backgroundRect = RectF()
    val cornerRadius = (2f * resources.displayMetrics.density).roundToInt()

    override fun onDraw(canvas: Canvas?) {
        backgroundRect.set(0f, 0f, width.toFloat(), height.toFloat());
        canvas?.drawRoundRect(backgroundRect, 10f, 10f, paint)
    }
}
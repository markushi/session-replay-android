package android.view

import android.annotation.SuppressLint
import android.graphics.Canvas

object DrawingUtil {

    val onDrawMethod = View::class.java.getDeclaredMethod("onDraw", Canvas::class.java).also {
        it.isAccessible = true
    }

    val drawBackgroundMethod = View::class.java.getDeclaredMethod("drawBackground", Canvas::class.java).also {
        it.isAccessible = true
    }

    @SuppressLint("WrongCall")
    fun executeOnDraw(view: View, canvas: Canvas) {
        // performs drawing operations for a view, without their childs
        drawBackgroundMethod.invoke(view, canvas)
        onDrawMethod.invoke(view, canvas)
    }
}
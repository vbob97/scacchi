package com.vincenzobombace.scacchi

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

class ScacchieraView : View {
    constructor(context: Context): super(context,null)
    constructor(context:Context,attrs: AttributeSet?) :super (context,attrs,0)
    var divisioni: Int = 4
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        var schermo= Rect()
        canvas?.getClipBounds(schermo)
        var left =(schermo.right-schermo.left)/divisioni!!
        var paint= Paint()
        for (i:Int in 1..divisioni!!){
            for(j:Int in 1..divisioni!!){
                var casella = Rect( left*(j-1), left* (i-1), (left *j)-1,(left *i)-1)

                if ((0..1).random()==0)
                    paint.color= Color.BLACK
                else
                    paint.color= Color.BLUE
                canvas?.drawRect(casella,paint)
            }

        }
    }
  //  override fun onTouchEvent(event: MotionEvent?): Boolean {
    //    if (event.action==MotionEvent.ACTION_UP){}



    //    return super.onTouchEvent(event)
    //}

}
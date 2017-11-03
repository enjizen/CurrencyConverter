package th.co.yuphasuk.wanchalerm.findpeoplelost.util

import android.graphics.drawable.Drawable
import android.os.Build
import com.yuphasuk.wanchalerm.householdincome.manager.Contextor


object BuildVersionResourceUtil {

    fun getDrawable(drawableId: Int): Drawable {
        return if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            Contextor.getInstance().context!!.resources!!.getDrawable(drawableId)
        } else {
            Contextor.getInstance().context!!.resources!!.getDrawable(drawableId,  Contextor.getInstance().context!!.theme)
        }
    }
}

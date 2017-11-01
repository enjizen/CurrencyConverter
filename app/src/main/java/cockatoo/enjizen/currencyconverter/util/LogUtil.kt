package th.co.yuphasuk.wanchalerm.findpeoplelost.util

import android.util.Log


object LogUtil {

    private var isShowLog : Boolean = true

    fun i(tag: String, msg: String?){
        if(this.isShowLog) {
            Log.i(tag, msg)
        }
    }

    fun d(tag: String, msg: String?){
        if(this.isShowLog) {
            Log.d(tag, msg)
        }
    }

    fun e(tag: String, msg: String?){
        if(this.isShowLog) {
            Log.e(tag, msg)
        }
    }

    fun v(tag: String, msg: String?){
        if(this.isShowLog) {
            Log.v(tag, msg)
        }
    }

}
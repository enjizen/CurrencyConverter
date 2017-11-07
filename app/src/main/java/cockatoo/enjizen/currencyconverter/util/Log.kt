package cockatoo.enjizen.currencyconverter.util


import org.jetbrains.anko.*


object Log : AnkoLogger {

    private val isShowLog = true

    fun i(tag: String, msg: String?){
        if(isShowLog) {
            info { "$tag $msg" }
        }
    }

    fun d(tag: String, msg: String?){
        if(isShowLog) {
            debug { "$tag $msg" }
        }
    }

    fun e(tag: String, msg: String?){
        if(isShowLog) {
            error {  "$tag $msg"  }
        }
    }

    fun v(tag: String, msg: String?){
        if(isShowLog) {
            verbose { "$tag $msg" }
        }
    }

}
package th.co.yuphasuk.wanchalerm.findpeoplelost.util

import android.app.ProgressDialog
import android.content.Context

object ProgressDialogUtil{
    private var progressDialog: ProgressDialog? = null

     fun show(context: Context, messageLoading: String) {

         if (progressDialog == null) {
             progressDialog = ProgressDialog(context)
             progressDialog!!.setMessage(messageLoading)
             progressDialog!!.setCancelable(false)
             progressDialog!!.setProgressStyle(ProgressDialog.STYLE_SPINNER)
             progressDialog!!.show()
         }


    }

     fun dismiss() {
        if (progressDialog == null) {
            return
        }

        progressDialog!!.dismiss()
    }

}
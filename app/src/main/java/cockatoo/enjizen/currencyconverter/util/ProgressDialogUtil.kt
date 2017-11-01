package th.co.yuphasuk.wanchalerm.findpeoplelost.util

import android.app.ProgressDialog
import android.content.Context

object ProgressDialogUtil{
    private var progressDialog: ProgressDialog? = null
    private var message: String? = null

     fun show(context: Context) {

         if (progressDialog == null) {
             progressDialog = ProgressDialog(context)
             message = "Loading..."
         }

        progressDialog?.setMessage(message)
        progressDialog?.setCancelable(false)
        progressDialog?.setProgressStyle(ProgressDialog.STYLE_SPINNER)
        progressDialog?.show()
    }

     fun dismiss() {
        if (progressDialog == null) {
            return
        }

        progressDialog?.dismiss()
    }

}
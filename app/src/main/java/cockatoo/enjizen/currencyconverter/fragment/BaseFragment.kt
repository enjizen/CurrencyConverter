package cockatoo.enjizen.currencyconverter.fragment

import android.support.v4.app.Fragment
import th.co.yuphasuk.wanchalerm.findpeoplelost.util.ProgressDialogUtil

/**
 * Created by wanchalermyuphasuk on 5/11/2017 AD.
 */

open class BaseFragment : Fragment(){

    protected fun showLoadingDialog(){
        ProgressDialogUtil.show(context,"")
    }

    protected fun showLoadingDialog(msg : String){
        ProgressDialogUtil.show(context,msg)
    }

    protected fun hideLoadingDialog(){
        ProgressDialogUtil.dismiss()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        hideLoadingDialog()
    }




}

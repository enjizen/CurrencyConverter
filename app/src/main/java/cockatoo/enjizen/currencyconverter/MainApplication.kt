package cockatoo.enjizen.currencyconverter

import android.app.Application
import com.yuphasuk.wanchalerm.householdincome.manager.Contextor

/**
 * Created by wanchalermyuphasuk on 31/10/2017 AD.
 */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Contextor.getInstance().init(applicationContext)
    }

    override fun onTerminate() {
        super.onTerminate()
    }
}
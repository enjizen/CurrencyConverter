package th.co.yuphasuk.wanchalerm.findpeoplelost.util

import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * Created by wanchalermyuphasuk on 16/10/2017 AD.
 */
object Validator {
    private var pattern: Pattern? = null
    private var matcher: Matcher? = null

    private val EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"

    fun email(email: String): Boolean {

        if(email.isBlank())
            return false


        pattern = Pattern.compile(EMAIL_PATTERN)
        matcher = pattern?.matcher(email)
        return matcher!!.matches()

    }
}
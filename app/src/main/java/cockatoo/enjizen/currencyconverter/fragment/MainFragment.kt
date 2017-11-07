package cockatoo.enjizen.currencyconverter.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cockatoo.enjizen.currencyconverter.R
import cockatoo.enjizen.currencyconverter.view.CustomSpinnerCountiesCurrencyAdapter
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseFragment() {

    private var countryNames : Array<String>? = null
    private var flags : IntArray? = null
    private var currency : Array<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init(savedInstanceState)

        if (savedInstanceState != null)
            onRestoreInstanceState(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val countiesAdapter = CustomSpinnerCountiesCurrencyAdapter(context,flags,countryNames,currency)

        spinnerCurrencyFrom.adapter = countiesAdapter

        spinnerCurrencyTo.adapter = countiesAdapter

        showLoadingDialog()


    }

    private fun init(savedInstanceState: Bundle?) {
        // Init Fragment level's variable(s) here

        countryNames = arrayOf(getString(R.string.country_india)
                , getString(R.string.country_china)
                , getString(R.string.country_australia)
                , getString(R.string.country_portugal)
                , getString(R.string.country_america)
                , getString(R.string.country_new_zealand))

        flags = intArrayOf(R.drawable.india
                , R.drawable.china
                , R.drawable.australia
                , R.drawable.portugal
                , R.drawable.america
                , R.drawable.new_zealand)

        currency = arrayOf(getString(R.string.currency_india)
                , getString(R.string.currency_china)
                , getString(R.string.currency_australia)
                , getString(R.string.currency_euro)
                , getString(R.string.currency_usa)
                , getString(R.string.currency_new_zealand))
    }



    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        // Save Instance (Fragment level's variables) State here
    }

    private fun onRestoreInstanceState(savedInstanceState: Bundle) {
        // Restore Instance (Fragment level's variables) State here
    }

    companion object {

        fun newInstance(): MainFragment {
            val fragment = MainFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

}
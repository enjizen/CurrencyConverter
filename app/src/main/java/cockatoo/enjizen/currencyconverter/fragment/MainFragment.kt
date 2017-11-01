package cockatoo.enjizen.currencyconverter.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cockatoo.enjizen.currencyconverter.R
import cockatoo.enjizen.currencyconverter.view.CustomSpinnerCountiesCurrencyAdapter
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    private var countryNames = arrayOf("India", "China", "Australia", "Portugal", "America", "New Zealand")
    private var flags = intArrayOf(R.drawable.india, R.drawable.china, R.drawable.australia, R.drawable.portugal, R.drawable.america, R.drawable.new_zealand)
    private var currency = arrayOf("INR", "CNY", "AUD", "EUR", "USD", "NZD")

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

        val countiesAdapter = CustomSpinnerCountiesCurrencyAdapter(context,this.flags,this.countryNames,this.currency)

        spinnerCurrencyFrom.adapter = countiesAdapter

        spinnerCurrencyTo.adapter = countiesAdapter

    }

    private fun init(savedInstanceState: Bundle?) {
        // Init Fragment level's variable(s) here
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
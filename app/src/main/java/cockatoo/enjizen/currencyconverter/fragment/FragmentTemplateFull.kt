package cockatoo.enjizen.currencyconverter.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import cockatoo.enjizen.currencyconverter.R


class FragmentTemplateFull : Fragment() {

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

        fun newInstance(): FragmentTemplateFull {
            val fragment = FragmentTemplateFull()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

}

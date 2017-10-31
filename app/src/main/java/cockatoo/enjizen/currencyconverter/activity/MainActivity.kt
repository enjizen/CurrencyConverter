package cockatoo.enjizen.currencyconverter.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import cockatoo.enjizen.currencyconverter.R
import cockatoo.enjizen.currencyconverter.fragment.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                    .add(R.id.contentContainer,MainFragment.newInstance())
                    .commit()
        }

    }
}

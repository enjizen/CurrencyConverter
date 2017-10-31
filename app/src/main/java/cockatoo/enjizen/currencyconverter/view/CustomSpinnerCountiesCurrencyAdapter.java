package cockatoo.enjizen.currencyconverter.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import cockatoo.enjizen.currencyconverter.R;

/**
 * Created by wanchalermyuphasuk on 30/10/2017 AD.
 */

public class CustomSpinnerCountiesCurrencyAdapter extends BaseAdapter {

    private Context context;
    private  int flags[];
    private String[] countries;
    private String[] currency;
    LayoutInflater inflater;

    public CustomSpinnerCountiesCurrencyAdapter(Context applicationContext, int[] flags, String[] countries, String[] currency){
        this.context = applicationContext;
        this.flags = flags;
        this.countries = countries;
        this.currency = currency;

        inflater = LayoutInflater.from(applicationContext);
    }
    @Override
    public int getCount() {
        return flags.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.custom_spinner_items,null);
        ImageView icon = view.findViewById(R.id.imageView);
        TextView  names = view.findViewById(R.id.tv_country_name);
        TextView tvCurrency = view.findViewById(R.id.tv_currency);
        icon.setImageResource(flags[i]);
        names.setText(countries[i]);
        tvCurrency.setText(currency[i]);

        return view;
    }
}

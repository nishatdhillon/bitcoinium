
package com.veken0m.cavirtex.exchanges;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.veken0m.cavirtex.BaseExchangeFragment;
import com.veken0m.cavirtex.R;

public class MtGoxFragment extends BaseExchangeFragment {

    public MtGoxFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.menu_fragment, container, false);
        buildMenu(view, MTGOX, true);
        return view;
    }

}
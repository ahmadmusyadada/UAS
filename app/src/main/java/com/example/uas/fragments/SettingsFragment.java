package com.example.uas.fragments;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import androidx.fragment.app.Fragment;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

import com.example.uas.Application;
import com.example.uas.Preferences;
import com.example.uas.R;

import static android.content.Context.MODE_PRIVATE;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends Fragment {
//    private SharedPreferences preferences;

//    @Override
//    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
//        setPreferencesFromResource(R.xml.preferences, rootKey);
//        preferences = Application.getPreferences();
//        String listValue = preferences.getString("list", null);
//    }

    public SettingsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.radiogroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                SharedPreferences prefs = getSharedPreferences(getContext());
//                SharedPreferences.Editor editor = prefs.edit();

                String colourSelected = "";
                switch (checkedId) {
                    case R.id.radioButton1 :
                        colourSelected = "GREEN";
                        Preferences.setBackgroundColor(getContext(), colourSelected);
                        break;
                    case R.id.radioButton2 :
                        colourSelected = "YELLOW";
                        Preferences.setBackgroundColor(getContext(), colourSelected);
                        break;

                    case R.id.radioButton3 :
                        colourSelected = "BLUE";
                        Preferences.setBackgroundColor(getContext(), colourSelected);
                        break;
                }
            }
        });
        return view;
    }
}

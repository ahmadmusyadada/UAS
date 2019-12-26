package com.example.uas.fragments;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.uas.Preferences;
import com.example.uas.R;
import com.example.uas.activities.LoginActivity;
import com.example.uas.activities.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {
    Button logout;
    TextView backgroundColor, login;

    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        logout = view.findViewById(R.id.button_logout);
        login = view.findViewById(R.id.tv_info_login);
        backgroundColor = view.findViewById(R.id.tv_info_bg_color);

        login.setText(Preferences.getLoggedInUser(getContext()));
        backgroundColor.setText(Preferences.getBackgroundColor(getContext()));

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Preferences.getLoggedInUser(getContext());
                Preferences.clearLoggedInUser(getContext());
//                SharedPreferences preferences = new ;
//                SharedPreferences.Editor editor = preferences.edit();
//                editor.clear();
//                editor.commit();
//                finish();
                startActivity(new Intent(getContext(), LoginActivity.class));getActivity().finish();
            }
        });

        return view;
    }
}
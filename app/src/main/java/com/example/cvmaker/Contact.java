package com.example.cvmaker;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Contact extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_contact, container, false);
        TextView textViewc1 = v.findViewById(R.id.textViewc1);
        TextView textViewc2 = v.findViewById(R.id.textViewc2);
        View textViewc3 = v.findViewById(R.id.textViewc3);
        TextView textViewc4 = v.findViewById(R.id.textViewc4);
        TextView textViewc5 = v.findViewById(R.id.textViewc5);
        TextView textViewc6 = v.findViewById(R.id.textViewc6);
        TextView textViewc7 = v.findViewById(R.id.textViewc7);
        TextView textViewc8 = v.findViewById(R.id.textViewc8);

        EditText email = v.findViewById(R.id.email);
        EditText phonenumber = v.findViewById(R.id.phonenumber);
        EditText socialmedia = v.findViewById(R.id.socialmedia);
        EditText website = v.findViewById(R.id.website);
        EditText profession = v.findViewById(R.id.profession);
        EditText profession1 = v.findViewById(R.id.profession1);

       Button button2 = v.findViewById(R.id.button2);





        return v;
    }
}
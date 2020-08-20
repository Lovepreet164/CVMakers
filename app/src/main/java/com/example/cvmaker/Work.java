package com.example.cvmaker;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Work#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Work extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String Button;
    private String Switch;

    public Work() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Work.
     */
    // TODO: Rename and change types and number of parameters
    public static Work newInstance(String param1, String param2) {
        Work fragment = new Work();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

  /*  @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_work, container, false);
        TextView textViewW1 = v.findViewById(R.id.textViewW1);
        TextView textViewW2 = v.findViewById(R.id.textViewW2);
        TextView textViewW3 = v.findViewById(R.id.textViewW3);
        TextView textViewW4 = v.findViewById(R.id.textViewW4);
        TextView textViewW5 = v.findViewById(R.id.textViewW5);

        EditText company = v.findViewById(R.id.company);
        EditText ComLocated = v.findViewById(R.id.ComLocated);
        EditText Position = v.findViewById(R.id.Position);
        EditText WorkPos = v.findViewById(R.id.WorkPos);
        EditText until = v.findViewById(R.id.until);

        Button button4 = v.findViewById(R.id.button4);
       Switch switch2 = v.findViewById(R.id.switch2);




        return v;
    }
}
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

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Education#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Education extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String Switch;
    private String Button;

    public Education() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Education.
     */
    // TODO: Rename and change types and number of parameters
    public static Education newInstance(String param1, String param2) {
        Education fragment = new Education();
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
        View v =  inflater.inflate(R.layout.fragment_education, container, false);

        TextView textviewt1 = v.findViewById(R.id.textViewT1);
        TextView textviewt2 = v.findViewById(R.id.textViewT2);
        TextView textviewt3 = v.findViewById(R.id.textViewT3);
        TextView textviewt4 = v.findViewById(R.id.textViewT4);
        TextView textviewtW2 = v.findViewById(R.id.textViewW2);

        EditText school =v.findViewById(R.id.school);
        EditText dates = v.findViewById(R.id.dates);
        EditText edittextTo = v.findViewById(R.id.edittextTo);

        Switch switch1 = v.findViewById(R.id.switch1);
        Button button3 = v.findViewById(R.id.button3);




        return  v;
    }


}
package com.usth.group10.githubclient;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link StarredFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link StarredFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StarredFragment extends Fragment {

    public StarredFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_starred, container, false);
    }



}

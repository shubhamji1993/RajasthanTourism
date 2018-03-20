package com.example.shubhamtyagi.rajasthantourism;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link NearbyFragment OnFragment InteractionListener} interface
 * to handle interaction events.
 * Use the {@link NearbyFragment# newInstance} factory method to
 * create an instance of this fragment.
 */
public class NearbyFragment extends Fragment implements View.OnClickListener{

    private RecyclerView mRecyclerView;
    private ImagesAdapter mAdapter;

    private ProgressBar mProgressCircle;

    private DatabaseReference mDataRef;
    private List<Upload> mUploads;

    //TODO:Check It Out
    private View myView;
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = (View) inflater.inflate(R.layout.fragment_nearby, container, false);

        imageView1=(ImageView)myView.findViewById(R.id.hotel_image);
        imageView1.setOnClickListener(this);

        imageView2=(ImageView)myView.findViewById(R.id.adventure_image);
        imageView2.setOnClickListener(this);

        imageView3=(ImageView)myView.findViewById(R.id.hospital_image);
        imageView3.setOnClickListener(this);

        imageView4=(ImageView)myView.findViewById(R.id.market_image);
        imageView4.setOnClickListener(this);



        // Inflate the layout for this fragment
        return myView;


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.hotel_image:
               Intent intent1 = new Intent(getActivity(),HotelsActivity.class);
               startActivity(intent1);
                break;
            case R.id.hospital_image:
                Intent intent2 = new Intent(getActivity(),HospitalActivity.class);
                startActivity(intent2);
                break;
            case R.id.market_image:
                Intent intent3 = new Intent(getActivity(),TraditionalActivity.class);
                startActivity(intent3);
                break;
            case R.id.adventure_image:
                Intent intent4 = new Intent(getActivity(),AdventuresActivity.class);
                startActivity(intent4);
                break;
            default:
                break;
        }
    }
}

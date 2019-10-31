package com.example.noortaskmanger.ui.main;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.noortaskmanger.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import Data.myTask;

/**
 * A simple {@link Fragment} subclass.
 */
public class AllTasksFragment extends Fragment {


    public AllTasksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all_tasks, container, false);
    }

    public void readTaskFromFireBase()
    {
        final FirebaseAuth database=FirebaseAuth.getInstance();//to connect to firebase
        FirebaseAuth auth=FirebaseAuth.getInstance();//to get current Uid
        String uid = auth.getUid();
        DatabaseReference reference=database.getReference();

        reference.child("tasks");
        reference.child(uid);
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot d : dataSnapshot.getChildren()) {
                    myTask t = d.getValue(myTask.class);
                    Log.d("myTask",t.toString());
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

}

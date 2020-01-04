package aldi.krobok.flexiblefragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {


    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.third_fragment, container, false);
    }

    public void onViewCreated (@NonNull View view, @Nullable Bundle sacedInstanceState){
        super.onViewCreated(view, sacedInstanceState);

        ((MainActivity) (getActivity())).getSupportActionBar().setTitle("Fragment Ketiga");
        ((MainActivity) (getActivity())).getSupportActionBar().setSubtitle("third_fragment.xml");
        ((MainActivity) (getActivity())).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setHasOptionsMenu(true);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == android.R.id.home){
            getFragmentManager().popBackStack();
        }
        return super.onOptionsItemSelected(item);
    }

}

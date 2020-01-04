package aldi.krobok.flexiblefragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.second_fragment, container, false);
    }

    public void onViewCreated (@NonNull View view, @Nullable Bundle sacedInstanceState){
        super.onViewCreated(view, sacedInstanceState);

        Button btnSecond = view.findViewById(R.id.secondButton);
        btnSecond.setOnClickListener(this);

        ((MainActivity) (getActivity())).getSupportActionBar().setTitle("Fragment Kedua");
        ((MainActivity) (getActivity())).getSupportActionBar().setSubtitle("second_fragment.xml");
        ((MainActivity) (getActivity())).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setHasOptionsMenu(true);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == android.R.id.home){
            getFragmentManager().popBackStack();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.secondButton) {
            ThirdFragment thirdFragment = new ThirdFragment();
            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager !=null) {
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_content, thirdFragment, ThirdFragment.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        }
    }
}
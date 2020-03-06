package com.huangyuanlove.sunflower_java;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.huangyuanlove.sunflower_java.databinding.FragmentPlantListBinding;

public class PlantListFragment extends Fragment {
    FragmentPlantListBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentPlantListBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}
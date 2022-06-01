package com.juarez.androidgraphql

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.juarez.androidgraphql.databinding.FragmentLaunchListBinding

class LaunchListFragment : Fragment() {
    private lateinit var binding: FragmentLaunchListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLaunchListBinding.inflate(inflater)
        return binding.root
    }
}
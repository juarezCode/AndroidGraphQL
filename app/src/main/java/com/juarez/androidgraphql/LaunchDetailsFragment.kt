package com.juarez.androidgraphql

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.juarez.androidgraphql.databinding.FragmentLaunchDetailsBinding

class LaunchDetailsFragment : Fragment() {

    private lateinit var binding: FragmentLaunchDetailsBinding
//    val :  by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLaunchDetailsBinding.inflate(inflater)

        return binding.root
    }
}
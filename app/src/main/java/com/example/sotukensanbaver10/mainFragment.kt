package com.example.sotukensanbaver10

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sotukensanbaver10.databinding.ActivityMainBinding
import com.example.sotukensanbaver10.databinding.FragmentMainBinding


class mainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.zukanButton.setOnClickListener {
            Navigation.findNavController(it).navigate(
                mainFragmentDirections.actionMainFragmentToZukanFragment2()
            )
        }
        return binding.root
    }
}
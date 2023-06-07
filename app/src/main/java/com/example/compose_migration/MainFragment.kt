package com.example.compose_migration

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.example.compose_migration.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var composeView: ComposeView
    private lateinit var bView: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).also {
            composeView = it
        }


        //bView = FragmentMainBinding.inflate(layoutInflater)
        //return bView.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        composeView.setContent {
            MainFragmentScreen()
        }
    }

}
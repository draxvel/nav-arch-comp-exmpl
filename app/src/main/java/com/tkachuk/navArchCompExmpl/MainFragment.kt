package com.tkachuk.navArchCompExmpl

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        goToProfileBtn.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_profileFragment))

        goToSettingsBtn.setOnClickListener { it.findNavController().navigate(R.id.action_mainFragment_to_settingsFragment) }

    }

}

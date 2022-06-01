package com.example.examenkotlin.fragments

import android.os.Bundle
import android.util.Xml
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.preference.PreferenceFragmentCompat
import com.example.examenkotlin.R

class SettingsFragment : PreferenceFragmentCompat() {

    private lateinit var root : Xml

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        root =
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}
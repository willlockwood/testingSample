package com.willlockwood.takehometemplate.preferences


import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.willlockwood.takehometemplate.R
import com.willlockwood.takehometemplate.activity.MainActivity


class PreferencesFragment : PreferenceFragmentCompat() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireActivity() as MainActivity).toggleNavBarVisibility()
    }

    override fun onDestroy() {
        super.onDestroy()
        (requireActivity() as MainActivity).toggleNavBarVisibility()
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preferences)
    }

    override fun onDisplayPreferenceDialog(preference: Preference?) {

        val preferences = preferenceManager.sharedPreferences

        var dialogFragment: DialogFragment? = null
        if (dialogFragment != null) {
            dialogFragment.setTargetFragment(this, 0)
            dialogFragment.show(fragmentManager!!, "androidx.preference.Preference" + ".PreferenceFragment.DIALOG")
        } else {
            super.onDisplayPreferenceDialog(preference)
        }
    }

}

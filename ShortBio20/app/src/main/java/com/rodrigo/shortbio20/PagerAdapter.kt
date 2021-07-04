package com.rodrigo.shortbio20

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(gerenciador: FragmentManager): FragmentPagerAdapter(gerenciador) {
    override fun getCount(): Int {
        return 4
    }

    override fun getItem(position: Int): Fragment {
        return if (position == 0)
            AboutFragment()
        else if (position == 1)
            EducationFragment()
        else if (position == 2)
            ExperiencesFragment()
        else
            GoalsFragment()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return if (position == 0)
            "Sobre"
        else if (position == 1)
            "Formação"
        else if (position == 2)
            "Experiência"
        else
            "Objetivos"
    }
}
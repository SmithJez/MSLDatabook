package com.felania.monstersuperleaguedatabook.fragments

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.felania.monstersuperleaguedatabook.R

/**
 * Created by Krsnik on 8/15/2017.
 */
class DummyFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val rootView = inflater!!.inflate(R.layout.dummy, container, false)

        return rootView
    }


}
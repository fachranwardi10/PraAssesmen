package com.d3if4201.praassesment


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.d3if4201.praassesment.databinding.FragmentMainBinding

/**
 * A simple [Fragment] subclass.
 */
class Main : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentMainBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_main, container, false)
        binding.apply {
            btnPersegi.setOnClickListener { v: View ->
                v.findNavController().navigate(MainDirections.actionMainToPersegiPanjang())
            }
            btnSegitiga.setOnClickListener { v: View ->
                v.findNavController().navigate(MainDirections.actionMainToSegitiga())
            }
        }
        setHasOptionsMenu(true)
        return binding.root
        // Inflate the layout for this fragment

    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.overflow_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController()) || super.onOptionsItemSelected(item)
    }
}

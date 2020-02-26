package com.d3if4201.praassesment


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.d3if4201.praassesment.databinding.FragmentPersegiPanjangBinding
import kotlin.math.pow
import kotlin.math.sqrt


/**
 * A simple [Fragment] subclass.
 */
class PersegiPanjang : Fragment() {

    private var panjang = 0
    private var lebar = 0
    private var luas = 0
    private var keliling = 0

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentPersegiPanjangBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_persegi_panjang, container, false
        )
        binding.apply {
            panjang = txtPanjang.text.toString().toInt()
            lebar = txtLebar.text.toString().toInt()
            luas = panjang * lebar
            keliling = 2*panjang*lebar
            tvLuas.text = "Luas = $luas"
            tvKeliling.text = "Keliling = $keliling"
        }

        return binding.root

    }


}

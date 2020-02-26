package com.d3if4201.praassesment


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.d3if4201.praassesment.databinding.FragmentSegitigaBinding
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * A simple [Fragment] subclass.
 */
class Segitiga : Fragment() {
    private var alas = 0
    private var tinggi = 0
    private var luas = 0
    private var keliling = 0.0

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentSegitigaBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_segitiga, container, false
        )
        binding.apply {
            btnHitung2.setOnClickListener {
                alas = txtAlas.text.toString().toInt()
                tinggi = txtTinggi.text.toString().toInt()
                luas = 1/2 * alas * tinggi
                keliling = alas + tinggi + sqrt(alas.toDouble().pow(2)+ tinggi.toDouble().pow(2))
                tvLuas2.text = "Luas = $luas"
                tvKeliling2.text = "Keliling = $keliling"
            }
        }
        return binding.root
    }
}

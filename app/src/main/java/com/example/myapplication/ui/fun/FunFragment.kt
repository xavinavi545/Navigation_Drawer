package com.example.myapplication.ui.`fun`


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.FragmentFunBinding


class FunFragment : Fragment() {

    private var _binding: FragmentFunBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val funViewModel =
            ViewModelProvider(this)[FunViewModel::class.java]

        _binding = FragmentFunBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textFun
        funViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
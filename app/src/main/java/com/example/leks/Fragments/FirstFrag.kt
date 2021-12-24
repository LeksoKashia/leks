package com.example.leksus.Frangments

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.leks.R


class FirstFrag : Fragment(R.layout.first_one) {
    private lateinit var buttonAdd : Button
    private lateinit var editTextNote : EditText
    private lateinit var textView : TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sharedPreferances = requireActivity()
            .getSharedPreferences("", MODE_PRIVATE)
        val text = sharedPreferances.getString("leqso", "")
        init()
        textView.text = text
        buttonAdd.setOnClickListener() {
            var note = editTextNote.text.toString()
            var text = textView.text.toString()
            var result = note + "\n" + text
            textView.text = result
            sharedPreferances.edit().putString("leqso", result).apply()
        }


    }
    private fun init(){
        buttonAdd = requireView().findViewById(R.id.buttonAdd)
        editTextNote = requireView().findViewById(R.id.editTextNote)
        textView = requireView().findViewById(R.id.textView)
    }
}
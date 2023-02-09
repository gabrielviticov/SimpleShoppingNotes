package com.projeto.simpleshoppingnotes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.projeto.simpleshoppingnotes.databinding.ActivityListaComprasBinding

class ListaComprasActivity : AppCompatActivity(){

    private val binding by lazy { ActivityListaComprasBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
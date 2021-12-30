package dev.cardoso.quotesmvvm.presentation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import dev.cardoso.quotesmvvm.R
import dev.cardoso.quotesmvvm.databinding.ActivityAgregarBinding
import dev.cardoso.quotesmvvm.domain.UserPreferencesRepository
import dev.cardoso.quotesmvvm.presentation.viewmodel.AddQuoteViewModel


class Add_Fragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_agregar, container, false)


    }

    }

package com.fadhlalhafizh.pathway.app.ui.main.ui.goal.profession

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fadhlalhafizh.pathway.R
import com.fadhlalhafizh.pathway.databinding.FragmentGoalsProfessionBinding

class GoalsProfessionFragment : Fragment() {

    private lateinit var binding: FragmentGoalsProfessionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_goals_profession, container, false)
    }
}
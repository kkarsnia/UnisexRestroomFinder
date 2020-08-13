package com.kkco.unisexrestroomfinder.restroom

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kkco.unisexrestroomfinder.R

class RestroomListFragment : Fragment() {

  companion object {
    fun newInstance() = RestroomListFragment()
  }

  private lateinit var viewModel: RestroomListViewModel

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                            savedInstanceState: Bundle?): View {
    return inflater.inflate(R.layout.fragment_restroom_list, container, false)
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    viewModel = ViewModelProviders.of(this).get(RestroomListViewModel::class.java)
    // TODO: Use the ViewModel
  }
}
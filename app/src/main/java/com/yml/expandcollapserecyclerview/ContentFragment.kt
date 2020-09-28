package com.yml.expandcollapserecyclerview

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_content.*


class ContentFragment : Fragment(R.layout.fragment_content), ExpandCollapseAnimationListener {
    private var expandCollapseViewModel: ExpandCollapseViewModel? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this.activity?.application?.apply {
            expandCollapseViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(this)
                .create(ExpandCollapseViewModel::class.java)
            expandCollapseViewModel?.apply {
                fetchData(requireContext())
            }
        }
        rv_recyclerview.layoutManager = LinearLayoutManager(requireContext())
        rv_recyclerview.itemAnimator = NoFadeItemAnimator()
        expandCollapseViewModel?.liveData?.observe(viewLifecycleOwner, {
            if (rv_recyclerview.adapter == null) {
                rv_recyclerview.adapter = ExpandCollapsibleAdapter(
                    it.uiList,
                    expandCollapseViewModel as OnClick<BaseUiData>,
                    this
                )
            } else {
                rv_recyclerview.adapter.apply {
                    if (this is ExpandCollapsibleAdapter<*>) {
                        this.notifyAdapter(it)
                    }
                }
            }
        })

        expandCollapseViewModel?.fetchData(view.context)
    }

    override fun onExpandableHeaderClicked(
        dataModel: Any,
        pos: Int,
        tag: String,
        viewToBeAnimated: View,
        clickedView: View
    ) {
        expandCollapseViewModel?.updateData(dataModel, pos, requireContext())

    }
}
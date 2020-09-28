package com.yml.expandcollapserecyclerview.viewholder

import android.view.View
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.yml.expandcollapserecyclerview.ExpandCollapseAnimationListener
import com.yml.expandcollapserecyclerview.OnClick
import com.yml.expandcollapserecyclerview.data.ExternalLinkOneUiData
import kotlinx.android.synthetic.main.viewholder_result_external_link_one.view.*

/**
 * ViewHolder class info in loan lookup result only text card ui
 * @param onClick : Item click listener
 */
class ViewHolderResultExternalLinkOne(
    private val view: View,
    onClick: OnClick<ExternalLinkOneUiData>,
    private val expandCollapseAnimationListener: ExpandCollapseAnimationListener?
) :
    RecyclerView.ViewHolder(
        view
    ) {
    fun bindData(
        dataModel: ExternalLinkOneUiData
    ) {
        with(view) {
            tv_description.text = dataModel.content
            tv_title.text = "${dataModel.headerTitle}$adapterPosition"
            btn_one.text = dataModel.buttonOneLabel
            tv_expand_icon.background = dataModel.stateDrawable
            external_link_one_container.isVisible = dataModel.isExpanded
            expandable_header.setOnClickListener {
                expandCollapseAnimationListener?.onExpandableHeaderClicked(
                    dataModel,
                    adapterPosition,
                    "",
                    clickedView = it,
                    viewToBeAnimated = external_link_one_container
                )
            }
        }
    }
}

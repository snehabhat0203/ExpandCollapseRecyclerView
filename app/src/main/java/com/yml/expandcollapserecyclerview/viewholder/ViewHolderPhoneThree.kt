package com.yml.expandcollapserecyclerview.viewholder

import android.view.View
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.yml.expandcollapserecyclerview.ExpandCollapseAnimationListener
import com.yml.expandcollapserecyclerview.OnClick
import com.yml.expandcollapserecyclerview.data.PhoneThreeUiData
import kotlinx.android.synthetic.main.viewholder_result_phone_three.view.*

/**
 * ViewHolder class info in loan lookup result phone type 3 screen
 * @param onClick : Item click listener
 */
class ViewHolderPhoneThree(
    private val view: View,
    onClick: OnClick<PhoneThreeUiData>,
    private val expandCollapseAnimationListener: ExpandCollapseAnimationListener?
) : RecyclerView.ViewHolder(view) {
    fun bindData(dataModel: PhoneThreeUiData) {
        with(view) {
            tv_description.text = dataModel.content
            tv_title.text = "${dataModel.headerTitle}$adapterPosition"
            phoneThreeLink.text = dataModel.linkLabel
            tv_expand_icon.background = dataModel.stateDrawable
            phone_three_content_container.isVisible = dataModel.isExpanded
            expandable_header.setOnClickListener {
                expandCollapseAnimationListener?.onExpandableHeaderClicked(
                    dataModel,
                    adapterPosition,
                    "",
                    clickedView = it,
                    viewToBeAnimated = phone_three_content_container
                )
            }
        }
    }
}

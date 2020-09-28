package com.yml.expandcollapserecyclerview.viewholder

import android.view.View
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.yml.expandcollapserecyclerview.ExpandCollapseAnimationListener
import com.yml.expandcollapserecyclerview.OnClick
import com.yml.expandcollapserecyclerview.data.PhoneTwoUiData
import kotlinx.android.synthetic.main.viewholder_result_phone_two.view.*

/**
 * ViewHolder class info in loan lookup result phone type 2 screen
 * @param onClick : Item click listener
 */
class ViewHolderPhoneTwo(
    private val view: View,
    onClick: OnClick<PhoneTwoUiData>,
    private val expandCollapseAnimationListener: ExpandCollapseAnimationListener?
) :
    RecyclerView.ViewHolder(view) {
    fun bindData(dataModel: PhoneTwoUiData) {
        with(view) {
            tv_description.text = dataModel.content
            tv_title.text = "${dataModel.headerTitle}$adapterPosition"
            btn_two.text = dataModel.buttonTwoLabel
            tv_expand_icon.background = dataModel.stateDrawable
            btn_one.text = dataModel.buttonOneLabel
            phone_two_content_container.isVisible = dataModel.isExpanded
            expandable_header.setOnClickListener {
                expandCollapseAnimationListener?.onExpandableHeaderClicked(
                    dataModel,
                    adapterPosition,
                    "",
                    clickedView = it,
                    viewToBeAnimated = phone_two_content_container
                )
            }
        }
    }
}

package com.example.ebay.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ebay.R
import com.example.ebay.model.Deals
import com.example.ebay.model.Favorite

class DealsAdapter(var context: Context, var items:ArrayList<Deals>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed_deals, parent, false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if (holder is StoryViewHolder){
            var tv_title = holder.tv_title
            var tv_price = holder.tv_price
            var tv_real_price = holder.tv_real_price
            var tv_percent_off = holder.tv_percent_off
            var iv_image = holder.iv_image

            iv_image.setImageResource(item.imageView)
            tv_title.text = item.title
            tv_price.text = item.tv_price
            tv_real_price.text = item.tv_real_price
            tv_percent_off.text = item.tv_percent_off
        }
    }


    class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var iv_image : ImageView = view.findViewById(R.id.ic_image)
        var tv_title : TextView = view.findViewById(R.id.tv_title)
        var tv_price : TextView = view.findViewById(R.id.tv_price)
        var tv_real_price : TextView = view.findViewById(R.id.tv_real_price)
        var tv_percent_off : TextView = view.findViewById(R.id.tv_percent_off)
    }

}
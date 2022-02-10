package com.example.ebay.activity

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ebay.R
import com.example.ebay.adapter.DealsAdapter
import com.example.ebay.adapter.FavouriteAdapter
import com.example.ebay.model.Deals
import com.example.ebay.model.Favorite


class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var recyclerview: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerview = findViewById(R.id.recyclerViewDeals)
        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val managerDeals = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.setLayoutManager(manager)
        refreshAdapter(getFavorites())
        recyclerview.setLayoutManager(managerDeals)
        refreshAdapterDeals(getDeals())
    }

    private fun refreshAdapter(items: ArrayList<Favorite>) {
        val adapter = FavouriteAdapter(this, items)
        recyclerView!!.adapter = adapter

    }
    private fun refreshAdapterDeals(items: ArrayList<Deals>) {
        val adapter = DealsAdapter(this, items)
        recyclerview!!.adapter = adapter
    }
    private fun getDeals(): ArrayList<Deals> {
        val items: ArrayList<Deals> = ArrayList()
        items.add(Deals( R.drawable.im_earbuds,"Bose Quiet Comfort Earbuds","$199.00","$279.00","• 29% OFF"))
        items.add(Deals( R.drawable.im_headphones,"AKG Y500 Wireless Bluetooth On-Ear Headphones With Uri...","$39.33","$149.95","• 73% OFF"))
        items.add(Deals( R.drawable.im_mac,"Apple MacBook Pro 14-inch -Space Grey","1,999","$3290.00","• 29% OFF"))
       items.add(Deals( R.drawable.im_earbuds,"Bose Quiet Comfort Earbuds","$199.00","$279.00","• 29% OFF"))
        items.add(Deals( R.drawable.im_headphones,"AKG Y500 Wireless Bluetooth On-Ear Headphones With Uri...","$39.33","$149.95","• 73% OFF"))
        items.add(Deals( R.drawable.im_mac,"Apple MacBook Pro 14-inch -Space Grey","1,999","$3290.00","• 29% OFF"))
       items.add(Deals( R.drawable.im_earbuds,"Bose Quiet Comfort Earbuds","$199.00","$279.00","• 29% OFF"))
        items.add(Deals( R.drawable.im_headphones,"AKG Y500 Wireless Bluetooth On-Ear Headphones With Uri...","$39.33","$149.95","• 73% OFF"))
        items.add(Deals( R.drawable.im_mac,"Apple MacBook Pro 14-inch -Space Grey","1,999","$3290.00","• 29% OFF"))

        return items
    }

    private fun getFavorites(): ArrayList<Favorite> {

        val items: ArrayList<Favorite> = ArrayList()
        items.add(Favorite("Apple Watch", R.drawable.im_watch))
        items.add(Favorite("Apple Watch", R.drawable.im_watch))
        items.add(Favorite("Apple Watch", R.drawable.im_watch))
        items.add(Favorite("Apple Watch", R.drawable.im_watch))
        items.add(Favorite("Apple Watch", R.drawable.im_watch))
        items.add(Favorite("Apple Watch", R.drawable.im_watch))
        items.add(Favorite("Apple Watch", R.drawable.im_watch))
        items.add(Favorite("Apple Watch", R.drawable.im_watch))
        items.add(Favorite("Apple Watch", R.drawable.im_watch))
        return items

    }
}

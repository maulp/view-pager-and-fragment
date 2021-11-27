package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_myfriend.*

class MyFriendsFragment :Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman = ArrayList()
        listTeman.add(MyFriend("Mau", "Laki-Laki", "Mau@stimata.ac.id",
            "080808080808", "Bogor"))
        listTeman.add(MyFriend("Maulana Prayoga", "Laki-Laki", "maulanaprayoga@stimata.ac.id",
        "08989739407", "Jakarta"))
        listTeman.add(MyFriend("Maulana", "Laki-Laki", "Maulana@stimata.ac.id",
        "08943782827", "Tokyo"))
        listTeman.add(MyFriend("Prayoga", "Laki-Laki", "prayoga@stimata.ac.id",
        "08798798739", "Amsterdam"))
        listTeman.add(MyFriend("Yoga", "Laki-Laki", "yoga@stimata.ac.id",
        "08439879292", "London"))
    }

    private fun tampilTeman(){
        rv_listMyFriends.layoutManager = LinearLayoutManager(activity)
        rv_listMyFriends.adapter = MyFriendAdapter(requireActivity(), listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_myfriend, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}
package com.example.pract3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var  recyclerView : RecyclerView?=null;
    private var butterflyList: ArrayList<Butterfly>?=null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView);
        var adapter = ButterflyAdedpter(this, butterflyList);
        this.recyclerView!!.adapter = adapter


    }
    fun initializeData(){
        butterflyList = ArrayList()
        butterflyList!!.add(Butterfly("Голубянка", "but", 1213))
        butterflyList!!.add(Butterfly("Пестокрылица", "but1", 455));
        butterflyList!!.add(Butterfly("Павлиний галз", "but2", 5354));

    }
}
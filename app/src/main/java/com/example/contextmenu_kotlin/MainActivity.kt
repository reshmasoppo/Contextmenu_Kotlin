package com.example.contextmenu_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    lateinit var listView: ListView

val contact= arrayOf<String>("Akash","Vikash","John","Rahul","Ajay")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView=findViewById<ListView>(R.id.list)

     val arrayadapter:ArrayAdapter<String> = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,contact)
        listView.adapter = arrayadapter
        registerForContextMenu(listView)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?)
    {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater =menuInflater
        inflater.inflate(R.menu.menu,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when(item!!.itemId) {
            R.id.call -> {
                Toast.makeText(applicationContext, "call code", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.sms -> {
                Toast.makeText(applicationContext, "sms code", Toast.LENGTH_LONG).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)


        }}
        }

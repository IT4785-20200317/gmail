package com.example.mail2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf<ItemModel>(
            ItemModel("Alice", "Lorem ipsum dolor", "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.", "2:30 PM"),
            ItemModel("Bob", "Vestibulum sollicitudin", "Sed in purus ut ante feugiat ultricies. Nullam non nunc nec lacus interdum lacinia.", "10:00 AM"),
            ItemModel("Catherine", "Ut convallis purus", "Duis at ex nec elit bibendum bibendum. Curabitur in magna vel lacus cursus hendrerit.", "3:45 PM"),
            ItemModel("David", "Suspendisse potenti", "Nam vel elit vel tortor accumsan rhoncus. Fusce auctor odio nec neque auctor, ac euismod est lacinia.", "9:15 AM"),
            ItemModel("Eva", "Integer sit amet", "Vestibulum in erat quis sem dapibus tincidunt. Sed eu mauris id elit bibendum laoreet nec nec leo.", "5:30 PM"),
            ItemModel("Frank", "Quisque vulputate", "Nunc vel sem eu ipsum auctor imperdiet. Sed eu dui ac purus dictum ultricies.", "1:20 PM"),
            ItemModel("Grace", "Pellentesque euismod", "Nulla facilisi. Sed euismod dui vel justo eleifend, id volutpat dui facilisis.", "8:10 AM"),
            ItemModel("Henry", "Cras congue", "Vivamus ut mauris vel quam varius semper ut vel quam. Sed vel lacus non dui efficitur ullamcorper.", "12:50 PM"),
            ItemModel("Isabel", "Aliquam erat volutpat", "Pellentesque sed sem at ligula tempus euismod. Sed ut odio vitae dui suscipit auctor.", "7:05 AM"),
            ItemModel("Jack", "Maecenas consequat", "Praesent ut ligula in felis volutpat laoreet. Quisque interdum felis at odio tincidunt, non commodo dui interdum.", "4:00 PM")
        )

        findViewById<ListView>(R.id.listView).adapter = ItemAdapter(items)
    }
}

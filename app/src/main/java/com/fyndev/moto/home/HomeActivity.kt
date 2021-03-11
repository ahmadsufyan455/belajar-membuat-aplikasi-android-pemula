package com.fyndev.moto.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.fyndev.moto.adapter.MotorAdapter
import com.fyndev.moto.data.DataMotor
import com.fyndev.moto.data.Motor
import com.fyndev.moto.databinding.ActivityHomeBinding
import com.fyndev.moto.profile.ProfileActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val motorAdapter = MotorAdapter(DataMotor.getDataMotor() as ArrayList<Motor>)

        with(binding.rvMoto) {
            layoutManager = LinearLayoutManager(this@HomeActivity)
            setHasFixedSize(true)
            adapter = motorAdapter
            motorAdapter.notifyDataSetChanged()
        }

        binding.search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(query: String?): Boolean {
                motorAdapter.filter.filter(query)
                return false
            }

        })

        binding.icPerson.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}
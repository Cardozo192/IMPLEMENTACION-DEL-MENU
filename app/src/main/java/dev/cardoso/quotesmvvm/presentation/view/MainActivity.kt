package dev.cardoso.quotesmvvm.presentation.view


import android.os.Bundle

import android.view.MenuItem

import androidx.appcompat.app.ActionBarDrawerToggle

import androidx.appcompat.app.AppCompatActivity

import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.google.android.material.navigation.NavigationView

import dev.cardoso.quotesmvvm.R

import dev.cardoso.quotesmvvm.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.contain_main.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val toogle= ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.open,R.string.close)
        toogle.isDrawerIndicatorEnabled=true
        drawerLayout.addDrawerListener(toogle)
        toogle.syncState()

        nav_menu.setNavigationItemSelectedListener(this)

        setToolbarTitle("Home")
        changeFragment(Home_Fragment())
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        drawerLayout.closeDrawer(GravityCompat.START)
        when(item.itemId){
            R.id.Home ->{
                setToolbarTitle("Home")
                changeFragment(Home_Fragment())
            }
            R.id.Add ->{
                setToolbarTitle("Add")
                changeFragment(Add_Fragment())
            }
            R.id.Edit ->{
            setToolbarTitle("edit")
            changeFragment(Edit_Fragment())
        }

        }
        return true

    }

    fun setToolbarTitle(title:String){
        supportActionBar?.title=title
    }

    fun changeFragment(frag:Fragment){

        val fragment= supportFragmentManager.beginTransaction()
        fragment.replace(R.id.fragment_container,frag).commit()

    }

}





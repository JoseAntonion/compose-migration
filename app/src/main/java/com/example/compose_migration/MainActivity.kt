package com.example.compose_migration

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.compose_migration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainFragment: MainFragment
    private lateinit var bView: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bView = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bView.root)

        // Metodo Fragment
        mainFragment = MainFragment()
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container_view, mainFragment)
                .commitAllowingStateLoss()
        }

        // Metodo 2 requiere (androidx.activity:activity-compose:$latestVersion)
        /*setContent {
            MaterialTheme {
                MainScreen()
            }
        }*/

        // Metodo 1
        /*bView = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bView.root)
        bView.composeView.setContent {
            MaterialTheme{
                MainScreen()
            }
        }*/
    }
}
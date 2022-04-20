package fi.centria.tki.lessonfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val fragment: FirstFragment = FirstFragment()
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.top_fragment, fragment)
        }*/
    }
}
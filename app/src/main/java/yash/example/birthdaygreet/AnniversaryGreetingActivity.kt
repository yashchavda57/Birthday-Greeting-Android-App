package yash.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_anniversary_greeting.*
import kotlinx.android.synthetic.main.activity_main.*

class AnniversaryGreetingActivity : AppCompatActivity() {
   
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anniversary_greeting)

        val name = intent.getStringExtra("name")
        anniGreeting.text = "Happy Anniversary\n $name!"
    }
}
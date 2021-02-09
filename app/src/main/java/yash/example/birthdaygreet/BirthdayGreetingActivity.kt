package yash.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.jvm.java as java

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)
        birthdayGreeting.text = "Happy Birthday\n$name!"

    }

    fun createActivityCard(view: View) {
        val name = intent.getStringExtra(NAME_EXTRA)
        val intent = Intent(this,AnniversaryGreetingActivity::class.java)
        intent.putExtra("name",name)
        startActivity(intent)

    }
}
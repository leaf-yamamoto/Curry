package app.yamamoto.leaf.curry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val people = arrayOf<String>("おっちー","まっすー", "しんぺー", "おんじ")
    val food = arrayOf<String>("かれー", "みそしる", "ちゃーはん", "えびちり", "ぎょうざ", "やきじゃけ")


    fun serveFood () {

        val randomName = Random
        val index = randomName.nextInt(4)
        val name = people[index]
        nameTextView.text = name + "に"

        foodTextView.text = food[Random.nextInt(6)] + "を"

        if (Random.nextInt(100)<50){
            verbTextView.text = "よそえました^^"
            verbTextView.setTextSize(24F)
        } else {
            verbTextView.text = "よそえませんでした！"
            verbTextView.setTextSize(32F)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            serveFood()
        }
    }


}
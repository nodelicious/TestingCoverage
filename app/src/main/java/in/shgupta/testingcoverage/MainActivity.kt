package `in`.shgupta.testingcoverage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btncalc.setOnClickListener({
            tvresult.text= calcfare(etkm.text.toString().toFloat(),etmin.text.toString().toInt()).toString()
        })
    }

    companion object {
        fun calcfare(km: Float,min:Int ):Float =
                50f+(if(km>5)((km-5)*12)else 0f)+(if(min>15)(min-15)else 0)

    }
}

package ekta.com.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private var etInput: EditText? = null
    private var tvOutput: TextView? = null
    private var btn: Button? = null
    private var string : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents();
    }

    private fun initComponents() {
        etInput = findViewById(R.id.etInput)
        tvOutput = findViewById(R.id.tvOutput)
        btn = findViewById<Button>(R.id.btn) as Button

        btn?.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view!= null) {
            when(view.id){
             R.id.btn -> {tvOutput?.setText(etInput?.text.toString())}

            }
        }
    }
}

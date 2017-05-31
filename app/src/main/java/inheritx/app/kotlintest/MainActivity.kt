package inheritx.app.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

open class MainActivity : AppCompatActivity(), View.OnClickListener {


    private var mEdittextFirstItem: EditText? = null
    private var mEdittextSecondItem: EditText? = null
    private var btnTotal: Button? = null
    private var txtDisplayTotal: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        init()
        setOnClicks()

    }


    fun init() {


        mEdittextFirstItem = findViewById(R.id.edtFirstItem) as EditText
        mEdittextSecondItem = findViewById(R.id.edtSecondItems) as EditText

        btnTotal = findViewById(R.id.buttonTotl) as Button
        txtDisplayTotal = findViewById(R.id.txtDisplyTotal) as TextView
    }

    private fun setOnClicks() {


        btnTotal!!.setOnClickListener(this)
        txtDisplayTotal!!.setOnClickListener(this)


    }

    override fun onClick(view: View?) {

        when(view){

            btnTotal -> getTotal(mEdittextFirstItem!!.text.toString() ,mEdittextSecondItem!!.text.toString())
            txtDisplayTotal -> getTotalTest()


        }

    }

    private fun getTotal(itemOne: String ,itemTwo: String ) {

        Log.e("Get total", (itemOne + itemTwo) )
        txtDisplayTotal!!.setText((itemOne + itemTwo))
    }

    private fun getTotalTest(){

        Log.e("Get total", "This is for test" )
        Toast.makeText(this ,"This is for test", Toast.LENGTH_SHORT).show()
    }
}

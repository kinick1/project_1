package kr.ac.wku.project_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import kr.ac.wku.project_1.data.product
import kr.ac.wku.project_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private lateinit var editTextProductName: EditText
    private lateinit var editTextPurchaseDate: EditText
    private lateinit var editTextExpirationDate: EditText
    private lateinit var buttonSave: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        editTextProductName = findViewById(R.id.edtProductName)
        editTextPurchaseDate = findViewById(R.id.edtPurchaseDate)
        editTextExpirationDate = findViewById(R.id.edtExpirationDate)
        buttonSave = findViewById(R.id.btnSave)

        buttonSave.setOnClickListener {
            saveProduct()
        }
    }
        private fun saveProduct() {
            val productName = editTextProductName.text.toString()
            val purchaseDate = editTextPurchaseDate.text.toString()
            val expirationDate = editTextExpirationDate.text.toString()

            val product = product(productName, purchaseDate, expirationDate)
        }
}
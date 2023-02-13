package com.example.pawsplanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var dialogBuilder : AlertDialog.Builder
    lateinit var dialog : AlertDialog
    lateinit var newPetPopupName : EditText; lateinit var newPetPopupType : EditText;
    lateinit var newPetPopupAge : EditText
    lateinit var newPetPopupCancel : Button; lateinit var newPetPopupSave : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Listener for add pet button
        findViewById<Button>(R.id.buttonPetAdd).setOnClickListener {
            createNewPetPopup()
        }

        // TODO: Load pets from database
        // TODO: Remove pet functionality
    }

    fun createNewPetPopup() {
        dialogBuilder = AlertDialog.Builder(this)
        val view = layoutInflater.inflate(R.layout.new_pet_popup, null)
        newPetPopupName = view.findViewById(R.id.newPetPopupName)
        newPetPopupType = view.findViewById(R.id.newPetPopupType)
        newPetPopupAge = view.findViewById(R.id.newPetPopupAge)
        newPetPopupCancel = view.findViewById(R.id.newPetPopupCancel)
        newPetPopupSave = view.findViewById(R.id.newPetPopupSave)

        dialogBuilder.setView(view)
        dialog = dialogBuilder.create()
        dialog.show()

        // Listener for save button
        newPetPopupSave.setOnClickListener {
            // Save pet to database
            // TODO: Save pet to database
            // Close popup
            dialog.dismiss()
        }
        // Listener for cancel button
        newPetPopupCancel.setOnClickListener {
            // Close popup
            dialog.dismiss()
        }
    }
}
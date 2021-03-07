package com.example.jetpackcomposenavigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Fragment one",
                        style = TextStyle(
                            color = Color.DarkGray,
                            fontSize = 18.sp
                        )
                    )

                    Spacer(modifier = Modifier.padding(8.dp))

                    Button(
                        onClick = {
                            findNavController().navigate(R.id.action_fragmentOne_to_fragmentTwo)
                        }
                    ){
                        Text(text = "Navigate To Fragment Two")
                    }

                }
            }
        }
    }
}
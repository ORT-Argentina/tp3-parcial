package com.example.appbase.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.example.appbase.R

/*import com.example.appbase.viewmodel.Fragment1ViewModel
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController*/


class Fragment1 : Fragment() {

    private lateinit var view1 : View
/*private lateinit var viewModel: Fragment1ViewModel*/
    lateinit var txtName: TextView
    lateinit var txtInput: EditText


override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

}

override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {
    // Inflate the layout for this fragment
    view1 = inflater.inflate(R.layout.fragment_1, container, false)

    txtName = view1.findViewById(R.id.txtName)
    txtInput = view1.findViewById(R.id.txtinput)

    return view1
}

/*    override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)

    viewModel = ViewModelProvider(requireActivity()).get(Fragment1ViewModel::class.java)

    viewModel.name.observe(viewLifecycleOwner, Observer{ result ->
        txtName.text = result.toString()

    })
    txtInput.setText(viewModel.name.value)
}*/

override fun onStart() {
    super.onStart()

    /*btnChange.setOnClickListener {
        val action2 = Fragment1Directions.actionFragment1ToFragment2();
        v.findNavController().navigate(action2)
        viewModel.changeName()
    }*/

}
}
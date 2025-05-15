package com.github.rongi.rotate_layout.example;

import android.app.Activity;
import android.os.Bundle;

import com.github.rongi.rotate_layout.example.databinding.ActivityMainBinding;
import com.github.rongi.rotate_layout.layout.RotateLayout;

public class MainActivity extends Activity {

    private ActivityMainBinding binding;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
		setContentView(binding.getRoot());

        binding.form1Container.setOnClickListener(v -> {
            onForm1ContainerClick(binding.form1Container);
        });
        binding.form2Container.setOnClickListener(v -> {
            onForm1ContainerClick(binding.form2Container);
        });
        binding.form2Container.setOnClickListener(v -> {
            onForm1ContainerClick(binding.form2Container);
        });
	}

	/**
	 * Clicking on a form will rotate it
	 */
	void onForm1ContainerClick(RotateLayout rotateLayout) {
		int newAngle = rotateLayout.getAngle() + 90;
		rotateLayout.setAngle(newAngle);
	}

}

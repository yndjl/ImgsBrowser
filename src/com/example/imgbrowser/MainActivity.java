package com.example.imgbrowser;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	int index = 2;

	public void fun(View view) {

		ImageView showimage = (ImageView) findViewById(R.id.imageView1);
		int[] img = { R.drawable.m1, R.drawable.m2, R.drawable.m3,
				R.drawable.m4, R.drawable.m5 };
		int id = view.getId();
		if (id == R.id.left_btn) {
			System.out.println("left");
			showimage.setImageResource(img[index]);
			if (index == 0)
				index = 5;
			index--;
		} else if (id == R.id.right_btn) {
			System.out.println("right");
			showimage.setImageResource(img[index]);
			if (index == 4)
				index = -1;
			index++;
		}
		// public void fun1(View view){
		// ImageView show=findViewById(R.id.imageView1);
		// int[] imgs={
		// R.drawable.m1,R.drawable.m2,R.drawable.m3
		// };
		// int ID=view.getId();
		// if(ID==R.id.left_btn){
		// show.setImageResource(imgs[a]);
		// }else if{
		//
		// }
		// }
	}

}

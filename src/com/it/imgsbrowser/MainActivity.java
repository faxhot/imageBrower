package com.it.imgsbrowser;

import java.util.Random;

import com.it.imgsbrowser.R.drawable;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	int jian = 4;
	int jia = 0;

	int index = 3;

	public void ToFun(View view) {
		int[] imgIds = { R.drawable.pic0, R.drawable.pic1, R.drawable.pic2,
				R.drawable.pic3, R.drawable.pic4 };
		ImageView imgV = (ImageView) findViewById(R.id.show_iv);

		// if (view.getId() == R.id.xiangzuo_btn) {
		// System.out.println("left");
		// imgV.setImageResource(imgIds[index]);
		// if (index == 0)
		// index = 5;
		// index--;
		// } else if (view.getId() == R.id.xiangyou_btn) {
		// System.out.println("right");
		// imgV.setImageResource(imgIds[index]);
		//
		// if (index == 4)
		// index = -1;
		// index++;
		// }

		if (view.getId() == R.id.xiangzuo_btn) {
			// Toast.makeText(this, "Ïò×ó", 1).show();
			imgV.setImageResource(imgIds[jian]);
			view.setBackgroundResource(imgIds[jian]);
			jian--;
			if (jian == -1) {
				jia = jian + 2;
				jian = 4;
			} else if (jian == 3) {
				jia = 0;
				jian = 3;
			} else {
				jia = jian + 2;
			}

		} else if (view.getId() == R.id.xiangyou_btn) {
			// Toast.makeText(this, "ÏòÓÒ", 1).show();
			imgV.setImageResource(imgIds[jia]);
			view.setBackgroundResource(imgIds[jia]);
			jia++;
			if (jia == 5) {
				jian = jia - 2;
				jia = 0;
			} else if (jia == 1) {
				jian = 4;
			} else {
				jian = jia - 2;
			}
		}
	}

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

}

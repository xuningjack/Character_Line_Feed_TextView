package com.example.mtextview;

import com.example.android_pra.R;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ImageSpan;
import android.widget.TextView;

public class MainActivity extends Activity {

	private MTextView mTextView;
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		mTextView = (MTextView) this.findViewById(R.id.mtextview);
		textView = (TextView) this.findViewById(R.id.textview);
		test();
		testNormal();
	}

	private void test() {
		mTextView.setBackgroundColor(Color.GREEN);
		String source = "撒反对飞王瑞芳芳vfxdsdf司法所我日xunignjackisverygood太地方个的服务4个的服务34太过分的电饭锅电饭锅打come on baby三国杀个的服务34太过分的电饭锅电饭锅打三国杀太过分的电饭锅电饭锅打三国杀水电费歌曲筒袜上课5乳房炎啊啊。";
		mTextView.setMText(source);
		mTextView.setTextSize(20);
		mTextView.setTextColor(Color.BLACK);
		mTextView.invalidate();
	}

	private void testNormal() {
		textView.setBackgroundColor(Color.BLUE);
		String source = "撒反对飞王瑞芳芳vfxdsdf司法所我日xunignjackisverygood太地方个的服务4个的服务34太过分的电饭锅电饭锅打come on baby三国杀个的服务34太过分的电饭锅电饭锅打三国杀太过分的电饭锅电饭锅打三国杀水电费歌曲筒袜上课5乳房炎啊啊。";
		textView.setText(source);
		textView.setTextSize(20);
		textView.setTextColor(Color.BLACK);
	}
}

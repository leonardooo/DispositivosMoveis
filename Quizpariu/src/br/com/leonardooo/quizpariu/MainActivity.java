package br.com.leonardooo.quizpariu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	
	private OnClickListener onClick = new OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent( MainActivity.this, Quiz2Activity.class );
			startActivity(intent);
		}
	};
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button botao = (Button) findViewById(R.id.quiz1botao1);
        botao.setOnClickListener(onClick);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

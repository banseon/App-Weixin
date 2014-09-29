package cn.afeng.myweixin;

import cn.afeng.myweixin.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class InfoAFeng extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_afeng);              
    }

   public void btn_back(View v) {     //标题栏 返回按钮
      	this.finish();
      } 
   public void btn_back_send(View v) {     //标题栏 返回按钮
     	this.finish();
     } 
   public void head_xiaohei(View v) {     //头像按钮
	   Intent intent = new Intent();
		intent.setClass(InfoAFeng.this,InfoAFengHead.class);
		startActivity(intent);
    } 
    
}

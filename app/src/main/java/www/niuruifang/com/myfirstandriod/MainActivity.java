package www.niuruifang.com.myfirstandriod;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //给按钮设置点击侦听
        //1.拿到按钮对象
        Button bt = (Button) findViewById(R.id.bt_call);
        bt.setOnClickListener(new Mylistener());
    }

    class  Mylistener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            //获取用户输入的电话号
            EditText editText = (EditText) findViewById(R.id.et_phone);
            String phone = editText.getText().toString();

            //设置容器存放时间
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:"+phone));

            //打电话
            startActivity(intent);


        }
    }

}

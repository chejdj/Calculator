package com.example.calculator;

//import com.example.calculator.MainActivity.mylistener;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	private TextView text_01 = null;
	//private EditText text_o2 = null;
	private Button one= null ;
	private Button two = null;
	private Button three=null;
	private Button four=null;
	private Button five=null;
	private Button six=null;
	private Button seven=null;
	private Button eight=null;
	private Button nine=null;
	private Button ling=null;
	private Button c=null;
	private Button chengyu=null;
	private Button qinchu1=null;
	private Button chuyu=null;
	private Button houtui=null;
	private Button result=null;
	private Button kuohao=null;
	private Button jiafa=null;
	private Button jianfa=null;
	private Button dian=null;
	boolean clickdeng = false;
	double num1=0,num2=0,endresult=0;
	int op=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 getSupportActionBar().hide();
		 text_01=(TextView)findViewById(R.id.text_02);
		 c=(Button)findViewById(R.id.guohao);
	     one=(Button)findViewById(R.id.yi);
	     dian=(Button)findViewById(R.id.dian);
	     two=(Button)findViewById(R.id.er);
	     three=(Button)findViewById(R.id.shan);
	     four=(Button)findViewById(R.id.si);
	     five=(Button)findViewById(R.id.wu);
	     six=(Button)findViewById(R.id.liu);
	     seven=(Button)findViewById(R.id.qi);
	     eight=(Button)findViewById(R.id.ba);
	     nine=(Button)findViewById(R.id.jiu);
	     ling=(Button)findViewById(R.id.ling);
	     chengyu = (Button)findViewById(R.id.chengyu);
	     chuyu =(Button)findViewById(R.id.chuyu);
	     jiafa = (Button)findViewById(R.id.jia);
	     jianfa=(Button)findViewById(R.id.jian);
	     result = (Button)findViewById(R.id.dengyu);
	     houtui = (Button)findViewById(R.id.houtui);
	     qinchu1 = (Button)findViewById(R.id.qinchu);
	     text_01.setText(null);
	     dian.setOnClickListener(new mylistener());
	     qinchu1.setOnClickListener(new mylistener());
	       one.setOnClickListener(new mylistener());
	       two.setOnClickListener(new mylistener());
	        three.setOnClickListener(new mylistener());
	        four.setOnClickListener(new mylistener());
	        five.setOnClickListener(new mylistener());
	        six.setOnClickListener(new mylistener());
	        seven.setOnClickListener(new mylistener());
	        eight.setOnClickListener(new mylistener());
	        nine.setOnClickListener(new mylistener());
	        ling.setOnClickListener(new mylistener());
	        jiafa.setOnClickListener(new mylistener());
	        chengyu.setOnClickListener(new mylistener());
	        houtui.setOnClickListener(new mylistener());
	        result.setOnClickListener(new mylistener());
	        chuyu.setOnClickListener(new mylistener());
	        jianfa.setOnClickListener(new mylistener());
	        c.setOnClickListener(new mylistener());
		}

	class mylistener implements OnClickListener{
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			switch(arg0.getId()){
			case R.id.yi:
				if(clickdeng){
					text_01.setText(null);
					clickdeng=false;
				}
				String myString1 = text_01.getText().toString();
				myString1 +="1";
				text_01.setText(myString1);
				break;
		case R.id.er:
			if(clickdeng){
				text_01.setText(null);
				clickdeng=false;
			}
			String myString2 = text_01.getText().toString();
			myString2 +="2";
			text_01.setText(myString2);
			break;
		case R.id.shan:
			if(clickdeng){
				text_01.setText(null);
				clickdeng=false;
			}
			String myString3 = text_01.getText().toString();
			myString3 +="3";
			text_01.setText(myString3);
			break;
		case R.id.si:
			if(clickdeng){
				text_01.setText(null);
				clickdeng=false;
			}
			String myString4 = text_01.getText().toString();
			myString4 +="4";
			text_01.setText(myString4);
			break;
		case R.id.wu:
			if(clickdeng){
				text_01.setText(null);
				clickdeng=false;
			}
			String myString5 = text_01.getText().toString();
			myString5 +="5";
			text_01.setText(myString5);
			break;
		case R.id.liu:
			if(clickdeng){
				text_01.setText(null);
				clickdeng=false;
			}
			String myString6 = text_01.getText().toString();
			myString6 +="6";
			text_01.setText(myString6);
			break;
		case R.id.qi:
			if(clickdeng){
				text_01.setText(null);
				clickdeng=false;
			}
			String myString7 = text_01.getText().toString();
			myString7 +="7";
			text_01.setText(myString7);
			break;
		case R.id.ba:
			if(clickdeng){
				text_01.setText(null);
				clickdeng=false;
			}
			String myString8 = text_01.getText().toString();
			myString8 +="8";
			text_01.setText(myString8);
			break;
		case R.id.jiu:
			if(clickdeng){
				text_01.setText(null);
				clickdeng=false;
			}
			String myString9 = text_01.getText().toString();
			myString9 +="9";
			text_01.setText(myString9);
			break;
		case R.id.ling:
			if(clickdeng){
				text_01.setText(null);
				clickdeng=false;
			}
			String myString0= text_01.getText().toString();
			myString0 +="0";
			text_01.setText(myString0);
			break;
		case R.id.houtui:
			String mystr = text_01.getText().toString();
			try{
				text_01.setText(mystr.substring(0,mystr.length()-1));
			}catch(Exception e){
				text_01.setText("");
			}
			break;
		case R.id.qinchu:
			text_01.setText(null);
			num1=0;
			num2=0;
			op=0;
			endresult=0;
			break;
		case R.id.jia:
			String myStringadd=text_01.getText().toString();
				if(myStringadd.equals("")){
					System.out.println("jia2");
					text_01.setText("²Ù×÷Ê§Îó");
					num1=0;
					num2=0;
					op=0;
					endresult=0;
					clickdeng=false;
					break;
				}
				else{
			    switch(op){
				case 1:
					num1 = num1 +Double.valueOf(myStringadd);
					break;
				case 2:
					num1 = num1-Double.valueOf(myStringadd);
					break;
				case 3:
					num1 = num1*Double.valueOf(myStringadd);
					break;
				case 4:
					num1 = num1/Double.valueOf(myStringadd);
					break;
					default:
						num1 = Double.valueOf(myStringadd);
						break;
				}
			    text_01.setText(null);
				op=1;
				clickdeng=false;
				break;
				}
		case R.id.dian:
			if(clickdeng){
				text_01.setText(null);
				clickdeng=false;
			}
			String myStringdian= text_01.getText().toString();
			myStringdian +=".";
			text_01.setText(myStringdian);
			break;
		case R.id.jian:
			String myStringjian=text_01.getText().toString();
				//num1 = num1 - Double.valueOf(myStringjian);
			    if(myStringjian.equals("")){
			    	text_01.setText("²Ù×÷Ê§Îó");
					num1=0;
					num2=0;
					op=0;
					endresult=0;
					clickdeng=false;
					break;
				}
			    else{
			    switch(op){
				case 1:
					num1 = num1 +Double.valueOf(myStringjian);
					break;
				case 2:
					num1 = num1-Double.valueOf(myStringjian);
					break;
				case 3:
					num1 = num1*Double.valueOf(myStringjian);
					break;
				case 4:
					num1 = num1/Double.valueOf(myStringjian);
					break;
					default:
						num1 = Double.valueOf(myStringjian);
						break;
				}
			    text_01.setText("");
				clickdeng=false;
				op=2;
				break;
			    }
		case R.id.chengyu:
			String myStringcheng=text_01.getText().toString();
				if(myStringcheng.equals("")){
					text_01.setText("²Ù×÷Ê§Îó");
					num1=0;
					num2=0;
					op=0;
					endresult=0;
					clickdeng=false;
					break;
				}
				else{
			    switch(op){
				case 1:
					num1 = num1 +Double.valueOf(myStringcheng);
					break;
				case 2:
					num1 = num1-Double.valueOf(myStringcheng);
					break;
				case 3:
					num1 = num1*Double.valueOf(myStringcheng);
					break;
				case 4:
					num1 = num1/Double.valueOf(myStringcheng);
					break;
					default:
						num1 = Double.valueOf(myStringcheng);
						break;
				}
			    text_01.setText(" ");
				clickdeng=false;
				op=3;
				break;
				}
		case R.id.chuyu:
			String myStringchu=text_01.getText().toString();
				if(myStringchu.equals("")){
					 num1=0;
					 text_01.setText("²Ù×÷Ê§Îó");
						num1=0;
						num2=0;
						op=0;
						endresult=0;
						 clickdeng=false;
                         break;
				}
				else{
				switch(op){
				case 1:
					num1 = num1 +Double.valueOf(myStringchu);
					break;
				case 2:
					num1 = num1-Double.valueOf(myStringchu);
					break;
				case 3:
					num1 = num1*Double.valueOf(myStringchu);
					break;
				case 4:
					num1 = num1/Double.valueOf(myStringchu);
					break;
					default:
						num1 = Double.valueOf(myStringchu);
						break;
						}
				 	text_01.setText("");
				    op=4;
				    clickdeng=false;
				    break;
				}
		case R.id.dengyu:
			String myStringdeng=text_01.getText().toString();
			text_01.setText("");
			if(myStringdeng.equals("")){
				 num1=0;
				 text_01.setText("²Ù×÷Ê§Îó");
					num1=0;
					num2=0;
					op=0;
					endresult=0;
					 clickdeng=false;
                     break;
			}
			else{
			num2 = Double.valueOf(myStringdeng);
			switch(op){
			case 1:
				endresult = num1 +num2;
				break;
			case 2:
				endresult = num1-num2;
				break;
			case 3:
				endresult = num1*num2;
				break;
			case 4:
				endresult = num1/num2;
				break;
				default:
					endresult =num2;
					break;
			}
			text_01.setText(String.valueOf(endresult));
			endresult=0;
			num1=0;
			num2=0;
			op=0;
			clickdeng=true;
			break;
			}
		default:
			text_01.setText("³öÏÖbug!!");
			break;
	}	
    }
     }
}
	

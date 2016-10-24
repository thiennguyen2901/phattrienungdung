package com.example.calculator1;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity{

	@Override
	public void onBackPressed() {// sự kiện nút back
		// TODO Auto-generated method stub
		doThoat();
		//super.onBackPressed();
	}
	
	TextView txtscreenAns, txtscreenMath;
	Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btnC, btnCong, btnTru, btnNhan, btnChia, btnDauPhay, btnDel, btnAmDuong, btnBang;
	String strMath="";
	Boolean bCo = false, bCo2 = false, bCoDauPhay=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getControls();// khởi tạo các controls
		addEvent();// add sự kiện cho các button với sự kiện onclick
		
	}
	private void getControls(){
		txtscreenMath = (TextView) findViewById(R.id.txtMath);
		txtscreenAns = (TextView) findViewById(R.id.txtAns);
		bt0 = (Button) findViewById(R.id.btn0);
		bt1 = (Button) findViewById(R.id.btn1);		
		bt2 = (Button) findViewById(R.id.btn2);
		bt3 = (Button) findViewById(R.id.btn3);		
		bt4 = (Button) findViewById(R.id.btn4);		
		bt5 = (Button) findViewById(R.id.btn5);	
		bt6 = (Button) findViewById(R.id.btn6);		
		bt7 = (Button) findViewById(R.id.btn7);		
		bt8 = (Button) findViewById(R.id.btn8);		
		bt9 = (Button) findViewById(R.id.btn9);
		btnC = (Button) findViewById(R.id.btnC);
		btnCong = (Button) findViewById(R.id.btnCong);
		btnTru = (Button) findViewById(R.id.btnTru);
		btnNhan = (Button) findViewById(R.id.btnNhan);
		btnChia = (Button) findViewById(R.id.btnChia);
		btnDauPhay = (Button) findViewById(R.id.btnPhay);
		btnDel = (Button) findViewById(R.id.btnDel);
		btnAmDuong = (Button) findViewById(R.id.btnAmDuong);
		btnBang = (Button) findViewById(R.id.btnBang);
		
	}
	private void addEvent(){
		bt0.setOnClickListener(new ProcessMyEvent());
		bt1.setOnClickListener(new ProcessMyEvent());
		bt2.setOnClickListener(new ProcessMyEvent());
		bt3.setOnClickListener(new ProcessMyEvent());
		bt4.setOnClickListener(new ProcessMyEvent());
		bt5.setOnClickListener(new ProcessMyEvent());
		bt6.setOnClickListener(new ProcessMyEvent());
		bt7.setOnClickListener(new ProcessMyEvent());
		bt8.setOnClickListener(new ProcessMyEvent());
		bt9.setOnClickListener(new ProcessMyEvent());
		btnC.setOnClickListener(new ProcessMyEvent());
		btnCong.setOnClickListener(new ProcessMyEvent());
		btnTru.setOnClickListener(new ProcessMyEvent());
		btnNhan.setOnClickListener(new ProcessMyEvent());
		btnChia.setOnClickListener(new ProcessMyEvent());
		btnDauPhay.setOnClickListener(new ProcessMyEvent());
		btnDel.setOnClickListener(new ProcessMyEvent());
		btnAmDuong.setOnClickListener(new ProcessMyEvent());
		btnBang.setOnClickListener(new ProcessMyEvent());
		
		
		
	}
	private class ProcessMyEvent implements OnClickListener
	{
		@Override
		public void onClick(View arg0) {
			try {
				
			
					switch (arg0.getId()) {
					case R.id.btn0:
						// code
						bCo=false;
						bCo2=false;
						strMath +="0";
						ShowMath(strMath);
						break;
					case R.id.btn1:
						// code
						bCo=false;
						bCo2=false;
						strMath +="1";
						ShowMath(strMath);
						break;
					case R.id.btn2:
						// code
						bCo=false;
						bCo2=false;
						strMath +="2";
						ShowMath(strMath);
						break;
					case R.id.btn3:
						// code
						bCo=false;
						bCo2=false;
						strMath +="3";
						ShowMath(strMath);
						break;
					case R.id.btn4:
						// code
						bCo=false;
						bCo2=false;
						strMath +="4";
						ShowMath(strMath);
						break;
					case R.id.btn5:
						// code
						bCo=false;
						bCo2=false;
						strMath +="5";
						ShowMath(strMath);
						break;
					case R.id.btn6:
						// code
						bCo=false;
						bCo2=false;
						strMath +="6";
						ShowMath(strMath);
						break;
					case R.id.btn7:
						// code
						bCo=false;
						bCo2=false;
						strMath +="7";
						ShowMath(strMath);
						break;
					case R.id.btn8:
						// code
						bCo=false;
						bCo2=false;
						strMath +="8";
						ShowMath(strMath);
						break;
					case R.id.btn9:
						// code
						bCo=false;
						bCo2=false;
						strMath +="9";
						ShowMath(strMath);
						break;
					case R.id.btnC:
						// code
						bCo=false;
						bCo2=false;
						bCoDauPhay=false;
						strMath ="";
						ShowMath(strMath);
						txtscreenAns.setText("");
						break;
					case R.id.btnCong:
						// code
						bCoDauPhay=false;
						if(!KT1()){// KT1 là hàm kiểm tra ký tự nhập đầu tiên có phải là phép tính ko. nếu đúng là phép tính thì ko cho nhập
							if(bCo2 ==true){// kiểm tra có phải ký tự vừa nhập trước đó phải là phép tính không. nếu phải thì thay thế phép tính đó bằng phép tính hiện tại.
								Replace(" + ");// hàm thay thế ký tự phép tính cuối chuỗi
								ShowMath(strMath);
								if(bCo==false){// kiểm tra xem phép tính nhập lần thứ mấy. nếu lần thứ 1 thì cho nhập.
									strMath +=" + ";
									ShowMath(strMath);
									bCo=true;//sau khi nhập phép tính vào thì bật cờ của phép tính đó lên.
									bCo2=true;// bật cờ báo hiệu là ký tự cuối vừa nhập là 1 phép tính
								}
								
							}else{// kiểm tra có phải ký tự vừa nhập trước đó phải là phép tính không. nếu không phải thì nhập vào phép tính hiện tại.
								if(bCo==false){
									strMath +=" + ";
									ShowMath(strMath);
									bCo=true;
									bCo2=true;
								}
							}
						}
						break;
					case R.id.btnTru:
						// code
						bCoDauPhay=false;
						if(!KT1()){// KT1 là hàm kiểm tra ký tự nhập đầu tiên có phải là phép tính ko. nếu đúng là phép tính thì ko cho nhập
							if(bCo2 ==true){// kiểm tra có phải ký tự vừa nhập trước đó phải là phép tính không. nếu phải thì thay thế phép tính đó bằng phép tính hiện tại.
								Replace(" - ");// hàm thay thế ký tự phép tính cuối chuỗi
								ShowMath(strMath);
								if(bCo==false){// kiểm tra xem phép tính nhập lần thứ mấy. nếu lần thứ 1 thì cho nhập.
									strMath +=" - ";
									ShowMath(strMath);
									bCo=true;//sau khi nhập phép tính vào thì bật cờ của phép tính đó lên.
									bCo2=true;// bật cờ báo hiệu là ký tự cuối vừa nhập là 1 phép tính
								}
								
							}else{// kiểm tra có phải ký tự vừa nhập trước đó phải là phép tính không. nếu không phải thì nhập vào phép tính hiện tại.
								if(bCo==false){
									strMath +=" - ";
									ShowMath(strMath);
									bCo=true;
									bCo2=true;
								}
							}
						}
						break;
					case R.id.btnNhan:
						// code
						bCoDauPhay=false;
						if(!KT1()){// KT1 là hàm kiểm tra ký tự nhập đầu tiên có phải là phép tính ko. nếu đúng là phép tính thì ko cho nhập
							if(bCo2 ==true){// kiểm tra có phải ký tự vừa nhập trước đó phải là phép tính không. nếu phải thì thay thế phép tính đó bằng phép tính hiện tại.
								Replace(" x ");// hàm thay thế ký tự phép tính cuối chuỗi
								ShowMath(strMath);
								if(bCo==false){// kiểm tra xem phép tính nhập lần thứ mấy. nếu lần thứ 1 thì cho nhập.
									strMath +=" x ";
									ShowMath(strMath);
									bCo=true;//sau khi nhập phép tính vào thì bật cờ của phép tính đó lên.
									bCo2=true;// bật cờ báo hiệu là ký tự cuối vừa nhập là 1 phép tính
								}
								
							}else{// kiểm tra có phải ký tự vừa nhập trước đó phải là phép tính không. nếu không phải thì nhập vào phép tính hiện tại.
								if(bCo==false){
									strMath +=" x ";
									ShowMath(strMath);
									bCo=true;
									bCo2=true;
								}
							}
						}
						break;
					case R.id.btnChia:
						// code
						bCoDauPhay=false;
						if(!KT1()){// KT1 là hàm kiểm tra ký tự nhập đầu tiên có phải là phép tính ko. nếu đúng là phép tính thì ko cho nhập
							if(bCo2 ==true){// kiểm tra có phải ký tự vừa nhập trước đó phải là phép tính không. nếu phải thì thay thế phép tính đó bằng phép tính hiện tại.
								Replace(" ÷ ");// hàm thay thế ký tự phép tính cuối chuỗi
								ShowMath(strMath);
								if(bCo==false){// kiểm tra xem phép tính nhập lần thứ mấy. nếu lần thứ 1 thì cho nhập.
									strMath +=" ÷ ";
									ShowMath(strMath);
									bCo=true;//sau khi nhập phép tính vào thì bật cờ của phép tính đó lên.
									bCo2=true;// bật cờ báo hiệu là ký tự cuối vừa nhập là 1 phép tính
								}
								
							}else{// kiểm tra có phải ký tự vừa nhập trước đó phải là phép tính không. nếu không phải thì nhập vào phép tính hiện tại.
								if(bCo==false){
									strMath +=" ÷ ";
									ShowMath(strMath);
									bCo=true;
									bCo2=true;
								}
							}
						}
						break;
					case R.id.btnPhay:
						// code
						bCo=false;
						bCo2=false;
						
						if(KT1()){// kiểm tra coi nó nhập đầu tiên. nếu nhập đầu tiên thì thêm là 0. ( khong cham)
							if(bCoDauPhay==true){
								//strMath=strMath.substring(0, strMath.length());//thay thế lại ký tự chấm
								ShowMath(strMath);
							}else {
								strMath +="0.";
								ShowMath(strMath);
								bCoDauPhay=true;
							}
							
						}else {
							if(bCoDauPhay==true){
								//strMath=strMath.substring(0, strMath.length()-1)+ ".";//thay thế lại ký tự chấm
								ShowMath(strMath);
							}else {
								strMath +=".";
								ShowMath(strMath);
								bCoDauPhay=true;
							}
							
						}
						
						break;
					case R.id.btnAmDuong:
						// code
						bCo=false;
						bCo2=false;
						strMath +="-";
						ShowMath(strMath);
						break;
					case R.id.btnDel:
						// code
							if(!strMath.equals("")){
								strMath = strMath.substring(0,strMath.length()-1);
								ShowMath(strMath);
								/*if(KT2()){
									//bCo=true;
									//Toast.makeText(MainActivity.this, "chuỗi:" , Toast.LENGTH_SHORT).show();
									bCo2= true;
								}else {
									bCo= bCo2 = false;
									//Toast.makeText(MainActivity.this, "abc" , Toast.LENGTH_SHORT).show();
								}*/
							}else {
								strMath="";
								//ShowMath(strMath);
								
							}					
						break;
					case R.id.btnBang:
						// code
						bCo=false;
						bCo2=false;
						bCoDauPhay=false;
						//TinhKetQua();
						if(strMath!=""){
							txtscreenAns.setText("= " + TinhKetQua().toString());
						}
						break;
					}
			} catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(MainActivity.this, "Lỗi chưa xác định", Toast.LENGTH_LONG).show();
				txtscreenAns.setText("= Math ERROR!");
			}
		}

	}
	
	
	
	
	//xử lý menu--start
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId()) {
		case R.id.action_about:
			Intent intent = new Intent(MainActivity.this, About.class);
			startActivity(intent);
			break;
		case R.id.action_exit:
			doThoat();// gọi hàm xử lý nút thoát
			break;

		}
		return super.onOptionsItemSelected(item);
		
	}
	//xu lý menu -- end
	//hàm xử lý menu thoát--start
	private void doThoat()
	{
		AlertDialog.Builder builder=new AlertDialog.Builder(this);
		builder.setTitle("Thoát chương trình ");
		builder.setIcon(R.drawable.warning_48);
		builder.setMessage("Muốn thoát chương trình này ?");
		builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		});
		builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				finish();
			}
		});
		builder.create().show();
	}
	//hàm xử lý menu thoát-- end
	// hàm ghi phép toán lên màn hình android--start
	private void ShowMath(String strMath){
		txtscreenMath.setText(strMath);
	}
	// hàm ghi phép toán lên màn hình android--end
	//hàm kiểm tra nhập ký tự  +-*/ ngay tu đầu --start
	private Boolean KT1(){
		if(strMath==""){
			return true;
		}else {
			return false;
		}

	}
	//hàm kiểm tra nhập ký tự  +-*/ ngay tu đầu --end
	//hàm kiểm tra nhập ký tự  +-*/ >1 lần liên tiếp --start
	/*private Boolean KT2(){
		//StringBuffer buffer = new StringBuffer(strMath);
		//str1.trim();
		//Toast.makeText(MainActivity.this, "chuỗi:" + str1 , Toast.LENGTH_SHORT).show();
		String kt = strMath.substring(strMath.length()-1, strMath.length());
		//Toast.makeText(MainActivity.this, "chuỗi:" + kt , Toast.LENGTH_SHORT).show();
		if(kt=="+"){
			//Toast.makeText(MainActivity.this, "kt" , Toast.LENGTH_SHORT).show();
			return true;
		}else {
			return false;
		}
	
	}*/
	//hàm kiểm tra nhập ký tự  +-*/ > 1 lần liên tiếp --end
	private void Replace(String str){
		strMath=strMath.substring(0, strMath.length()-3)+ str;

	}
	private Double TinhKetQua(){
		String Mang[];
		double dKetQua = 0, temp = 1;
		Mang = strMath.split(" ");
		temp = Double.parseDouble(Mang[0]);
		// thuật giải này tham khảo tại đây : http://stackoverflow.com/questions/10280263/how-do-a-simple-calculator-in-android-how-to-do-it-using-buttons-and-single-edi
		/*-- NỘI DUNG CÁCH TÍNH 1 CHUỖI
		 * 2 * 4 + 3 + 5 * 2 * 3 - 1 + 2
			initially final result = 0, buffer = 1
			
			2 -> result = 0, buffer = 2 (careful here, I interpreted the initial step as *2)
			
			* 4 -> result = 0, buffer = (2*4) = 8
			+ 3 -> result = (0+8) = 8, buffer = 3
			+ 5 -> result = (8+3) = 11, buffer = 5
			* 2 -> result = 11, buffer = (5*2) = 10
			* 3 -> result = 11, buffer = (10*3) = 30
			- 1 -> result = (11+30) = 41, buffer = -1
			+ 2 -> result = (41-1) = 40, buffer = 2
			-> finally (e.g. when pressing =) add both together: Answer = 42
		 */
		for(int i=1; i<Mang.length; i++){
			if(Mang[i].equals("x")){
				//dKetQua =dKetQua;
				temp = temp*Double.parseDouble(Mang[i+1]);
				//i++;
				//Toast.makeText(MainActivity.this, "chuỗi:" + Mang.length , Toast.LENGTH_SHORT).show();
			}
			if(Mang[i].equals("÷")){
				//dKetQua =dKetQua;
				temp = temp/Double.parseDouble(Mang[i+1]);
				//i++;
				//Toast.makeText(MainActivity.this, "chuỗi:" + Mang.length , Toast.LENGTH_SHORT).show();
			}
			if(Mang[i].equals("+")){
				dKetQua = temp + dKetQua;
				temp = Double.parseDouble(Mang[i+1]);
				//i++;
			}
			if(Mang[i].equals("-")){
				dKetQua = temp+dKetQua;
				temp = -Double.parseDouble(Mang[i+1]);
				//++;
			}
		}
		return dKetQua+temp;
		
	}

}
